package com.saucedemo.stepdefinitions;

import com.saucedemo.constantes.Constantes;
import com.saucedemo.dsl.Dsl;
import com.saucedemo.pages.LoginPage;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestesLoginStep {

    private WebDriver driver;
    private Dsl dsl;
    public Constantes constantes;
    public LoginPage loginPage;

    public WebDriver acessarWeb() {
        System.setProperty("webdriver.chrome.driver", constantes.PATH_CHROMEDRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(constantes.URL_SAUCEDEMO);
        dsl = new Dsl(driver);
        loginPage = new LoginPage(driver);

        return driver;
    }

    @Dado("^que abrir navegador com sucesso$")
    public void queAbrirNavegadorComSucesso() {
        driver = acessarWeb();
    }

    @Quando("^esperar a abertura da Pg principal$")
    public void esperarAAberturaDaPgPrincipal() {
        dsl.esperarCarregarPagina(Constantes.NUMERO_2);
    }

    @Entao("^deve esperar o elemento de title$")
    public void deveEsperarOElementoDeTitle() {
        dsl.verificarTitle();
    }


    @E("^deve escrever login valido$")
    public void deveEscreverLoginValido() {
        loginPage.setEscreverLogin(Constantes.STANDARD_USER);
    }

    @E("^deve escrever login performanceGlitchUser$")
    public void deveEscreverLoginPerformanceGlitchUser() {
        loginPage.setEscreverLogin(Constantes.PERFORMANCE_GLITCH_USER);
    }

    @E("^deve escrever login errorUser$")
    public void deveEscreverLoginErrorUser() {
        loginPage.setEscreverLogin(Constantes.ERROR_USER);
    }

    @E("^deve escrever login visualUser$")
    public void deveEscreverLoginVisualUser() {
        loginPage.setEscreverLogin(Constantes.ERROR_USER);
    }

    @E("^deve escrever login standardUser")
    public void deveEscreverStandardUser() {
        loginPage.setEscreverLogin(Constantes.STANDARD_USER);
    }

    @E("^deve escrever login lockedOutUser$")
    public void deveEscreverLoginLockedOutUser() {
        loginPage.setEscreverLogin(Constantes.LOCKED_USER);
    }

    @E("^deve escrever login problemUser$")
    public void deveEscreverLoginProblemUser() {
        loginPage.setEscreverLogin(Constantes.LOCKED_PROBLEM_USER);
    }

    @E("^deve escrever psw valida$")
    public void deveEscreverPswValida() {
        loginPage.setEscreverPswValido();
    }

    @E("^deve escrever psw invalido$")
    public void deveEscreverPswInvalido() {
        loginPage.setEscreverPswInvalido();
    }


    @E("^deve clicar em loginButton$")
    public void deveClicarEmLoginButton() {
        loginPage.setSignInSubmitClick();

    }

    @E("^deve fechar o navegador$")
    public void deveFecharONavegador() {
        dsl.fecharTodosOsBrowser();

    }

    @E("^deve fechar todos os navegadores$")
    public void deveFecharTodosOsNavegadores() {
        dsl.fecharNavegador();

    }

    @E("^deve verificar pagina login$")
    public void deveVerificarPaginaLogin() {
        dsl.esperarAssertELementoTagName(Constantes.NUMERO_2, Constantes.TITLE_SAUCEDEMO); {
            Assert.assertTrue(loginPage.setCheckPaginaLogin()); }
    }

    @E("^deve verificar mensagem de erro lockedUser$")
    public void deveVerificarMensagemDeErroLockedUser() {
        dsl.esperarCarregarPagina(Constantes.NUMERO_2);
        Assert.assertTrue(loginPage.setCheckPaginaLogin());
    }

    @E("^deve verificar mensagem de psw invalido")
    public void deveVerificarMensagemDePswInvalido() {
        dsl.esperarCarregarPagina(Constantes.NUMERO_2);
        Assert.assertTrue(loginPage.setCheckErroPswInvalido());
    }

    @E("^deve verificar pagina produtos$")
    public void deveVerificarPaginaProdutos() {
        dsl.esperarCarregarPagina(Constantes.NUMERO_2);
        Assert.assertTrue(loginPage.setCheckPaginaProduto());

    }

    @E("^deve fazer logout$")
    public void deveFazerLagout() {
        loginPage.setNavProductsClick();
        dsl.esperarAssertELementoTagName(Constantes.NUMERO_10, Constantes.TITLE_PROCUCTS);
        loginPage.setLogoutMover();
        loginPage.setLogoutClick();

    }
}
