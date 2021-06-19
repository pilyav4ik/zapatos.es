package ui.basic;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class BasicPage {

    public void clickButton(String text){
        $(By.xpath("//button[contains(text(),'"+text+"')]")).click();
    }
    public static void buttonAcceptCookies(){
        if (        $(By.xpath("//button[contains(text(),'Acepto')]")).isDisplayed()) {
            $(By.xpath("//button[contains(text(),'Acepto')]")).click();
        }
    }
    public void searchField(String text){
        $(By.xpath("//header/div[4]/div[1]/form[1]/input[1]")).setValue(text);
    }

    public void clickSearchButton(){
        $(By.xpath("//header/div[4]/div[1]/form[1]/button[1]")).click();
    }

    public void checkTitle(String text){
        $(By.xpath("//h1")).shouldBe(Condition.value(text));
    }

    public void clickToProduct(String linkTitle){
        SelenideElement productsList = $(By.className("products-list__link"));
        productsList.click();
    }

    public void textIncludedInBreadcrumbs(){
        $(By.xpath("//li[@class='e-breadcrumbs__list-item product']")).getText();
    }

    public void brandNameLinkIsVisible(String text){
        $(By.linkText(text)).shouldBe(Condition.visible);
    }

    public void textVisibility(String text){
        $(By.xpath("//*[contains(text(),'"+text+"')]")).shouldBe(Condition.visible);
    }

    public void itemWithText(String text){
        $(By.xpath("//*[contains(text(),'"+text+"')]")).click();
    }

    public void headerH3WithText(String text){
        if ($(By.xpath("//h3[contains(text(),'" + text + "')]")).isDisplayed()){
            $(By.xpath("//header")).scrollIntoView(text);
        }

    }

    public void selectSize(int size){
        $(By.xpath("//span[contains(text(),'"+size+"')]")).click();
    }

    public void cartButtonSize(String text){
        $(By.xpath("//span[contains(text(),'"+text+"')]"));
    }

    public void clickCartButton() {
        $(By.xpath("//header/div[4]/div[3]/div[1]/a[1]")).click();
    }
    public void clickCartButtonAfterAddedProduct() {
        $(By.xpath("//span[contains(text(),'Carrito de compra (1)')]")).click();
    }

    public void closePopup() {
        $(By.xpath("//body/div[3]/div[2]/form[1]/section[1]/div[2]/div[1]/div[6]/div[3]/div[1]/div[1]/div[1]/button[1]")).click();
    }


    public void linkWithText(String arg0) {
        $(By.xpath("//a[contains(text(),'"+arg0+"')]"));
    }

    public void productCountInCartPage(int size) {
        $(By.xpath("//h1[contains(text(),'Carrito de compra ("+size+")')]"));
    }
}
