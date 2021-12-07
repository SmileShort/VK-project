package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    @FindBy(id = "index_email")
    private WebElement email;

    @FindBy(id = "index_pass")
    private WebElement password;

    @FindBy(id = "index_login_button")
    private WebElement submit;

    public LoginPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void logIn (String email, String password){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        submit.click();
    }

}
