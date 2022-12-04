package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    private static final String PAGE_URL = "https://www.saucedemo.com/";

    public static final By USERNAME = By.id("user-name");
    public static final By PASSWORD = By.id("password");
    public static final By FIRSTNAME = By.id("first-name");
    public static final By LASTNAME = By.id("last-name");
    public static final By POSTAL_CODE = By.id("postal-code");


    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCartLink;

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    @FindBy(id = "continue")
    private WebElement continueButton;

    private WebDriver driver;

    @FindBy(xpath = "//h3")
    private WebElement error;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")
    private WebElement sauceLabsBackpackInventoryItem;

    @FindBy(xpath = "//*[@id='react-burger-menu-btn']")
    private WebElement openMenuButton;

    @FindBy(xpath = "//*[@id='about_sidebar_link']")
    private WebElement aboutSidebarLinkItemMenu;

    @FindBy(xpath = "//*[@id='inventory_sidebar_link']")
    private WebElement inventorySidebarLinkAllItems;

    @FindBy(xpath = "//*[@id='logout_sidebar_link']")
    private WebElement logoutSidebarLinkItemMenu;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addCartSauceLabsBackpackButton;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bike-light']")
    private WebElement addCartSauceLabsBikeButton;

    @FindBy(xpath = "//*[@id='reset_sidebar_link']")
    private WebElement resetSidebarLinkAppState;

    @FindBy(xpath = "//a[@href=\"https://twitter.com/saucelabs\"]")
    private WebElement twitterLink;

    @FindBy(xpath = "//a[contains(@href, \"facebook\")]")
    private WebElement facebookLink;

    @FindBy(xpath = "//a[contains(@href, \"company\")]")
    private WebElement linkedLink;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement addCartSauceLabsBoltButton;

    @FindBy(xpath = "//h3")
    private WebElement error2;

    @FindBy(xpath = "//div[@class=\"summary_subtotal_label\"]")
    private WebElement SubtotalLabel;

    @FindBy(xpath = "//*[@id='remove-sauce-labs-bolt-t-shirt']")
    private WebElement removeSauceLabsBoltShirtButton;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement addCartSauceLabsOnesieButton;

    @FindBy(xpath = "//select")
    private WebElement productSortContainer;

    @FindBy(xpath = "//option[@value=\"az\"]")
    private WebElement nameDescending;

    @FindBy(xpath = "//option[@value=\"za\"]")
    private WebElement nameAscending;

    @FindBy(xpath = "//option[@value=\"lohi\"]")
    private WebElement priceLowHigh;

    @FindBy(xpath = "//option[@value=\"hilo\"]")
    private WebElement priceHighLow;

    @FindBy(css = "html > body > div:nth-of-type(1) > div > div > div:nth-of-type(2) > div > div > div > div:first-of-type")
    private WebElement firstInventoryItem;
    
    @FindBy(css = "html > body > div:nth-of-type(1) > div > div > div:nth-of-type(2) > div > div > div > div:last-of-type")
    private WebElement lastInventoryItem;
    
    
    

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void fillField(By locator, String value) {
        getField(locator).sendKeys(value);
    }

    public WebElement getField(By locator) {
        return driver.findElement(locator);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickOnCart() {
        shoppingCartLink.click();
    }

    public void clickCheckoutButton() {
        checkoutButton.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public String getSubTotal() {
        return SubtotalLabel.getText();
    }

    public void clickSortButton(){
        productSortContainer.click();
    }

    public void clickNameDescending(){
        nameDescending.click();
    }

    public void clickNameAscending(){
        nameAscending.click();
    }

    public void clickPriceDescending(){
        priceHighLow.click();
    }

    public void clickPriceAscending(){
        priceLowHigh.click();
    }

    public String getErrorText(){
        return error.getText();
    }

    public void clickBackpackItem(){
        sauceLabsBackpackInventoryItem.click();
    }

    public void clickMenuButton(){
        openMenuButton.click();
    }

    public void clickAboutOption(){
        aboutSidebarLinkItemMenu.click();
    }

    public void clickLogoutOption(){
        logoutSidebarLinkItemMenu.click();
    }

    public void clickAllItemsOption(){
        inventorySidebarLinkAllItems.click();
    }

    public void clickAddBackpackButton(){
        addCartSauceLabsBackpackButton.click();
    }

    public void clickAddBikeLightButton(){
        addCartSauceLabsBikeButton.click();
    }

    public void clickTwitterButton(){
        twitterLink.click();
    }

    public void clickFacebookButton(){
        facebookLink.click();
    }

    public void clickLinkedinButton(){
        linkedLink.click();
    }

    public void clickAddBoltButton(){
        addCartSauceLabsBoltButton.click();
    }

    public String getError2Text(){
        return error2.getText();
    }

    public void clickRemoveBoltShirtButton(){
        removeSauceLabsBoltShirtButton.click();
    }

    public void clickResetAppStateButton(){
        resetSidebarLinkAppState.click();
    }

    public void clickAddOnesieButton(){
        addCartSauceLabsOnesieButton.click();
    }

    public boolean checkIfCartIsEmpty(){
        List<WebElement> cart = driver.findElements(By.xpath("//div[@class=\"cart_item\"]"));
        if(cart.isEmpty()){return true;}
        else {
        return false;}
    }

    public String getFirstInventoryItemName(){
        return firstInventoryItem.findElement(new By.ByCssSelector("div:nth-of-type(2) > div:nth-of-type(1) > a > div")).getText();
    }

    public String getLastInventoryItemName(){
        return lastInventoryItem.findElement(new By.ByCssSelector("div:nth-of-type(2) > div:nth-of-type(1) > a > div")).getText();
    }
}
