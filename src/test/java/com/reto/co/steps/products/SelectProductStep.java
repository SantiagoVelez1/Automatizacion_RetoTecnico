package com.reto.co.steps.products;

import com.reto.co.pages.products.SelectProductPage;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SelectProductStep extends SelectProductPage {

    private WebDriver driver;

    @Step("Seleccionamos categoria")
    public void seleccionarCategoria(String categoria) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement categoriaElement = wait.until(ExpectedConditions.visibilityOf(getCategoria(categoria)));

        try {
            categoriaElement.click();
        } catch (StaleElementReferenceException e) {
            Thread.sleep(500);
            // Manejar la excepción de manera adecuada, por ejemplo, intentar nuevamente
            categoriaElement = wait.until(ExpectedConditions.visibilityOf(getCategoria(categoria)));
            categoriaElement.click();
        }
    }

    @Step("Seleccionamos el producto")
    public void seleccionarProducto(String producto) {
        try {
            getProducto(producto).click();
        } catch (StaleElementReferenceException e) {
            // Manejar la excepción de manera adecuada, por ejemplo, intentar nuevamente
            getProducto(producto).click();
        }
    }

    @Step("Añadir producto al carrito") // Paso para añadir un producto al carrito
    public void anadirProductoAlCarrito() {
        btn_addToCar.click(); // Se hace clic en el botón para añadir al carrito
    }

    @Step("Click en boton Place Order") // Paso para hacer clic en el botón "Place Order"
    public void clickBtnOrder() {
        btn_placeOrder.click(); // Se hace clic en el botón "Place Order"
    }

    @Step("Llenar los datos de compra") // Paso para llenar los datos de compra
    public void llenarDatosDeVenta(String name, String country, String city, String card, String month, String year) throws InterruptedException {
        Thread.sleep(500);
        txt_name.sendKeys(name); // Se ingresa el nombre
        txt_country.sendKeys(country); // Se ingresa el país
        txt_city.sendKeys(city); // Se ingresa la ciudad
        Thread.sleep(500);
        txt_creditCard.sendKeys(card); // Se ingresa el número de tarjeta
        Thread.sleep(500);
        txt_month.sendKeys(month); // Se ingresa el mes de vencimiento
        Thread.sleep(500);
        txt_year.sendKeys(year); // Se ingresa el año de vencimiento
        btn_Purchase.click(); // Se hace clic en el botón "Purchase"
    }

    @Step("Click en la opcion de Cart") // Paso para hacer clic en la opción "Cart"
    public void click_btnCart() {
        btn_cart.click(); // Se hace clic en la opción "Cart"
    }
}