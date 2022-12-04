package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonStepDefs extends AbstractStepDefs {
    @Given("SwagLabs website is open")
    public void theHomePageIsOpened() {
        homePage.openPage();
    }

    @And("the username is {string}")
    public void theUsernameIsStandard_user(String username) {
        homePage.fillField(HomePage.USERNAME, username);
    }

    @And("the password is {string}")
    public void thePasswordIsSecret_sauce(String password) {
        homePage.fillField(HomePage.PASSWORD, password);
    }

    @When("login button is clicked")
    public void theLoginButtonIsClicked() {
        homePage.clickLoginButton();
    }
}
