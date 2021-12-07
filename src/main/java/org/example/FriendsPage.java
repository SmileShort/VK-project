package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FriendsPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"friends_user_row533079423\"]/div[3]/div[1]/a")
    private WebElement lirOvsiychuk;

    public FriendsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void viewLir(){
        this.lirOvsiychuk.click();
    }

}
