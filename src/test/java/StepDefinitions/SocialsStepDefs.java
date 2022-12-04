package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static StepDefinitions.AbstractStepDefs.driver;
import static StepDefinitions.AbstractStepDefs.homePage;

public class SocialsStepDefs {
    @Then("{string} button takes us to the corresponding {string}")
    public void socialButtonIsClicked(String button, String url) {
        if(button == "Twitter") {
            homePage.twitterLink.click();
            Assert.assertEquals(driver.getCurrentUrl(), url);
        } else if (button == "Facebook") {
            homePage.facebookLink.click();
            Assert.assertEquals(driver.getCurrentUrl(), url);
        } else if (button == "LinkedIn") {
            homePage.linkedLink.click();
            Assert.assertEquals(driver.getCurrentUrl(), url);
        }}
}

