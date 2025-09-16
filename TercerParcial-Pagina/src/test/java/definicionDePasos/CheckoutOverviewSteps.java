package definicionDePasos;

import Utilities.DriverManager;
import io.cucumber.java.en.And;
import pages.CheckoutOverviewPage;

public class CheckoutOverviewSteps {
    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(DriverManager.getDriver());

    @And("Hacemos Click en el boton Finish")
    public void clickOnFinish(){
        checkoutOverviewPage.clickOnFinishButton();
    }
}
