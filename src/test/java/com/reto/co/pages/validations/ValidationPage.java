package com.reto.co.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//a[starts-with(text(), 'Welcome')]") //Validacion para saber que el usuario esta logeado
    protected WebElementFacade nick_name;

    @FindBy(xpath = "//h2[contains(text(),'Thank you for your purchase!')]")
    // Validacion para saber que la compra fue realizada
    protected WebElementFacade shopping_full;


}
