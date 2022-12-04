package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static StepDefinitions.AbstractStepDefs.homePage;

public class SortingStepdefs {
    @And("name sorting menu button is clicked")
    public void nameSortingMenuButtonIsClicked() {
        homePage.clickSortButton();
    }

    @Given("name a to z button is clicked")
    public void nameAToZButtonIsClicked() {
        homePage.clickNameDescending();
    }

    @Then("first item should be Sauce Labs backpack")
    public void firstItemShouldBeSauceLabsBackpack() {
        Assert.assertEquals(homePage.getFirstInventoryItemName(), "Sauce Labs Backpack");
    }

    @And("last item should be red t-shirt")
    public void lastItemShouldBeRedTShirt() {
        Assert.assertEquals(homePage.getLastInventoryItemName(), "Test.allTheThings() T-Shirt (Red)");
    }

    @Given("name z to a button is clicked")
    public void nameZToAButtonIsClicked() {
        homePage.clickNameAscending();
    }

    @Then("first item should be red t-shirt")
    public void firstItemShouldBeRedTShirt() {
        Assert.assertEquals(homePage.getFirstInventoryItemName(), "Test.allTheThings() T-Shirt (Red)");
    }

    @And("last item should be Sauce Labs backpack")
    public void lastItemShouldBeSauceLabsBackpack() {
        Assert.assertEquals(homePage.getLastInventoryItemName(), "Sauce Labs Backpack");
    }

    @Given("price low to high button is clicked")
    public void priceLowToHighButtonIsClicked() {
        homePage.clickPriceAscending();
    }

    @Then("first item should be Sauce Labs onesie")
    public void firstItemShouldBeSauceLabsOnesie() {
        Assert.assertEquals(homePage.getFirstInventoryItemName(), "Sauce Labs Onesie");
    }

    @And("last item should be Sauce Labs fleece jacket")
    public void lastItemShouldBeSauceLabsFleeceJacket() {
        Assert.assertEquals(homePage.getLastInventoryItemName(), "Sauce Labs Fleece Jacket");
    }

    @Given("price high to low button is clicked")
    public void priceHighToLowButtonIsClicked() {
        homePage.clickPriceDescending();
    }

    @Then("first item should be Sauce Labs fleece jacket")
    public void firstItemShouldBeSauceLabsFleeceJacket() {
        Assert.assertEquals(homePage.getFirstInventoryItemName(), "Sauce Labs Fleece Jacket");
    }

    @And("last item should be Sauce Labs onesie")
    public void lastItemShouldBeSauceLabsOnesie() {
        Assert.assertEquals(homePage.getLastInventoryItemName(), "Sauce Labs Onesie");
    }
}
