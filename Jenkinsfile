pipeline {

    agent any

    stages {

        stage('Clone Repository') {
            steps {
                git branch:'main',url:'https://github.com/AdityaK05/immutable-strings.git'
            }
        }

        stage('Check Java Version') {
            steps {
                sh 'java -version'
            }
        }

        stage('Check Maven Version') {
            steps {
                sh 'mvn -version'
            }
        }

        stage('Clean Project') {
            steps {
                sh 'mvn clean'
            }
        }

        stage('Compile Project') {
            steps {
                sh 'mvn compile'
            }
        }

        stage('Run Test Cases') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package Project') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Install Project') {
            steps {
                sh 'mvn install'
            }
        }

        stage('Run Application') {
            steps {
                sh 'java -cp target/classes com.example.App'
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar'
            }
        }
    }

    post {

        success {
            echo 'Pipeline Executed Successfully'
        }

        failure {
            echo 'Pipeline Failed'
        }

        always {
            echo 'Pipeline Execution Finished'
        }
    }
}
