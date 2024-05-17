package pages;

import org.openqa.selenium.*;
import utility.BrowserDriver;

public class HomePage {

    public static String hamburger_menu_xpath = "//*[@id=\"react-burger-menu-btn\"]";

    public static String logout_xpath = "//*[@id=\"logout_sidebar_link\"]";

    public static String product_xpath = "//*[@id=\"inventory_container\"]";


    public static void click_hamburger_menu() throws InterruptedException{
        Thread.sleep(2000);
        BrowserDriver.driver.findElement(By.xpath(hamburger_menu_xpath)).click();
        System.out.println("Hamburger menu clicked");
    }

    public static void click_logout() throws InterruptedException{
        Thread.sleep(2000);
        BrowserDriver.driver.findElement(By.xpath(logout_xpath)).click();
        System.out.println("Logout clicked");
    }

    public static String visiblity_product(){
        String catalog_product = BrowserDriver.driver.findElement(By.xpath(product_xpath)).getText();
        return catalog_product;
    }

}
