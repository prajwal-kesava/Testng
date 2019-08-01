pipeline{
    agent any
    tools{
        maven 'maven'
        jdk 'java 1.8.0_201'
    }
        stages{
            stage('Initialize'){
                steps{
                bat '''
                    echo "PATH=%PATH%"
                    echo "M2_HOME=%M2_HOME%"
                    '''
            }
        }
            stage('Build'){ 
                steps{
                        bat 'mvn install'
            }

            }
           
        }
}
