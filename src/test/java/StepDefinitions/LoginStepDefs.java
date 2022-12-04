package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs extends AbstractStepDefs{
    @Given("username is {string}")
    public void usernameFilledWith(String username) {
        homePage.fillField(HomePage.USERNAME, username);
    }

    @And("password is {string}")
    public void passwordFilledWith(String password) {
        homePage.fillField(HomePage.PASSWORD, password);
    }

    @Then("products page is open")
    public void productPageIsOpen() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }

    @Then("the {string} error message is shown")
    public void msgErrorMessageIsShown(String msg) {
        Assert.assertEquals(homePage.error.getText(), msg);
    }
}
