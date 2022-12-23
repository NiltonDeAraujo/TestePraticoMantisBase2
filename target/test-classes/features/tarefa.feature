#language:pt

  @tarefa
Funcionalidade: Tarefa

  @cadastroTarefa
  Cenario: Criar nova Tarefa
    Dado que estou logado
    Quando os campos estiverem preenchidos com
    |plataforma                     |pc                         |
    |so                             |win                        |
    |versao so                      |10                         |
    |resumo                         |Lorem ipsum dolor sit amet.|
    |descricao                      |Lorem ipsum dolor sit amet.|
    |passo para reproduzir          |Lorem ipsum dolor sit amet.|
    |inf. adicionais                |print em anexo             |
    Entao a tarefa deve ser cadastrada