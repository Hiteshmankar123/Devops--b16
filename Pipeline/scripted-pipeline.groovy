node {  
    stage('Pull') { 
        git 'https://github.com/Hiteshmankar123/Devops--b16.git'
    }
    stage('Build') { 
        echo 'Build successful'
    }
    stage('Test') { 
        echo 'Test successful'
    }
    stage('Deploy') { 
        echo 'Deploy successful'
    }
}
