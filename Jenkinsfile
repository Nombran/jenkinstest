def gradle(command) {
    sh "./gradlew ${command}"
}

pipeline {
    agent any

    stages {
    	stage('checkout') {
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
