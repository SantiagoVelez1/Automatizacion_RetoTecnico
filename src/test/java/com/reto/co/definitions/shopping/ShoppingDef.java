package com.reto.co.definitions.shopping;

import com.reto.co.steps.products.SelectProductStep;
import com.reto.co.steps.validations.ValidationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class ShoppingDef {
    @Steps(shared = true)
    SelectProductStep selectProduct; // Se importa el Step correspondiente para interactuar con la página de productos

    @Steps(shared = true)
    ValidationStep validate; // Se importa el Step correspondiente para realizar validaciones

    @When("el usuario selecciona la categoria {string}") // Step para seleccionar una categoría
    public void elUsuarioSeleccionaLaCategoria(String categoria) {
        selectProduct.seleccionarCategoria(categoria);
    }

    @When("el usuario selecciona el producto {string}") // Step para seleccionar un producto
    public void elUsuarioSeleccionaElProducto(String producto) {
        selectProduct.seleccionarProducto(producto);
    }

    @And("el usuario añade el producto al carrito") // Step para añadir el producto al carrito y proceder con la compra
    public void elUsuarioAnadeElProductoAlCarrito() {
        selectProduct.anadirProductoAlCarrito(); // Se añade el producto al carrito
        selectProduct.click_btnCart(); // Se hace clic en la opción del carrito
        selectProduct.clickBtnOrder(); // Se procede con la orden de compra

    }

    @And("da click en la opcion cart") // Step para hacer clic en la opción del carrito
    public void elUsuarioDaClickEnLaOpcionCart() {
        selectProduct.click_btnCart();
    }

    @When("realiza el usuario realiza ek proceso de compra completo")
    // Step para realizar el proceso completo de compra
    public void iniciaCompraDeProducto() {
        selectProduct.llenarDatosDeVenta("Santiago", "Colombia", "Medellin", "5000200030004000200", "12", "2024"); // Se llenan los datos de la venta
    }

    @Then("El sistema debera procesar la compra") // Step para validar que la compra haya sido procesada correctamente
    public void validarCompra() {
        Assert.assertTrue(validate.message_visible());
    }

}