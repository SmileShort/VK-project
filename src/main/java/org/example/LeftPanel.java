package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftPanel {

    private WebDriver driver;

    @FindBy(id = "l_msg")
    private WebElement message;

    @FindBy(xpath = "//*[@id='l_fr']/a/span")
    private WebElement friends;

    @FindBy(id = "l_ph")
    private WebElement photo;

    public LeftPanel (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void pressFriends(){
        this.friends.click();
    }

    public void pressMessage(){
        this.message.click();
    }

    public void pressPhoto(){
        this.photo.click();
    }

}
