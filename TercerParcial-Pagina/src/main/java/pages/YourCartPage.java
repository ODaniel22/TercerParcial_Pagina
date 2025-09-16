package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class YourCartPage {

    WebDriver driver;

    @FindBy(id="checkout")
    WebElement checkoutButton;

    @FindBy(css = ".btn.btn_secondary.btn_small.cart_button")
    List<WebElement> botonesRemove;

    @FindBy(id = "continue-shopping")
    WebElement backbtn;

    public YourCartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnCheckoutButton(){
        checkoutButton.click();
    }

    public void removeElement(String productName){
        String productId = "remove-"+productName.replace(" ", "-").toLowerCase();
        WebElement addToCartButton = driver.findElement(By.id(productId));
        addToCartButton.click();
    }

    public void clickOnBackButton(){
        backbtn.click();
    }

}
