package com.saucedemo.stepdefinitions;

import com.saucedemo.constantes.Constantes;
import com.saucedemo.dsl.Dsl;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import io.cucumber.java.pt.E;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestesProcutosStep {
    private Dsl dsl;
    public ProductPage productPage;
    public LoginPage loginPage;
    public Constantes constantes;
    private WebDriver driver;

    public WebDriver acessarWeb() {
        System.setProperty("webdriver.chrome.driver", constantes.PATH_CHROMEDRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(constantes.URL_SAUCEDEMO);
        dsl = new Dsl(driver);
        productPage = new ProductPage(driver);

        return driver;
    }
}
