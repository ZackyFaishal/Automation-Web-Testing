package pages;

import org.openqa.selenium.*;
import utility.BrowserDriver;

import static utility.BrowserDriver.driver;

public class LoginPage {

    public static String username_xpath = "//*[@id=\"user-name\"]";

    public static String password_xpath = "//*[@id=\"password\"]";

    public static String login_button_xpath = "//*[@id=\"login-button\"]";


    public static void sendkeys_username(String username)
    {
        BrowserDriver.driver.findElement(By.xpath(username_xpath)).sendKeys(username);
    }

    public static void sendkeys_password(String password)
    {
        BrowserDriver.driver.findElement(By.xpath(password_xpath)).sendKeys(password);
    }

    public static void click_login_button()
    {
        BrowserDriver.driver.findElement(By.xpath(login_button_xpath)).click();
        System.out.println("Login button clicked");
    }

    public static String validateError(){
        String actualErrorMessage = driver.findElement(By.cssSelector(".error-message-container.error")).getText();
        return actualErrorMessage;
    }
}
