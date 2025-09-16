package definicionDePasos;

import Utilities.DriverManager;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import pages.CheckoutCompletePage;

public class CheckoutCompleteSteps {
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(DriverManager.getDriver());


    @Then("Mensaje que dice {string} mostrando habilitacion")
    public void verifyCompleteMessage(String message) throws InterruptedException {
        Assert.assertTrue(checkoutCompletePage.verifyCompleteMessage(message));
        Thread.sleep(3000);
    }
}
