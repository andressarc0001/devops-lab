import { useOidc } from "oidc-spa/react"

function App() {
  const { isUserLoggedIn, login, logout, oidcTokens } = useOidc()

  if (!isUserLoggedIn) {
    return (
      <div style={{ padding: "2rem", fontFamily: "sans-serif" }}>
        <h1>🚀 DevOps Lab</h1>
        <p>Você não está autenticado!</p>
        <button onClick={() => login({ doesCurrentHrefRequiresAuth: false })}>
          Fazer Login
        </button>
      </div>
    )
  }

  return (
    <div style={{ padding: "2rem", fontFamily: "sans-serif" }}>
      <h1>🚀 DevOps Lab</h1>
      <p>✅ Bem vinda, {oidcTokens.decodedIdToken.name}!</p>
      <p>📧 Email: {oidcTokens.decodedIdToken.email}</p>
      <button onClick={() => logout({ redirectTo: "home" })}>
        Fazer Logout
      </button>
    </div>
  )
}

export default App