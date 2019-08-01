pipeline{
agent any
stages{
 	stage('Compile stage'){
 		steps{
   			withMaven(maven:'maven_3_6_1')
   			{
   				sh 'mvn clean compile'
   			}
 		}
 	}
 	stage('Testing stage'){
 		steps{
 			withMaven(maven:'maven_3_6_1')
 			{
 			sh 'mvn test'
 			}
		 }
 	}
 	stage('INSTALLING stage'){
 		steps{
 			withMaven(maven:'maven_3_6_1')
 			{
	 			sh 'mvn install'
	 		}
 	  	}
 	  }
 	}
}