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
                sh "./gradlew -Dskip.tests build"
            }
        }
        stage('Test') {
            steps {
                sh "./gradlew test"
            }
        }
        stage('SonarQube') {
           steps {
               sh "./gradlew sonarqube
		   -Dsonar.projectKey=org.epam.esm:jenkinstask
		   -Dsonar.host.url=http://127.0.0.1:9000 
		   -Dsonar.login=f3fa9b42269249a12ef08010a4a969c9eca0ac87"
           }
        }
    }
}
