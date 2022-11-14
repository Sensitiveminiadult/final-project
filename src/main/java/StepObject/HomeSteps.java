package StepObject;
import PageObject.HomePage;
import com.codeborne.selenide.Condition;
import org.testng.Assert;

public class HomeSteps extends HomePage {
    public HomeSteps() {
    }

    public HomeSteps chekingmobile1() {
        this.phonen1.click();
        Assert.assertTrue(this.checkmobile.is(Condition.visible));
        this.zoommermainpage.click();
        return this;
    }

    public HomeSteps chekingmobile2() {
        this.phonen1.click();
        Assert.assertFalse(this.failmobilecheck.is(Condition.visible));
        return this;
    }
}
