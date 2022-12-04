package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static StepDefinitions.AbstractStepDefs.homePage;

public class CheckoutStepDef {
    @Given("the Sauce Labs Backpack is added to the cart")
    public void theSauceLabsBackpackIsAddedToTheCart() {
        homePage.addCartSauceLabsBackpackButton.click();
    }

    @And("the Sauce Labs Bolt T-Shirt is added to the cart")
    public void theSauceLabsBoltTShirtIsAddedToTheCart() {
        homePage.addCartSauceLabsBoltButton.click();
    }

    @And("the cart icon is clicked")
    public void theCartIconIsClicked() {
        homePage.clickOnCart();
    }

    @And("the checkout button is clicked")
    public void theCheckoutButtonIsClicked() {
        homePage.clickCheckoutButton();
    }

    @And("the First Name is filled with {string}")
    public void theFirstNameIsFilledWithA(String firstName) {
        homePage.fillField(HomePage.FIRSTNAME, firstName);
    }

    @And("the Last Name is filled with {string}")
    public void theLastNameIsFilledWithB(String lastName) {
        homePage.fillField(HomePage.LASTNAME, lastName);
    }

    @And("the Zip Code is filled with {string}")
    public void theZipCodeIsFilledWith(String zip) {
        homePage.fillField(HomePage.POSTAL_CODE, zip);
    }

    @When("the Continue button is clicked")
    public void theContinueButtonIsClicked() {
        homePage.clickContinueButton();
    }

    @Then("{string} should be shown")
    public void total$ShouldBeShown(String total) {
        Assert.assertEquals(total , homePage.getSubTotal());
    }

    @Then("error {string} is displayed")
    public void errorMsgIsDisplayed(String msg) {
        Assert.assertEquals(homePage.error.getText(), msg);
    }
}
