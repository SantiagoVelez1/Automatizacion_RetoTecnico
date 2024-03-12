package com.reto.co.definitions;

import com.reto.co.steps.products.SelectProductStep;
import com.reto.co.steps.validations.ValidationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class ShoppingDef {
    @Steps(shared = true)
    SelectProductStep selectProduct;

    @Steps(shared = true)
    ValidationStep validate;



    @And("selecciona una {string}")
    public void selectCategoria(String string) {
        selectProduct.ClickCategoria(string);
    }

    @And("selecciona un {string}")
    public void selectProducto(String string) {
        selectProduct.ClickCategoria(string);
    }

    @And("da click en la opcion cart")
    public void userClickInCar(){
        selectProduct.click_btnCart();
    }
}
