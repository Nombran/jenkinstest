pipeline {
    agent any

    stages {
    	stage('Checkout') {
    	    steps {
    		 checkout scm 
            }
    	}
        stage('Build') {
            steps {
                sh "./gradlew build"
            }
        }
        stage('Test') {
            steps {
                sh "./gradlew test"
            }
        }
    }
}

def gradle(command) {
    sh "./gradlew ${command}"
}
