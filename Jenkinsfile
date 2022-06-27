pipeline {
    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11' 
            args '-v ./.m2:./.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn test -Dcucumber.options="--tags @Search-Cars"' 
            }
        }
    }
}
