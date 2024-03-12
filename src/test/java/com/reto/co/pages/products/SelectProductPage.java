package com.reto.co.pages.products;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectProductPage extends PageObject {

    @FindBy(xpath = "") // Selector de tipo clase de todos los productos
    protected List<WebElementFacade> products;

    @FindBy(xpath = "//button[contains(text(),'Place Order')]") // Boton Place Order
    protected WebElementFacade btn_placeOrder;

    @FindBy(id = "name") // Selector del campo name
    protected WebElementFacade txt_name;

    @FindBy(id = "cartur") // Selector de la opcion Cart
    protected WebElementFacade btn_cart;

    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    protected WebElementFacade btn_addToCar;

    @FindBy(xpath = "//a[@class='nav-link']")
    protected WebElementFacade btn_home;

    public WebElement getCategoria(String categoria){
        return find(By.xpath("//a[@id='itemc' and contains((., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'"+categoria+"')]"));
    }

    public WebElement getProdcuto(String producto){
        return find(By.xpath("//a[@id='itemc' and contains((., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'"+producto+"')]"));
    }
}
