package com.reto.co.steps.login;

import com.reto.co.pages.login.LoginPage;
import net.serenitybdd.annotations.Step;


public class LoginStep extends LoginPage {

    @Step("Ingresar Usuario")
    public void typeUsername(String username){
        txt_username.sendKeys(username);
    }

    @Step("Ingresar Contraseña")
    public void typePassword(String password){
        txt_password.sendKeys(password);
    }

    public void clickLog(){
        btn_singUp.click();
    }

    public void clickLogin(){
        btn_Login.click();
    }

}
