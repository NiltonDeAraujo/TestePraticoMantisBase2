#language:pt
@logar
Funcionalidade: Login
  Contexto: aciono o comando entrar

  Cenário: Realizar login com campos obrigatórios
    Dado que estou no portal mantis bug tracker
    Quando informo o usuario
    E aciono o comando entrar
    Quando informo a senha
    E aciono o comando entrar apos senha
    Entao e apresentado a pagina minha visao
