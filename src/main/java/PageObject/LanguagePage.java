package PageObject;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class LanguagePage {
    public SelenideElement languagegilaki = Selenide.$(Selectors.byClassName("language_dropdown_inside"));
    public SelenideElement languageqart = Selenide.$(Selectors.byText("GEO"));
    public SelenideElement languageinglisuri = Selenide.$(Selectors.byText("ENG"));
    public SelenideElement languagerus = Selenide.$(Selectors.byText("RUS"));
    public SelenideElement qartulitest = Selenide.$(Selectors.byText("აქციები"));
    public SelenideElement engtest = Selenide.$(Selectors.byText("Promotions"));
    public SelenideElement rustest = Selenide.$(Selectors.byText("акции"));

    public LanguagePage() {
    }
}
