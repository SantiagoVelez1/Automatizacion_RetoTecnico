package com.reto.co.definitions.login;

import com.reto.co.steps.login.SingUpStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;


public class SignUpDef  {
    @Steps(shared = true)
    SingUpStep singUp; // Inyeccion de dependencia para la clase que contiene los pasos de signUp
    @And("el usuario selecciona la opcion Sign Up")
    public void selectSignUp(){
        singUp.clickBtnSing();
    }

    @When("el usuario ingresa el usuario {string} y la contraseña {string}")
    public void userRegister(String user, String password){
        singUp.typeUsername(user);
        singUp.typePassword(password);
        singUp.clickSingUp();
    }

    @Then("la aplicacion debera volver al inicio con el nuevo registro")
    public void laAplicacionDeberaVolverAlInicioConElNuevoRegistro() {
    }
}
