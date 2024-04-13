package com.reto.co.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(id = "login2") //Selector del boton de login principal
    protected WebElementFacade getBtn_Login;

    @FindBy(id = "signin2") //Selector del boton de sing Up principal
    protected WebElementFacade btn_singUp;


    @FindBy(id = "loginusername") //Selector del campo username
    protected WebElementFacade txt_username;

    @FindBy(id = "loginpassword") // Selector del campo password
    protected WebElementFacade txt_password;

    @FindBy(id="sign-username")
    protected WebElementFacade sing_txt_username;

    @FindBy(id="sign-password")
    protected WebElementFacade sing_txt_password;
    @FindBy(xpath = "//button[contains(text(),'Log in')]") // Selector del boton "log in"
    protected WebElementFacade btn_Login;

    @FindBy(xpath = "//button[contains(text(),'Sign up')]")
    protected WebElementFacade getBtn_SingUp;
}
