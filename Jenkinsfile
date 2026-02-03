pipeline
{
agent any

environment{
	IMAGE_NAME="mahendrasimha0403/spring_maven"
	DOCKERHUB_CREDENTIALS=credentials('dockerhub')
}
stages
{
stage('Checkout Code')
{
steps
{
	git branch:'main',
		url:'git@github.com:mahendrasimhars-0402/spring_maven.git'
}
}
stage('build Maven')
{
steps
{
	sh 'mvn clean package'
}
}
stage('Build Docker Image')
{
steps
{
script
{
	def dockerImage=docker.build("${IMAGE_NAME}:latest")
}
}
}
stage('Push to DockerHub')
{
steps
{
script
{
	docker.withRegistry('https://index.docker.io/v1/',DOCKERHUB_CREDENTIALS){
	dockerImage.push()
}
}
}
}
}
post{
success{
	echo "Pipeline built successfully"
}
failure
{
	echo "Pipeline built failed"
}
}
}
