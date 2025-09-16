package definicionDePasos;

import Utilities.DriverManager;
import io.cucumber.java.After;


public class Hooks {

    @After
    public  void afterScenario(){
        DriverManager.quitDriver();
    }
}
