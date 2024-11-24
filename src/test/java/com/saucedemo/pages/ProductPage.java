package com.saucedemo.pages;

import com.saucedemo.constantes.Constantes;
import com.saucedemo.dsl.Dsl;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private Dsl dsl;

    String navProducts = "react-burger-menu-btn";
    String logout = "logout_sidebar_link";
    String titlePaginaProduct = "//*[@id=\"header_container\"]/div[2]/span";

    public ProductPage(WebDriver driver) {
        dsl = new Dsl(driver);

    }

    public void setNavProductsClick() {
        dsl.clickById(logout);
    }

    public void setLogoutClick() {
        dsl.clickById(navProducts);
    }

    public boolean setCheckPaginaProduto() {
        return dsl.checarElementoByXpath(titlePaginaProduct, Constantes.TITLE_PROCUCTS);

    }

}
