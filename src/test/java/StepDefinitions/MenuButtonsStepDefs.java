package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static StepDefinitions.AbstractStepDefs.driver;
import static StepDefinitions.AbstractStepDefs.homePage;

public class MenuButtonsStepDefs {

    @Given("Sauce Labs Fleece Jacket is clicked")
    public void sauceLabsFleeceJacketIsClicked() {
        homePage.clickBackpackItem();
    }

    @And("the drop down menu button is clicked")
    public void theDropDownMenuButtonIsClicked() {
        homePage.clickMenuButton();
    }

    @And("{string} option takes us to {string}")
    public void buttonOptionIsSelected(String option, String url) {
        if(option == "All Items") {
            homePage.clickAllItemsOption();
            Assert.assertEquals(driver.getCurrentUrl(), url);
        }
        else if (option == "About") {
            homePage.clickAboutOption();
            Assert.assertEquals(driver.getCurrentUrl(), url);}
        else if (option == "Log Out") {
            homePage.clickLogoutOption();
            Assert.assertEquals(driver.getCurrentUrl(), url);}
    }

    @And("Sauce Labs Onesie is added to the cart")
    public void sauceLabsBackpackIsAddedToTheCart() {
        homePage.clickAddOnesieButton();
    }

    @Given("Sauce Labs Bike Light is added to the cart")
    public void sauceLabsBikeLightIsAddedToTheCart() {
        homePage.clickAddBikeLightButton();
    }

    @And("Reset App state button is clicked")
    public void resetAppStateButtonIsClicked() {
        homePage.clickResetAppStateButton();
    }
}
