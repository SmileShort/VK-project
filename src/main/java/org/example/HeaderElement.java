package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderElement {

    private WebDriver driver;

    @FindBy(id = "top_profile_link")
    private WebElement userMenu;

    public HeaderElement(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void quit(){
        this.userMenu.click();
        driver.findElement(By.id("top_logout_link")).click();
    }

}
