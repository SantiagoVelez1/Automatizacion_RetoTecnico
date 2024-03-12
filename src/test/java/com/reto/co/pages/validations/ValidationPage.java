package com.reto.co.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//a[starts-with(text(), 'Welcome')]")
    protected WebElementFacade nick_name;

    @FindBy(xpath = "//tr[@class='success']")
    protected List<WebElementFacade> productInCar;


}
