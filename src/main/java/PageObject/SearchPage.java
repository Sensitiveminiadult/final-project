package PageObject;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class SearchPage {
    public SelenideElement seachbutton = Selenide.$(Selectors.byId("small-searchterms"));

    public SearchPage() {
    }
}
