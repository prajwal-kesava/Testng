
node{
	stage('SCM checkout'){
		git 'https://github.com/prajwal-kesava/Testng'
	}
	stage('install'){
		def mvnHome = tool name: 'maven', type: 'maven'
		sh "{mvnHome}/bin/mvn install"
	}
}
		
