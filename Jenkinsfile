pipeline {
    agent any

    environment {
        GITHUB_URL = "https://github.com/vantuongit/TuongVV_Jwt_project4.git"
        GITHUB_CREDETIALS = credentials("github-vantuongit")
        BRANCH = "main"
    }

    stages {
        stage("Clone Code") {
            steps {
                git url: "${GITHUB_URL}",
                        branch: "${BRANCH}",
                        credentialsId: "${GITHUB_URL}"
            }
        }
        stage("Build") {
            steps {
                sh "mvn clean install"
            }
            post {
                always {
                    junit "target/surefire-reports/*.xml"
                }
            }
        }
    }
}
