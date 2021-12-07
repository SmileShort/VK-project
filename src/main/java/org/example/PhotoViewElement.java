package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhotoViewElement {

    private WebDriver driver;

    @FindBy(css = ".pv_fs_btn")
    private WebElement fullScreen;

    @FindBy(css = "#pv_fs_right")
    private WebElement next;

    @FindBy(css = "#pv_fs_close_btn")
    private WebElement minimal;

    @FindBy(css = ".pv_close_btn")
    private WebElement close;

    public PhotoViewElement (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void maxSizeWindow(){
        this.fullScreen.click();
    }

    public void nextPhoto(){
        this.next.click();
    }

    public void minimalWindow(){
        this.minimal.click();
    }

    public void closeWindow(){
        this.close.click();
    }

}
