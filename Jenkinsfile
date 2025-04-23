pipeline{
    agent any
    stage{
        stage('Checkout'){
            steps{
               git branch: 'master', url: 'https://github.com/yeonghongz0903/hello-world-java.git'
            }
        }
        stage('Build'){
            steps{
                bat 'start gradlew build'
            }
        }
        stage('Test'){
            steps{
               bat'start gradlew test'
            }
        }
        stage('Deploy'){
            steps{
                powershell 'java -jar build/libs/hello-world-java-V1.jar'
            }
        }
    }
    post{
        always{
            echo 'Cleaning up...'
            deleteDir()
        }
        success{
            echo 'Build successful!'
        }
        failure{
            echo 'Build failed.'
        }
    }   
}
//bbbbbbbbbbb