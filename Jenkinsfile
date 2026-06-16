pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Compilando o projeto...'
                sh './gradlew build -x test'
            }
        }

        stage('Test') {
            steps {
                echo 'Rodando os testes...'
                sh './gradlew test'
            }
        }

        stage('Docker Build') {
            steps {
                echo 'Criando imagem Docker...'
                sh 'docker build -t minha-app:latest .'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Fazendo deploy...'
                sh 'docker-compose up -d'
            }
        }
    }

    post {
        success {
            echo 'Pipeline executado com sucesso!'
        }
        failure {
            echo 'Pipeline falhou!'
        }
    }
}
