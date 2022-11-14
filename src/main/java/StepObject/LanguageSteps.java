
package StepObject;

import PageObject.LanguagePage;
import com.codeborne.selenide.Condition;
import org.testng.Assert;

public class LanguageSteps extends LanguagePage {
    public LanguageSteps() {
    }

    public LanguageSteps qartuli() {
        this.languagegilaki.click();
        this.languageqart.click();
        Assert.assertFalse(this.rustest.is(Condition.visible));
        return this;
    }

    public LanguageSteps inglisuri() {
        this.languagegilaki.click();
        this.languageinglisuri.click();
        Assert.assertFalse(this.rustest.is(Condition.visible));
        return this;
    }

    public LanguageSteps rusuli() {
        this.languagegilaki.click();
        this.languagerus.click();
        Assert.assertFalse(this.qartulitest.is(Condition.visible));
        return this;
    }
}
