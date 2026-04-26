pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/lukeoaktree/jenkins-node-app.git'
            }
        }
        stage('Build JAR') {
            steps {
                // Using 'sh' before mvnw bypasses the permission issues 
                sh 'sh mvnw clean package -DskipTests'
            }
        }
        stage('Push to Nexus') {
            steps {
                echo 'Building and pushing to Nexus...'
            }
        }
    }
}

