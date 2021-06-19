package ui.browsers;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.codeborne.selenide.Selenide.open;
import static ui.basic.BasicPage.buttonAcceptCookies;

public class BrowserSetting {

    public void openChrome(){
        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;
        Configuration.webdriverLogsEnabled = true;
        Configuration.screenshots = true;
        open("https://www.zapatos.es/");
        buttonAcceptCookies();
    }

    public void openFirefox(){
        Configuration.browser = "Firefox";
        Configuration.startMaximized = true;
        Configuration.webdriverLogsEnabled = true;
        Configuration.screenshots = true;
        open("https://www.zapatos.es/");
        buttonAcceptCookies();
    }

    public void closeBrowser() {
        Selenide.closeWindow();
    }
}
