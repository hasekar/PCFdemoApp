pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                gradle clean
                gradle build
            }
        }
    }
}
