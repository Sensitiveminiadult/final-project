package ZoommerProject;

import StepObject.LanguageSteps;
import chrome.ChromeRunner;
import io.qameta.allure.Epic;
import org.testng.annotations.Test;

@Test
@Epic("ენის შეცვლა ")
public class ChangeLanguage extends ChromeRunner {
    LanguageSteps shecvla = new LanguageSteps();

    public ChangeLanguage() {
    }

    @Test
    public void rus1() {
        this.shecvla.rusuli();
    }

    @Test
    public void eng1() {
        this.shecvla.inglisuri();
    }
}
