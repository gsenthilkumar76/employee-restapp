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
    }
}
