package br.com.meowlenium.pageobjects;

import br.com.meowlenium.framework.widgets.web.IElement;
import br.com.meowlenium.framework.widgets.web.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestingAutomationPageObject {
    private WebDriver driver;

    public TestingAutomationPageObject(WebDriver driver){
        this.driver = driver;
    }

    public IElement shopMenu(){
        return new Element(this.driver, By.id("menu-item-40"));
    }

    public IElement selectSeleniumBook(){
        return new Element(this.driver, By.xpath("//*[@id='content']/ul/li[3]/a[1]/img"));
    }

    public IElement addToBasket(){
        return new Element(this.driver, By.xpath("//*[@id='product-181']/div[2]/form/button"));
    }

    public IElement inputBooks(){
        return new Element(driver, By.xpath("//*[@id='product-181']/div[2]/form/div/input"));
    }

    public IElement numberItemsOfBasket(){
        return new Element(this.driver, By.xpath("//*[@id='wpmenucartli']/a/span[1]"));
    }

    public IElement viewBasket(){
        return new Element(this.driver, By.xpath("//*[@id='content']/div[1]/a"));
    }

    public IElement confirmationViewBasket(){
        return new Element(this.driver, By.xpath("//*[@id='page-34']/div/div[1]/div/div/h2"));
    }

    public IElement usernameTextField(){
        return new Element(this.driver, By.id("username"));
    }
    
    public IElement myAccountLink(){
        return new Element(this.driver, By.xpath("//*[@id='menu-item-50']/a"));
    }

    public IElement passwordLoginTextField(){
        return new Element(this.driver, By.id("password"));
    }

    public IElement loginButton(){
        return new Element(this.driver, By.xpath("//*[@id='customer_login']/div[1]/form/p[3]/input[3]"));
    }

    public IElement registerButton(){
        return new Element(this.driver, By.xpath("//*[@id='customer_login']/div[2]/form/p[3]/input[3]"));
    }

    public IElement emailRegTextField(){
        return new Element(this.driver, By.id("reg_email"));
    }

    public IElement passwordRegTextField(){
        return new Element(this.driver, By.id("reg_password"));
    }

    
    public IElement logoutButton(){
        return new Element(this.driver, By.xpath("//*[@id='page-36']/div/div[1]/div/p[1]/a"));
    }

    public IElement errorLoginMessage(){
        return new Element(this.driver, By.xpath("//*[@id='page-36']/div/div[1]/ul"));
    }
}
