package com.saucedemo.pages;

import com.saucedemo.constantes.Constantes;
import com.saucedemo.dsl.Dsl;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private Dsl dsl;
    String loginButton = "login-button";
    String credentials = "//*[@id=\"login_credentials\"]";
    String userName = "user-name";
    String password = "password";
    String loginError = "//*[@id=\"login_button_container\"]/div/form/div[3]";
    String navProducts = "react-burger-menu-btn";
    String navCloseProducts = "react-burger-cross-btn";
    String logout = "//*[@id=\"logout_sidebar_link\"]";
    String titlePaginaProduct = "//*[@id=\"header_container\"]/div[2]/span";

    public LoginPage(WebDriver driver) {
        dsl = new Dsl(driver);

    }

    public void setSignInSubmitClick() {
        dsl.clickById(loginButton);
    }

    public void setEscreverLogin(String user) {
        dsl.escreverById(userName, user);
    }

    public void setEscreverPswValido() {
        dsl.escreverById(password, Constantes.PSW_VALIDO);
    }

    public boolean setCheckPaginaLogin() {
    return dsl.checarElementoByXpath(credentials, Constantes.LOGIN_CREDENTIALS);

    }

    public boolean setCheckErrorLogin() {
    return dsl.checarElementoByXpath(loginError, Constantes.LOGIN_CREDENTIALS);

    }

    public void setNavProductsClick() {
        dsl.clickById(navProducts);
    }

    public void setLogoutClick() {
        dsl.clickByXPath(logout);
    }

    public void setLogoutMover() {
        dsl.moverByXPath(logout);
    }

    public void setCloseNavProducts() {
        dsl.clickById(navCloseProducts);
    }

    public boolean setCheckPaginaProduto() {
        return dsl.checarElementoByXpath(titlePaginaProduct, Constantes.TITLE_PROCUCTS);

    }

}
