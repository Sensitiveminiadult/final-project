package ZoommerProject;

import StepObject.HomeSteps;
import chrome.ChromeRunner;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

@Test
@Epic("პროდუქციის ტესტი")
@Severity(SeverityLevel.CRITICAL)
public class ZoommerSearch extends ChromeRunner {
    HomeSteps test1 = new HomeSteps();

    public ZoommerSearch() {
    }

    @Test(description = "აიფონის დასდაკლების ნახვა და უკან დაბრუნება")
    public void ZoommerSales1() {
        this.test1.chekingmobile1();
        Selenide.$(Selectors.byClassName("replaced-svg")).click();
    }

    @Test(description = "აიფონის დასდაკლების ნახვა და უკან დაბრუნება")
    public void ZoommerSales2() {
        this.test1.chekingmobile2();
    }
}
