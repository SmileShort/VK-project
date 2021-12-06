package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VKTest {

    private static Logger logger = LoggerFactory.getLogger(VKTest.class);

    @Test
    public void authorization(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://vk.com");
        driver.findElement(By.id("index_email")).sendKeys("smileshort@mail.ru");
        driver.findElement(By.id("index_pass")).sendKeys("detonator5610");
        driver.findElement(By.xpath("//button[@class='index_login_button flat_button button_big_text']")).click();
        assertTrue( true );

        driver.findElement(By.id("top_profile_link")).click();
        driver.findElement(By.id("top_logout_link")).click();
        driver.quit();
    }

    @Test
    public void friendView(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://vk.com");
        driver.findElement(By.id("index_email")).sendKeys("smileshort@mail.ru");
        driver.findElement(By.id("index_pass")).sendKeys("detonator5610");
        driver.findElement(By.xpath("//button[@class='index_login_button flat_button button_big_text']")).click();

        driver.findElement(By.xpath("//*[@id='l_fr']/a/span")).click();

        driver.findElement(By.xpath("//*[@id='friends_user_row533079423']/div[3]/div[1]/a")).click();
        assertTrue( true );

        driver.findElement(By.id("top_profile_link")).click();
        driver.findElement(By.id("top_logout_link")).click();
        driver.quit();
    }

    @Test
    public void sendMessage(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://vk.com");
        driver.findElement(By.id("index_email")).sendKeys("smileshort@mail.ru");
        driver.findElement(By.id("index_pass")).sendKeys("detonator5610");
        driver.findElement(By.cssSelector("#index_login_button")).click();

        driver.findElement(By.id("l_msg")).click();

        driver.findElement(By.xpath("//li[@data-peer='533079423']")).click();
        WebElement message = driver.findElement(By.cssSelector("#im_editable0"));
        message.sendKeys("Ромчик, пора делать уроки)))" + "\n");
        assertTrue( true );

        driver.findElement(By.id("top_profile_link")).click();
        driver.findElement(By.id("top_logout_link")).click();
        driver.quit();
    }

    @Test
    public void photoView() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://vk.com");
        driver.findElement(By.id("index_email")).sendKeys("smileshort@mail.ru");
        driver.findElement(By.id("index_pass")).sendKeys("detonator5610");
        driver.findElement(By.cssSelector("#index_login_button")).click();

        driver.findElement(By.xpath("//li[@id='l_ph']")).click();
        driver.findElement(By.id("photo_row_688991847_457239019")).click();
        assertTrue( true );

        driver.switchTo().parentFrame().findElement(By.cssSelector(".pv_fs_btn")).click();
        driver.findElement(By.cssSelector("#pv_fs_right")).click();
        driver.findElement(By.cssSelector("#pv_fs_right")).click();
        driver.findElement(By.cssSelector("#pv_fs_close_btn")).click();
        assertTrue( true );
        driver.findElement(By.cssSelector(".pv_close_btn")).click();

        driver.findElement(By.id("top_profile_link")).click();
        driver.findElement(By.id("top_logout_link")).click();
        driver.quit();
    }



}
