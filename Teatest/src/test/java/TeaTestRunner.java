import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src\\test\\java\\com\\qa"}
        //  ,glue = {"src/test/java"}
)
public class TeaTestRunner {
}


