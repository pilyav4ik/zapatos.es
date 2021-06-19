package ui.product;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {


    public void selectSize(int size){
        $(By.xpath("//span[contains(text(),'"+size+"')]")).click();
    }

    public void checkSize(int size) {
        $(By.xpath("//div[contains(text(),'Talla:"+size+"')]"));
    }

}
