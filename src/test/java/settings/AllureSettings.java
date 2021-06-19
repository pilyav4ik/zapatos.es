package settings;

import com.codeborne.selenide.junit.TextReport;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeAll;

public class AllureSettings {

    @Rule
    public TextReport report = new TextReport();

    @BeforeAll
    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
    }
}
