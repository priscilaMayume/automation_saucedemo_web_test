package com.saucedemo.dsl;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Dsl {
    public WebDriver driver;

    public Dsl(WebDriver driver) {
        this.driver = driver;
    }

    public void esperarCarregarPagina(Integer espera) {
        WebDriverWait wait = new WebDriverWait(driver, espera);

    }

    public void clickById(String id_campo) {
        driver.findElement(By.id(id_campo)).click();
    }

    public void clickByXPath(String id_campo) {
        driver.findElement(By.xpath(id_campo)).click();
    }
    public void clickByClass(String id_campo) {
        driver.findElement(By.className(id_campo)).click();
    }

    public void moverById(String id_campo) {
        WebElement element = driver.findElement(By.id(id_campo));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void moverByXPath(String id_campo) {
        WebElement element = driver.findElement(By.xpath(id_campo));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void moverByClass(String id_campo) {
        WebElement element = driver.findElement(By.className(id_campo));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }


    public void escreverById(String id_campo, String texto) {
        driver.findElement(By.id(id_campo)).sendKeys(texto);
    }

    public void escreverByXpath(String id_campo, String texto) {
        driver.findElement(By.xpath(id_campo)).sendKeys(texto);
    }

    public void esperarEClicar(Integer segundos, String texto) {
        WebDriverWait wait = new WebDriverWait(driver, segundos);
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText(texto)));
    }

    public WebElement buscarElementoById(String texto) {
        return driver.findElement(By.id(texto));

    }

    public WebElement buscarElementoByXpath(String texto) {
        return driver.findElement(By.xpath(texto));

    }

    public void tempoCarrementoPagina(Integer segundos) {
        driver.manage().timeouts().pageLoadTimeout(segundos, TimeUnit.SECONDS);

    }

    public void esperarPaginaAbrir(Integer segundos) {
        driver.manage().timeouts().implicitlyWait(segundos, TimeUnit.SECONDS);

    }

    public boolean checarElementoByName(String className, String nome) {
        return driver.findElement(By.className(className)).getText().contains(nome);

    }

    public boolean checarElementoById(String id, String nome) {
        return driver.findElement(By.id(id)).getText().contains(nome);

    }

    public boolean checarElementoByXpath(String xpath, String nome) {
        return driver.findElement(By.xpath(xpath)).getText().contains(nome);

    }

    public boolean checarElementoByClass(String nameClass, String nome) {
        return driver.findElement(By.className(nameClass)).getText().contains(nome);

    }


    public void fecharNavegador() {
        driver.quit();

    }

    public void fecharTodosOsBrowser() {
        driver.close();

    }

    public void esperarELementoById(Integer segundos, String elementById) {
        WebDriverWait wait = new WebDriverWait(driver, segundos);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementById)));

    }

    public void esperarELementoTagName(Integer segundos, String elementTagName) {
        WebDriverWait wait = new WebDriverWait(driver, segundos);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("body"), elementTagName));

    }

    public void esperarELementoXPath(Integer segundos, String elementXPath) {
        WebDriverWait wait = new WebDriverWait(driver, segundos);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXPath)));

    }

    public boolean esperarAssertELementoXPath(Integer segundos, String elementXPath) {
        WebDriverWait wait = new WebDriverWait(driver, segundos);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXPath)));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean esperarAssertELementoTagName(Integer segundos, String elementTagName) {
        WebDriverWait wait = new WebDriverWait(driver, segundos);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(elementTagName)));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean esperarAssertELementoId(Integer segundos, String elementId) {
        WebDriverWait wait = new WebDriverWait(driver, segundos);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
    public void verificarTitle() {
        driver.getTitle();

    }

}
