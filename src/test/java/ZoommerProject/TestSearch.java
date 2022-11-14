package ZoommerProject;

import StepObject.SearchSteps;
import chrome.ChromeRunner;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

@Test
@Epic("მოძებნის გატესტვა")
@Severity(SeverityLevel.CRITICAL)
public class TestSearch extends ChromeRunner {
    SearchSteps searchingmobile = new SearchSteps();

    public TestSearch() {
    }

    @Test(description = "ანდროიდის დასერჩვა")
    public void testsearch1() {
        this.searchingmobile.checksearch1();
    }

    @Test(description = "აიფონის დასერჩვა")
    public void testsearch2() {
        this.searchingmobile.checksearch2();
    }
}