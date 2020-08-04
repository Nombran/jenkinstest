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
                gradle 'build'
            }
        }
        stage('Test') {
            steps {
                gradle 'test'
            }
        }
    }
}

def gradle(command) {
    sh "./gradlew ${command}"
}
