package chrome;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;


import java.nio.channels.ConnectionPendingException;

import static com.codeborne.selenide.Selenide.open;
public class ChromeRunner  {

    @BeforeTest
    public static void setUp() {
        Configuration.browser = "chrome";
    open ("https://zoommer.ge/");
    }
}

