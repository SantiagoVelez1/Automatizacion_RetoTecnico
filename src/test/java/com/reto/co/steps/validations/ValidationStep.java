package com.reto.co.steps.validations;

import com.reto.co.pages.validations.ValidationPage;
import io.cucumber.messages.types.Product;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;


public class ValidationStep extends ValidationPage {

    @Step("Validar visualizacion del nick del cliente al logearse")
    public Boolean nickIsVisible(){
        return nick_name.isDisplayed();
    }

}
