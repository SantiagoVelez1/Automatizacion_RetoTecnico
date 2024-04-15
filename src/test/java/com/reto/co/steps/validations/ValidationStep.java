package com.reto.co.steps.validations;

import com.reto.co.pages.validations.ValidationPage;
import net.serenitybdd.annotations.Step;


public class ValidationStep extends ValidationPage {

    @Step("Validar visualizacion del nick del cliente al logearse")
    //Paso para visualizar correctamente que el cliente se logeo
    public Boolean nickIsVisible() {
        return nick_name.isDisplayed();
    }

    @Step("validar la compra del cliente despues de terminada") //Paso para validar el mensaje de compra
    public Boolean message_visible() {
        return shopping_full.isDisplayed();
    }

}


