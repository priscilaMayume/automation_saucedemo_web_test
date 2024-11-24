#language: pt
Funcionalidade: testes de login

  Cenario: Fazer login com sucesso com user standard_user
    Dado que abrir navegador com sucesso
    Quando esperar a abertura da Pg principal
    Entao deve esperar o elemento de title
    E deve escrever login valido
    E deve escrever psw valida
    E deve clicar em loginButton
    E deve verificar pagina produtos
    E deve fechar o navegador

  Cenario: Fazer login e logout com sucesso com user standard_user
    Dado que abrir navegador com sucesso
    Quando esperar a abertura da Pg principal
    Entao deve esperar o elemento de title
    E deve escrever login valido
    E deve escrever psw valida
    E deve clicar em loginButton
    E deve verificar pagina produtos
    E deve fazer logout
    E deve verificar pagina login
    E deve fechar o navegador





