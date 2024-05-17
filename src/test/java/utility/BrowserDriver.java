package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {

    public static WebDriver driver;

    public ChromeOptions options;

    public BrowserDriver(){
        options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-web-security");
        System.setProperty("webdriver.chrome.driver", "C:/POLBAN MATERI/SEMESTER 6/Pengujian Perangkat Lunak/Praktek/Week 11/AutomationTestingWeb/src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
    }

    public void close(){
        if (this.driver != null) {
            this.driver.close();
            this.driver = null;
        }
    }
}
