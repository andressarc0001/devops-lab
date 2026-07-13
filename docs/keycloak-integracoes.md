# Integracoes Keycloak — Login DevOps Lab

## Como solicitar integracao

Para integrar um sistema ao Login DevOps Lab, o time de desenvolvimento deve fornecer:

- Protocolo: OpenID Connect (OIDC)
- Tipo de client: publico (frontend) ou privado (backend)
- URL do sistema: endereco de homologacao e producao
- Escopo de acesso: email, profile
- E-mail para contato

---

## Sistemas integrados

### Portal de Licitacoes
| | Frontend | Backend |
|---|---|---|
| Client ID | licitacoes-frontend | licitacoes-backend |
| Tipo | Publico | Privado |
| URL | http://localhost:5174 | http://localhost:8085 |
| Escopos | email, profile | email |
| Status | Integrado | Integrado |

### Sistema de RH
| | Frontend | Backend |
|---|---|---|
| Client ID | rh-frontend | rh-backend |
| Tipo | Publico | Privado |
| URL | http://localhost:5174 | http://localhost:8085 |
| Escopos | email, profile | email, profile |
| Status | Integrado | Integrado |

---

## Configuracoes para o dev

### Frontend React
const keycloak = new Keycloak({
  url: 'http://localhost:8180',
  realm: 'devops-lab',
  clientId: 'SEU_CLIENT_ID'
})

### Backend Spring Boot
spring.security.oauth2.resourceserver.jwt.issuer-uri=http://localhost:8180/realms/devops-lab
spring.security.oauth2.resourceserver.jwt.jwk-set-uri=http://localhost:8180/realms/devops-lab/protocol/openid-connect/certs

---

## Contatos
DevOps responsavel: Andressa Costa
E-mail: andressarc0001@gmail.com
