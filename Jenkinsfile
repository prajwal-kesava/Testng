pipeline{
agent any
stages{
 	stage('Compile stage'){
 		steps{
   			withMaven(maven:'Apache Maven 3.6.1')
   			{
   				sh 'mvn clean compile'
   			}
 		}
 	}
 	stage('Testing stage'){
 		steps{
 			withMaven(maven:'Apache Maven 3.6.1')
 			{
 			sh 'mvn test'
 			}
		 }
 	}
 	stage('INSTALLING stage'){
 		steps{
 			withMaven(maven:'Apache Maven 3.6.1')
 			{
	 			sh 'mvn install'
	 		}
 	  	}
 	  }
 	}
}