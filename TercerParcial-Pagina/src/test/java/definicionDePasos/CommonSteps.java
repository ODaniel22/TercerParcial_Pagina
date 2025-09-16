package definicionDePasos;

import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;

import java.time.chrono.ThaiBuddhistEra;

public class CommonSteps {

    @Given("Estamos en la pagina de saucedemo")
    public void goToSauceDemoPage(){
        DriverManager.getDriver().get("https://www.saucedemo.com");
        //DriverManager.getDriver().manage().window().maximize();
    }


    @And("Si llegas aqui la prueba fallo")
    public void failedTest() throws InterruptedException {
        Assertions.fail("El escenario llegó a un punto donde debía fallar.");
        Thread.sleep(3000);
    }
}
