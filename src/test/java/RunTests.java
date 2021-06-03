
import com.codeborne.selenide.junit5.TextReportExtension;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = "src/test/resources/features")
@ExtendWith({TextReportExtension.class})
public class RunTests {
}
