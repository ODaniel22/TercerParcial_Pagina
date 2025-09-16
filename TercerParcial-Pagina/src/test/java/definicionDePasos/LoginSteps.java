package definicionDePasos;

import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage(DriverManager.getDriver());

    @Given("colocamos el nombre del Usuario {string}")
    public void setUserName(String userName) throws InterruptedException {
        loginPage.setUserNameTextBox(userName);
    }

    @And("Colocamos la contraseña {string}")
    public void setPassword(String password){
        loginPage.setPasswordTextBox(password);
    }

    @And("Hacemos click en el boton de Login")
    public void clickOnLogin(){
        loginPage.clickOnLoginButton();
    }


}
