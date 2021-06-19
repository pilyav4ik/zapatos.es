package ui.popupAddedProductToCart;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PopupAddedProductToCart {

    void tala(String talaString){
        $(By.xpath("//li[contains(text(),'"+talaString+"')]"));
    }
}
