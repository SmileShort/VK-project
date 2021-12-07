package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SendMessageTest {

    @Test
    public void sendMessage() {
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
        leftPanel.pressMessage();
        driver.findElement(By.xpath("//li[@data-peer='533079423']")).click();

        ChatPage chatPage = new ChatPage(driver);
        chatPage.writeMessage("Когда прицеп откапаешь?");
        chatPage.writeMessage(" И не говори что мой автотест тебя доканал)))");
        assertTrue( true );

        HeaderElement header = new HeaderElement(driver);
        header.quit();
        driver.quit();
    }

}
