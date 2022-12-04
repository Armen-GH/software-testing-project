package StepDefinitions;

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

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addBackpackToCartButton;

    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCartLink;

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    @FindBy(id = "first-name")
    private WebElement firstname;

    @FindBy(id = "last-name")
    private WebElement lastname;

    @FindBy(id = "postal-code")
    private WebElement postalCode;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(className = "summary_total_label")
    private WebElement totalLabel;

    private WebDriver driver;

    @FindBy(xpath = "//h3")
    public WebElement error;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")
    public WebElement sauceLabsBackpackInventoryItem;

    @FindBy(xpath = "//*[@id='react-burger-menu-btn']")
    public WebElement openMenuButton;

    @FindBy(xpath = "//*[@id='about_sidebar_link']")
    public WebElement aboutSidebarLinkItemMenu;

    @FindBy(xpath = "//*[@id='inventory_sidebar_link']")
    public WebElement inventorySidebarLinkAllItems;

    @FindBy(xpath = "//*[@id='logout_sidebar_link']")
    public WebElement logoutSidebarLinkItemMenu;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    public WebElement addCartSauceLabsBackpackButton;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bike-light']")
    public WebElement addCartSauceLabsBikeButton;

    @FindBy(xpath = "//*[@id='reset_sidebar_link']")
    public WebElement resetSidebarLinkAppState;

    @FindBy(xpath = "//div[@class=\"cart_item\"]")
    private WebElement cartItem;
    

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

    public void addBackPackToCart() {
        addBackpackToCartButton.click();
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

    public String getTotal() {
        return totalLabel.getText();
    }

    public boolean checkIfCartIsEmpty(){
        List<WebElement> cart = driver.findElements(By.xpath("//div[@class=\"cart_item\"]"));
        if(cart.isEmpty()){return true;}
        else {
        return false;}
    }
}
