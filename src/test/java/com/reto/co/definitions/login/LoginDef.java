package com.reto.co.definitions.login;

import com.reto.co.steps.login.LoginStep;
import com.reto.co.steps.validations.ValidationStep;
import com.reto.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import org.junit.Assert;

public class LoginDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validate;

    @Given("El usuario navega en el sitio web")
    public void userNavegateTo(){
        url.navegateTo( "https://www.demoblaze.com/index.html");
    }

    @When("El usuario ingresa credenciales validas")
    public void userLogin(){

        login.clickLog();
        login.typeUsername("santiago_pruebas");
        login.typePassword("12345678");
        login.clickLogin();
    }

    @Then("La apliacion debera mostrar el home del aplicativo con el usuario logeado")
    public void ValidationNick(){
        Assert.assertTrue(validate.nickIsVisible());
    }
}
