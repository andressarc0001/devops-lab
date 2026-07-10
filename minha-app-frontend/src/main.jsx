import { createOidcProvider } from "oidc-spa/react"
import { createRoot } from "react-dom/client"
import App from "./App.jsx"

const { OidcProvider } = createOidcProvider({
  issuerUri: "http://localhost:8180/realms/devops-lab",
  clientId: "minha-app",
  publicUrl: "http://localhost:5173"
})

createRoot(document.getElementById("root")).render(
  <OidcProvider
    fallback={<div>Carregando autenticação...</div>}
  >
    <App />
  </OidcProvider>
)