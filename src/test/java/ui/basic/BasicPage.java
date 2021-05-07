package ui.basic;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {

    public void buttonAcceptCookies(){
        if (        $(By.xpath("//button[contains(text(),'Acepto')]")).isDisplayed()) {
            $(By.xpath("//button[contains(text(),'Acepto')]")).click();
        }
    }
    void searchField(String text){
        $(By.xpath("//header/div[4]/div[1]/form[1]/input[1]")).setValue(text);
    }

    void clickSearchButton(){
        $(By.xpath("//header/div[4]/div[1]/form[1]/button[1]")).click();
    }

    void checkTitle(String text){
        $(By.xpath("//h1")).shouldBe(Condition.value(text));
    }

    void clickToProduct(String linkTitle){
        $(By.xpath("//a[@title='"+linkTitle+"']")).click();
    }

    void textIncludedInBreadcrumbs(){
        $(By.xpath("//li[@class='e-breadcrumbs__list-item product']")).getText();
    }

    void brandNameLinkIsVisible(String text){
        $(By.linkText(text)).shouldBe(Condition.visible);
    }

    void textVisibility(String text){
        $(By.xpath("//*[contains(text(),'"+text+"')]")).shouldBe(Condition.visible);
    }

}
