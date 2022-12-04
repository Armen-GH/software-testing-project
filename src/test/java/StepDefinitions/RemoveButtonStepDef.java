package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RemoveButtonStepDef  extends AbstractStepDefs{

    @Then("cart is not empty")
    public void cartIsNotEmpty() {
        homePage.clickOnCart();
        Assert.assertFalse(homePage.checkIfCartIsEmpty());
    }
    @But("When Sauce Labs Bolt T-Shirt is removed from the cart")
    public void sauceLabsBoltTShirtIsRemovedFromTheCart() {
        homePage.clickRemoveBoltShirtButton();
    }
}
