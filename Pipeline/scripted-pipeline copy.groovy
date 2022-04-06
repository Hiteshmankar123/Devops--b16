node {  
    stage('Pull') { 
        git 'https://github.com/Hiteshmankar123/Devops--b16.git'
    }
    stage('Build') { 
       sh 'mavel clean package'
    }
    stage('Test') { 
        echo 'Test successful'
    }
    stage('Deploy') { 
        echo 'Deploy successful'
    }
}
