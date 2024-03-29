package com.reto.co;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.reto.co.definitions",
        tags = "@ShoppingCartList",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class Runner {

}
