package com.reto.co.steps.login;

import com.reto.co.pages.login.LoginPage;
import net.serenitybdd.annotations.Step;

public class SingUpStep extends LoginPage {

    @Step("Ingresar Usuario") // Paso para ingresar el nombre de usuario
    public void typeUsername(String username) {
        sing_txt_username.sendKeys(username); // Se ingresa el nombre de usuario en el campo correspondiente
    }

    @Step("Ingresar Contraseña") // Paso para ingresar la contraseña
    public void typePassword(String password) {
        sing_txt_password.sendKeys(password); // Se ingresa la contraseña en el campo correspondiente
    }

    public void clickBtnSing() { // Método para hacer clic en el botón de inicio de sesión
        btn_singUp.click();
    }

    public void clickSingUp() {
        getBtn_SingUp.click();
    }
}
