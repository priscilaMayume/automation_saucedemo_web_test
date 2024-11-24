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

  Cenario: Fazer login INVALIDO com user locked_out_user
    Dado que abrir navegador com sucesso
    Quando esperar a abertura da Pg principal
    Entao deve esperar o elemento de title
    E deve escrever login lockedOutUser
    E deve escrever psw valida
    E deve clicar em loginButton
    E deve verificar mensagem de erro
    E deve fechar o navegador

  Cenario: Fazer login e logout com sucesso com user problem_user
    Dado que abrir navegador com sucesso
    Quando esperar a abertura da Pg principal
    Entao deve esperar o elemento de title
    E deve escrever login problemUser
    E deve escrever psw valida
    E deve clicar em loginButton
    E deve verificar pagina produtos
    E deve fazer logout
    E deve verificar pagina login
    E deve fechar o navegador

  Cenario: Fazer login sucesso com user performance_glitch_user
    Dado que abrir navegador com sucesso
    Quando esperar a abertura da Pg principal
    Entao deve esperar o elemento de title
    E deve escrever login performanceGlitchUser
    E deve escrever psw valida
    E deve clicar em loginButton
    E deve verificar pagina produtos
    E deve fechar o navegador

  Cenario: Fazer login e logout com sucesso com user error_user
    Dado que abrir navegador com sucesso
    Quando esperar a abertura da Pg principal
    Entao deve esperar o elemento de title
    E deve escrever login errorUser
    E deve escrever psw valida
    E deve clicar em loginButton
    E deve verificar pagina produtos
    E deve fazer logout
    E deve verificar pagina login
    E deve fechar o navegador

  Cenario: Fazer login e logout com sucesso com user visual_user
    Dado que abrir navegador com sucesso
    Quando esperar a abertura da Pg principal
    Entao deve esperar o elemento de title
    E deve escrever login visualUser
    E deve escrever psw valida
    E deve clicar em loginButton
    E deve verificar pagina produtos
    E deve fazer logout
    E deve verificar pagina login
    E deve fechar o navegador