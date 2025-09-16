package definicionDePasos;

import Utilities.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pages.CheckoutInformationPage;

import java.util.List;

public class CheckoutInformationSteps {
    CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage(DriverManager.getDriver());

    @And("LLenamos la informacion para el checkout")
    public void fillCheckoutInformation(DataTable checkoutInformation){
        List<String> data = checkoutInformation.transpose().asList(String.class);
        checkoutInformationPage.setFirstNameTextBox(data.get(0));
        checkoutInformationPage.setLastNameTextBox(data.get(1));
        checkoutInformationPage.setZipCodeTextBox(data.get(2));
    }

    @And("Hago click en el boton de continuar")
    public void clickOnContinue(){
        checkoutInformationPage.clickOnContinueButton();
    }

    @And("Nos sale un mensaje de error {string}")
    public void verifyErrorMessage(String message) throws InterruptedException {
        Assertions.assertTrue(checkoutInformationPage.errorMessageIsDisplayed(message));
        Thread.sleep(3000);
    }

}
