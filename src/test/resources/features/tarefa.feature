#language:pt
@cadastro
Funcionalidade: Cadastrar tarefa no mantis

  @cadastrobasico
  Cenario: Criar nova tarefa somente com os campos obrigatorios
    Dado que estou logado "nilton.araujo","N!L2602842020"
    E acesso o menu criar tarefa
    Quando seleciono o projeto
    E o campo resumo estiver preenchido
    E o campo descricao estiver preenchido
    Entao a tarefa deve ser cadastrada

  @cadastrocompleto
  Cenario: Criar nova tarefa preenchendo todos os campos
    Dado que estou logado "nilton.araujo","N!L2602842020"
    E acesso o menu criar tarefa
    Quando seleciono o projeto

    E o campo frequencia estiver preenchido
    E o campo gravidade estiver preenchido
    E o campo prioridade estiver preenchido
    E o campo perfil estiver preenchido
    E o campo resumo estiver preenchido
    E o campo descricao estiver preenchido
    E o campo passos_para_reproduzir estiver preenchido
    E o campo informacoes_adicionais estiver preenchido
    E o campo marcadores estiver preenchido
    Entao a tarefa deve ser cadastrada