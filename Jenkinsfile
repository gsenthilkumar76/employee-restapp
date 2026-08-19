pipeline {
    agent any
    tools {
        maven "MAVEN_HOME"
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/gsenthilkumar76/employee-restapp']])
                sh "mvn clean install"
            }
        }
        stage('Build Image') {
            steps {
                script {
                    sh 'docker build -t gsenthilkumar/employee-app .'
                }
            }
        }
        stage('push the docker image') {
            steps {
                script {
                    withCredentials([string(credentialsId: '7ae04505-54de-4ea9-9f92-1c04c71201b2', variable: 'docker_pwd')]) {
                        sh 'echo "$docker_pwd" | docker login --username gsenthilkumar --password-stdin'
                    }
                    sh 'docker push gsenthilkumar/employee-app'
                }
            }
        }
    }
}
