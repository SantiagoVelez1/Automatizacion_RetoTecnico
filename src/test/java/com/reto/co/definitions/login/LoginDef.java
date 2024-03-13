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
    WebSite url; // Inyeccion de dependencia para la clase que maneja la navegacion web

    @Steps(shared = true)
    LoginStep login; // Inyeccion de dependencia para la clase que contiene los pasos de login

    @Steps(shared = true)
    ValidationStep validate; // Inyeccion de dependencia para la clase que contiene los pasos de validacion

    @Given("El usuario navega en el sitio web")
    public void userNavegateTo() {
        // Metodo que navega hacia la URL especifica del sitio web
        url.navegateTo("https://www.demoblaze.com/index.html");
    }

    @When("El usuario ingresa credenciales validas")
    public void userLogin() {
        // Metodo que ejecuta los pasos para iniciar sesion con credenciales validas
        login.clickLog(); // Clic en el boton de inicio de sesion
        login.typeUsername("santiago_pruebas"); // Ingresar el nombre de usuario
        login.typePassword("12345678"); // Ingresar la contrasena
        login.clickLogin(); // Hacer clic en el boton de iniciar sesion
    }

    @Then("La aplicacion debera mostrar el home del aplicativo con el usuario logeado")
    public void ValidationNick() {
        // Metodo que realiza una validacion para asegurar que el nombre de usuario esta visible en el home del aplicativo
        Assert.assertTrue(validate.nickIsVisible()); // Verificar que el nombre de usuario esta visible
    }
}