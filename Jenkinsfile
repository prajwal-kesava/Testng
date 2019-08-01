
node{
	stage('SCM checkout'){
		git 'https://github.com/prajwal-kesava/Testng'
	}
	stage('install'){
		sh 'mvn clean install'
	}
}
		
