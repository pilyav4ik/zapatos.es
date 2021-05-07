package ui.hook;

import io.cucumber.java.Before;
import ui.basic.BasicPage;

import static com.codeborne.selenide.Selenide.open;

public class Hook {
    private BasicPage basicPage = new BasicPage();


    @Before
    public void openURL(){
        open("https://www.zapatos.es/");
        basicPage.buttonAcceptCookies();
        }
    }
