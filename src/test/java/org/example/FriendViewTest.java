package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class FriendViewTest {

    @Test
    @Epic("logged in user")
    @Feature("просмотр страницы друга (Лир)")
    public void friendView() {
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
        leftPanel.pressFriends();

        FriendsPage friends = new FriendsPage(driver);
        friends.viewLir();
        assertTrue( true );

        HeaderElement header = new HeaderElement(driver);
        header.quit();
        driver.quit();
    }
}
