package ui.product;

import io.cucumber.java.en.And;

public class ProductPageDefinition {

    private final ProductPage productPage = new ProductPage();


    @And("select size {int}")
    public void selectSize(int size) {
        productPage.selectSize(size);
    }

}
