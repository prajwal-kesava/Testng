pipeline{
agent any

tools {
        maven 'Maven 3.6.1'
        jdk 'jdk1.8.0_201'
    }
stages{
 	stage('Compile stage'){
 		steps{
   			
   			
   				sh 'mvn clean compile'
   			
 		}
 	}
 	stage('Testing stage'){
 		steps{
 			
 			
 			sh 'mvn test'
 			
		 }
 	}
 	
 	}
}