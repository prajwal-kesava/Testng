pipeline{
agent any
stages{
 	
 	stage('Testing stage'){
 		steps{
 			withMaven(maven:'maven',jdk:'java 1.8.0_201 ')
 			{
 			sh 'mvn test'
 			}
		 }
 	}
 	stage('INSTALLING stage'){
 		steps{
 			withMaven(maven:'maven',jdk:'java 1.8.0_201 ')
 			{
	 			sh 'mvn install'
	 		}
 	  	}
 	  }
 	}
}