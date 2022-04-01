node {  
    stage('Pull') { 
        git 'https://github.com/Hiteshmankar123/Devops--b16.git'
    }
    stage('Build') { 
        echo 'B'
    }
    stage('Test') { 
        //
    }
    stage('Deploy') { 
        // 
    }
}
