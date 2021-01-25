package br.com.meowlenium.testcases;

import br.com.meowlenium.framework.utils.bases.BaseTest;
import br.com.meowlenium.framework.webdrivers.DriverManager;
import br.com.meowlenium.pageobjects.TestingAutomationPageObject;

import java.util.Random;

import com.github.javafaker.Faker;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

public class TestingAutomationTest extends BaseTest
{

    @Test(description = "Teste de Registrar Usuário",priority = 4)
    public void registerTest()
    {   
        WebDriver driver = DriverManager.getDriver();
        driver.get("http://practice.automationtesting.in/");
        Faker faker = new Faker();
        TestingAutomationPageObject page = new TestingAutomationPageObject(driver);
        
        
        page.myAccountLink().click();
        page.emailRegTextField().setText(faker.internet().emailAddress());
        page.passwordRegTextField().setText(faker.internet().password(15, 20, true, true, true));
        page.passwordRegTextField().click();
        WebDriverWait espera = new WebDriverWait(driver, 3);
        espera.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='customer_login']/div[2]/form/p[2]/div")));
        page.registerButton().click();
        Assert.assertEquals(page.logoutButton().getText(), "Sign out");
    }

    @Test(
        description = "Lista items de venda",
        priority = 1
)
public void automationPracticeListItems()
{
    WebDriver driver = DriverManager.getDriver();
    driver.get("http://practice.automationtesting.in/");

    TestingAutomationPageObject page = new TestingAutomationPageObject(driver);

    page.shopMenu().click();
}

@Test(
        description = "Adicionando um item no carrinho de compra",
        priority = 2
)
public void automationPractice()
{
    WebDriver driver = DriverManager.getDriver();
    driver.get("http://practice.automationtesting.in/");


    Faker faker = new Faker();
    Random r = new Random();
    TestingAutomationPageObject page = new TestingAutomationPageObject(driver);

    page.shopMenu().click();
    page.selectSeleniumBook().click();
    page.inputBooks().setText("5");
    page.addToBasket().click();
    page.viewBasket().click();
    Assert.assertEquals(page.confirmationViewBasket().getText(), "Basket Totals");   
}

@Test(description = "Teste de Registrar Usuário",priority = 4)
    public void loginTestShouldSucceed()
    {   
        WebDriver driver = DriverManager.getDriver();
        driver.get("http://practice.automationtesting.in/");
        TestingAutomationPageObject page = new TestingAutomationPageObject(driver);
        
        
        page.myAccountLink().click();
        page.usernameTextField().setText("email@email.com.br");
        page.passwordLoginTextField().setText("EmailTeste123456789.");
        page.loginButton().click();
        Assert.assertEquals(page.logoutButton().getText(), "Sign out");
    }

}