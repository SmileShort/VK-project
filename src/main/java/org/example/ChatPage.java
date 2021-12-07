package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatPage {

    private WebDriver driver;

    @FindBy(css = "#im_editable0")
    private WebElement chatWindow;

    public ChatPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void writeMessage (String text){
        this.chatWindow.sendKeys(text + "\n");
    }

}
