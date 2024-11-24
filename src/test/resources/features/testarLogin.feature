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
    E deve verificar mensagem de erro lockedUser
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

  Cenario: Fazer login INVALIDO user standard_user com senha errada
    Dado que abrir navegador com sucesso
    Quando esperar a abertura da Pg principal
    Entao deve esperar o elemento de title
    E deve escrever login standardUser
    E deve escrever psw invalido
    E deve clicar em loginButton
    E deve verificar mensagem de psw invalido
    E deve fechar o navegador

  Cenario: Fazer login INVALIDO user locked_out_user com senha errada
    Dado que abrir navegador com sucesso
    Quando esperar a abertura da Pg principal
    Entao deve esperar o elemento de title
    E deve escrever login lockedOutUser
    E deve escrever psw invalido
    E deve clicar em loginButton
    E deve verificar mensagem de psw invalido
    E deve fechar o navegador

  Cenario: Fazer login INVALIDO user problem_user com senha errada
    Dado que abrir navegador com sucesso
    Quando esperar a abertura da Pg principal
    Entao deve esperar o elemento de title
    E deve escrever login problemUser
    E deve escrever psw invalido
    E deve clicar em loginButton
    E deve verificar mensagem de psw invalido
    E deve fechar o navegador

  Cenario: Fazer login INVALIDO user performance_glitch_user com senha errada
    Dado que abrir navegador com sucesso
    Quando esperar a abertura da Pg principal
    Entao deve esperar o elemento de title
    E deve escrever login performanceGlitchUser
    E deve escrever psw invalido
    E deve clicar em loginButton
    E deve verificar mensagem de psw invalido
    E deve fechar o navegador

  Cenario: Fazer login INVALIDO user error_user com senha errada
    Dado que abrir navegador com sucesso
    Quando esperar a abertura da Pg principal
    Entao deve esperar o elemento de title
    E deve escrever login errorUser
    E deve escrever psw invalido
    E deve clicar em loginButton
    E deve verificar mensagem de psw invalido
    E deve fechar o navegador

  Cenario: Fazer login INVALIDO user visual_user com senha errada
    Dado que abrir navegador com sucesso
    Quando esperar a abertura da Pg principal
    Entao deve esperar o elemento de title
    E deve escrever login visualUser
    E deve escrever psw invalido
    E deve clicar em loginButton
    E deve verificar mensagem de psw invalido
    E deve fechar o navegador

  #Cenario: Fechar todos os navegadores
    #E deve fechar todos os navegadores