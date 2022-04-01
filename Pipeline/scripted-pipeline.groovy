pipeline {
    agent any 
    stages {stage('Pull') { 
            steps {
               echo 'Pull successful'
            }
        }
        stage('Build') { 
            steps {
              echo 'Build successful' 
            }
        }
        stage('Test') { 
            steps {
               echo 'Test successful'
            }
        }
        stage('Deploy') { 
            steps {
              echo 'Deploy successful'
            }
        }
    }