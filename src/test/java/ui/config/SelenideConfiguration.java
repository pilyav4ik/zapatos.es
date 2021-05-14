package ui.config;

import com.codeborne.selenide.Configuration;
import org.junit.Before;

public class SelenideConfiguration {

    @Before
    public void setUp() {
        Configuration.timeout = 6000;
        Configuration.startMaximized = true;
        Configuration.screenshots = true;

    }
}
