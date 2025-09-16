package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    WebDriver driver;

    @FindBy(className = "app_logo")
    WebElement sauceDemoTitle;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    @FindBy(css = "a[id^='item_'][id$='_title_link']")
    List<WebElement> productLinks;

    @FindBy(id ="react-burger-menu-btn" )
    WebElement burgerMenu;

    @FindBy(id ="reset_sidebar_link")
    WebElement resetButton;




    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean sauceDemoTitleIsDisplayed() {
        if(sauceDemoTitle.isDisplayed()){
            return true;
        }
        return false;
    }
    public boolean buttonRemoveBackup() {
        boolean removeBtnVisibleB = driver.findElements(By.id("remove-sauce-labs-backpack")).size() > 0;
        return removeBtnVisibleB;
    }
    public boolean buttomRemoveLabsBike(){
        boolean removeBtnVisibleBL = driver.findElements(By.id("remove-sauce-labs-bike-light")).size() > 0;
        return removeBtnVisibleBL;
    }

    public void addProductToCart(String productName){
        String productId = "add-to-cart-"+productName.replace(" ", "-").toLowerCase();
        WebElement addToCartButton = driver.findElement(By.id(productId));
        addToCartButton.click();
    }

    public void clickOnCartIcon(){
        cartIcon.click();
    }
    public void clickOnBurgerMenu(){burgerMenu.click();}
    public void clickOnResetButton(){resetButton.click();}

}
