package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonStepDefs extends AbstractStepDefs {
    @Given("SwagLabs website is open")
    public void theHomePageIsOpened() {
        homePage.openPage();
    }

    @When("login button is clicked")
    public void theLoginButtonIsClicked() {
        homePage.clickLoginButton();
    }
}
