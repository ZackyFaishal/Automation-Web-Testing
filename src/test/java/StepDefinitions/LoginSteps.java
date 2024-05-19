package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;
import static pages.HomePage.*;
import static pages.LoginPage.*;
import static utility.BrowserDriver.driver;

public class LoginSteps {

    @Given("I am on the login page")
    public void i_am_on_login_page() {
        System.out.println("I am on the login page");
    }

    @When("I entered my username {string} and password {string}")
    public static void i_entered_my_username_and_password(String username, String password) {
        sendkeys_username(username);
        sendkeys_password(password);
    }

    @When("I entered my username {string} and leave the password field empty")
    public void i_entered_my_username_and_leave_the_password_field_empty(String username) {
        sendkeys_username(username);
        sendkeys_password(""); // Ensure password field is empty
    }

    @When("I leave the username field empty and enter my password {string}")
    public void i_leave_the_username_field_empty_and_enter_my_password(String password) {
        sendkeys_username(""); // Ensure username field is empty
        sendkeys_password(password);
    }

    @And("I clicked on the login button")
    public static void i_clicked_login_button() {
        click_login_button();
    }

    @Then("I should be logged in successfully and redirected to the home page and should be able to view catalog of products")
    public void i_should_be_logged_in_successfully_and_redirected_to_the_home_page_and_should_be_able_to_view_catalog_of_products() {
        String currentUrl = driver.getCurrentUrl();
        assertEquals("https://www.saucedemo.com/inventory.html", currentUrl);
    }

    // SKENARIO 2
    //
    @Then("I should see the error message {string}")
    public void Result(String errorMessage) {
        String actualErrorMessage = validateError();
        // String actualErrorMessage =
        // driver.findElement(By.cssSelector(".error-message-container.error")).getText();
        System.out.println("Expected error message: " + errorMessage);
        System.out.println("Actual error message: " + actualErrorMessage);
        assertEquals(errorMessage, actualErrorMessage);
    }

    @When("I leave the username and password field empty")
    public void I_leave_the_username_and_password_field_empty() {
        sendkeys_username("");
        sendkeys_password("");
    }
}
