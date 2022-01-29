import com.codeborne.selenide.Configuration;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class DemoTest {

    @Test
    public void sampleTest() {
        System.setProperty("webdriver.chrome.driver", "/usr/lib/chromium/chrome");
        Configuration.browser = "chrome";
        Configuration.headless = true;
        open("https://demoqa.com/");
        $x("//h5[text()='Elements']").click();
    }

}
