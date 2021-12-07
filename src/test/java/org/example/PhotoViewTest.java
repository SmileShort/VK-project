package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhotoViewTest {

    @Test
    public void viewPhoto() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://vk.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logIn("smileshort@mail.ru", "detonator5610");

        LeftPanel leftPanel = new LeftPanel(driver);
        leftPanel.pressPhoto();
        driver.findElement(By.id("photo_row_688991847_457239019")).click();

        PhotoViewElement photoViewElement = new PhotoViewElement(driver);
        photoViewElement.maxSizeWindow();
        photoViewElement.nextPhoto();
        photoViewElement.nextPhoto();
        photoViewElement.minimalWindow();
        photoViewElement.closeWindow();
        assertTrue(true);

        HeaderElement header = new HeaderElement(driver);
        header.quit();
        driver.quit();
    }

}
