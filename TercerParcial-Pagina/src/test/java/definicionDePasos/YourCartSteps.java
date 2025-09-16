package definicionDePasos;

import Utilities.DriverManager;
import pages.YourCartPage;
import io.cucumber.java.en.And;


public class YourCartSteps {

    YourCartPage yourCartPage = new YourCartPage(DriverManager.getDriver());

    @And("Realizo click en checkout")
    public void clickOnCheckoutButton(){
        yourCartPage.clickOnCheckoutButton();
    }

    @And("Elimino {string} del carro")
    public void removeCheckoutElements(String productName){
        yourCartPage.removeElement(productName);
    }

    @And("Vuelvo a la pagina principal")
    public void clickonBackButton(){
        yourCartPage.clickOnBackButton();
    }
}
