package com.reto.co.definitions;

import com.reto.co.steps.products.SelectProductStep;
import com.reto.co.steps.validations.ValidationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class ShoppingDef {
    @Steps(shared = true)
    SelectProductStep selectProduct;

    @Steps(shared = true)
    ValidationStep validate;

    @When("el usuario selecciona la categoria {string}")
    public void elUsuarioSeleccionaLaCategoria(String categoria) {
        selectProduct.seleccionarCategoria(categoria);
    }

    @When("el usuario selecciona el producto {string}")
    public void elUsuarioSeleccionaElProducto(String producto) {
        selectProduct.seleccionarProducto(producto);
    }

    @And("el usuario añade el producto al carrito")
    public void elUsuarioAnadeElProductoAlCarrito() {
        selectProduct.anadirProductoAlCarrito();
        selectProduct.click_btnCart();
        selectProduct.clickBtnOrder();

    }
    @And("da click en la opcion cart")
    public void elUsuarioDaClickEnLaOpcionCart() {
        selectProduct.click_btnCart();
    }

    @When("realiza el usuario realiza ek proceso de compra completo")
    public void iniciaCompraDeProducto(){
        selectProduct.llenarDatosDeVenta("Santiago","Colombia", "Medellin", "5000200030004000200", "12", "2024");
    }

    @Then("El sistema debera procesar la compra")
    public void validarCompra(){
        Assert.assertTrue(validate.message_visible());
    }

    }



