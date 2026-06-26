 DevOps Lab <3

Laboratorio DevOps completo com Spring Boot, Docker, GitLab, Jenkins, Harbor, ArgoCD e Kubernetes.

Arquitetura


Dev push para GitLab, Jenkins faz build e test, imagem vai para Registry, ArgoCD detecta mudanca e faz deploy no Kubernetes.

Tecnologias


- Java 25 + Spring Boot 4 - API REST
- Gradle Groovy - build tool
- Docker + Docker Compose - containerizacao
- GitLab - repositorio + GitFlow + Merge Requests
- Jenkins - pipeline CI/CD com Jenkinsfile
- Docker Registry - registry de imagens
- ArgoCD - GitOps e deploy automatico
- Kubernetes - orquestracao de containers

Como rodar

docker-compose up -d

Acessar a aplicacao: http://localhost:8085/hello
Acessar Jenkins: http://localhost:8090
Acessar GitLab: http://localhost:8091

 Estrutura

src/ - Codigo Spring Boot
k8s/ - Manifests Kubernetes
Dockerfile - Imagem Docker
docker-compose.yml - Todos os servicos
Jenkinsfile - Pipeline CI/CD
"@ | Set-Content -Path README.md -Encoding ASCII
