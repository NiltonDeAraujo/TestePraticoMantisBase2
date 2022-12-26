#language:pt
@login
Funcionalidade: Realizar login na pagina do mantis

  @logarcomsucesso
  Cenário: Login com usuario valido
    Dado que estou no portal mantis bug tracker
    E informo o "nilton.araujo"
    E aciono o comando entrar
    Quando preencho o campo "N!L2602842020"
    E aciono o comando entrar apos senha
    Entao e apresentado a pagina minha visao

  @logarcomfalha
  Esquema do Cenário: Login com usuario invalido
    Dado que estou no portal mantis bug tracker
    Quando informo o "usuario" e informo a "senha"
    Entao e apresentado uma mensagem de erro

    Exemplos:
      | usuario | senha  |
      | nilton  | nilton |
      | admin   | admin  |
