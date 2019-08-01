pipeline{
agent any
stages{
 	
 	stage('Testing stage'){
 		steps{
 			withMaven(maven:'maven')
 			{
 			sh 'mvn test'
 			}
		 }
 	}
 	stage('INSTALLING stage'){
 		steps{
 			withMaven(maven:'maven')
 			{
	 			sh 'mvn install'
	 		}
 	  	}
 	  }
 	}
}