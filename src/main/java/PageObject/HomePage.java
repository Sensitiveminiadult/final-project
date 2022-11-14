package PageObject;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class HomePage {
    public SelenideElement phonen1 = Selenide.$(Selectors.byClassName("loaded"), 0);
    public SelenideElement checkmobile = Selenide.$(Selectors.byText("მარაგშია"));
    public SelenideElement failmobilecheck = Selenide.$(Selectors.byText("3928347928"));
    public SelenideElement zoommermainpage = Selenide.$(Selectors.byClassName("replaced-svg"));

    }

