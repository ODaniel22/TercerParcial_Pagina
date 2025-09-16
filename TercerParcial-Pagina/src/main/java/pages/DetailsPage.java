package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage {
    WebDriver driver;

    @FindBy(id = "add-to-cart")
    WebElement addButton;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    public DetailsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAddButton(){
        addButton.click();
    }

    public void clickOnCartIcon(){
        cartIcon.click();
    }
}
