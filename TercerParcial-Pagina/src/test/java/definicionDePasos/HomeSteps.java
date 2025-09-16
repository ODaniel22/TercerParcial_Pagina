package definicionDePasos;

import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.HomePage;
import org.junit.jupiter.api.Assertions;


public class HomeSteps {
    HomePage homePage = new HomePage(DriverManager.getDriver());

    @And("Verificamos si la pagina esta habilitada o no")
    public void verifyHomePageIsDisplayed(){
        Assertions.assertTrue(homePage.sauceDemoTitleIsDisplayed());
    }


    @And("Agregamos el productos {string} al carrito")
    public void addProductToCart(String productName){
        homePage.addProductToCart(productName);
    }

    @And("Hago click en  burguer_menu")
    public void clickOnBurgerMenu() throws InterruptedException {
        homePage.clickOnBurgerMenu();
        Thread.sleep(3000);
    }
    @And("Hago click en  buttom reset")
    public void clickOnResetButton() throws InterruptedException {
        homePage.clickOnResetButton();
        Thread.sleep(3000);
    }

    @And ("Verificamos los botones Remove")
    public void verifyHomePageAndCart() throws InterruptedException {
        Assertions.assertTrue(homePage.buttonRemoveBackup(), "El botón 'Remove' aún está presente tras el reset mochila");
        Assertions.assertTrue(homePage.buttomRemoveLabsBike(), "El botón 'Remove' aún está presente tras el reset mochila");

    }


    @When("Hacemos click al icono del carrito")
    public void clickOnCartIcon(){
        homePage.clickOnCartIcon();
    }
}
