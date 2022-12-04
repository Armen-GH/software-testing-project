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
        homePage.sauceLabsBackpackInventoryItem.click();
    }

    @And("the drop down menu button is clicked")
    public void theDropDownMenuButtonIsClicked() {
        homePage.openMenuButton.click();
    }

    @And("{string} option takes us to {string}")
    public void buttonOptionIsSelected(String option, String url) {
        if(option == "All Items") {
            homePage.inventorySidebarLinkAllItems.click();
            Assert.assertEquals(driver.getCurrentUrl(), url);
        }
        else if (option == "About") {
            homePage.aboutSidebarLinkItemMenu.click();
            Assert.assertEquals(driver.getCurrentUrl(), url);}
        else if (option == "Log Out") {
            homePage.logoutSidebarLinkItemMenu.click();
            Assert.assertEquals(driver.getCurrentUrl(), url);}
    }

    @And("Sauce Labs Onesie is added to the cart")
    public void sauceLabsBackpackIsAddedToTheCart() {
        homePage.addCartSauceLabsOnesieButton.click();
    }

    @Given("Sauce Labs Bike Light is added to the cart")
    public void sauceLabsBikeLightIsAddedToTheCart() {
        homePage.addCartSauceLabsBikeButton.click();
    }

    @And("Reset App state button is clicked")
    public void resetAppStateButtonIsClicked() {
        homePage.resetSidebarLinkAppState.click();
    }
}
