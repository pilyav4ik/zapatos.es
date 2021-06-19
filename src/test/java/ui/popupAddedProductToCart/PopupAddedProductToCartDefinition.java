package ui.popupAddedProductToCart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PopupAddedProductToCartDefinition {

    private final PopupAddedProductToCart popupAddedProductToCart = new PopupAddedProductToCart();


    @And("text with {string} in precart popup visible")
    public void textWithInPrecartPopupIsVisible(String string) {
        popupAddedProductToCart.tala(string);
    }
}
