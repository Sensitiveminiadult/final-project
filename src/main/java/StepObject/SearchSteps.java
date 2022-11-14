package StepObject;

import PageObject.SearchPage;
import org.testng.Assert;

public class SearchSteps extends SearchPage {
    public SearchSteps() {
    }

    public SearchSteps checksearch1() {
        this.seachbutton.setValue("Samsung");
        Assert.assertEquals(this.seachbutton.getValue(), "Samsung");
        return this;
    }

    public SearchSteps checksearch2() {
        this.seachbutton.setValue("Iphone");
        Assert.assertEquals(this.seachbutton.getValue(), "Iphone");
        return this;
    }
}
