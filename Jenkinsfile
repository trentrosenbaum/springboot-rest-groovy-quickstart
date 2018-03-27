pipeline {
    agent { docker { image 'gradle:4.6.0-jdk9' } }
    stages {
        stage('build') {
            steps {
                sh 'gradle --version'
            }
        }
    }
}
