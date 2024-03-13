package com.reto.co.pages.products;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectProductPage extends PageObject {

    public WebElement getCategoria(String categoria) {
        return find(By.xpath("//a[@id='itemc' and contains(., '" + categoria + "')]"));
    }

    public WebElement getProducto(String producto) {
        return find(By.xpath("//a[@class='hrefch' and contains(text(), '" + producto + "')]"));
    }

    @FindBy(xpath = "//button[contains(text(),'Place Order')]") // Boton Place Order
    protected WebElementFacade btn_placeOrder;

    @FindBy(id = "name") // Selector del campo name
    protected WebElementFacade txt_name;
    @FindBy(id = "country") // Selector del campo country
    protected WebElementFacade txt_country;
    @FindBy(id = "city") // Selector del campo city
    protected WebElementFacade txt_city;
    @FindBy(id = "card") // Selector del campo tarjeta
    protected WebElementFacade txt_creditCard;

    @FindBy(id = "month") // Selector del campo month
    protected WebElementFacade txt_month;

    @FindBy(id = "year") // Selector del campo year
    protected WebElementFacade txt_year;

    @FindBy(xpath = "//button[contains(text(),'Purchase')]")
    protected WebElementFacade btn_Purchase;

    @FindBy(id = "cartur") // Selector de la opcion Cart
    protected WebElementFacade btn_cart;

    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    protected WebElementFacade btn_addToCar;

    @FindBy(xpath = "//a[@class='nav-link']")
    protected WebElementFacade btn_home;

}
