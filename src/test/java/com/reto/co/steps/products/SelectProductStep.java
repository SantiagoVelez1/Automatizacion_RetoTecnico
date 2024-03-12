package com.reto.co.steps.products;

import com.reto.co.pages.products.SelectProductPage;
import net.serenitybdd.annotations.Step;

public class SelectProductStep extends SelectProductPage {

    @Step("Click en la opcion de Cart")
    public void  click_btnCart(){

        btn_cart.click();
    }
    public void ClickCategoria(String cat){
        getCategoria(cat).click();
    }

}
