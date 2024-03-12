package com.reto.co.utilities.website;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;


public class WebSite {


    @Steps(shared = true)
    PageObject swag;

    @Step("Ingresar al sitio web")
    public void navegateTo(String url){
        swag.setDefaultBaseUrl(url);
        swag.open();
    }

}
