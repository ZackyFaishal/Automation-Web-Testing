package StepDefinitions;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;
import static pages.HomePage.*;
import static utility.BrowserDriver.driver;

public class LogoutSteps {
    
    @Given("I am on the dashboard page")
    public void i_am_on_dashboard_page() {
        LoginSteps.i_entered_my_username_and_password("standard_user","secret_sauce");
        LoginSteps.i_clicked_login_button();
        System.out.println("I am on the dashboard page");
    }

    @Given("I clicked the sidebar menu button")
    public void i_click_the_sidebar_menu_button() throws InterruptedException {
        click_hamburger_menu();
        System.out.println("I click the sidebar menu button");
    }

    @Given("I clicked the logout button")
    public void i_clicked_the_logout_button() throws InterruptedException {
        click_logout();
        System.out.println("I click on the logout button");
    }

    @Given("I should be logged out successfully")
    public void i_should_be_logged_out_successfully() {
        String currentUrl = driver.getCurrentUrl();
        assertEquals("https://www.saucedemo.com/", currentUrl);
    }
}
