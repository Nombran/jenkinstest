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
                sh "./gradlew build -x test"
            }
        }
        stage('Test') {
            steps {
                sh "./gradlew test"
            }
        }
        stage('SonarQube analysis') {
           steps {
               script {
                   withSonarQubeEnv('SonarQube') {
                        sh "./gradlew sonarqube -Dsonar.projectKey=org.epam.esm:jenkinstask -Dsonar.host.url=http://127.0.0.1:9000 -Dsonar.login=f3fa9b42269249a12ef08010a4a969c9eca0ac87"
                   }
               }
           }
        }
        stage("Quality Gate") {
            steps {
                timeout(time: 1, unit: 'HOURS') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }
}
