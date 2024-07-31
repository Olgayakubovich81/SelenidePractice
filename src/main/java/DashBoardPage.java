import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.$;

public class DashBoardPage {

    private SelenideElement header = $(byTagName("h6"));
    public void headerHasText(String expectedText){
        header.shouldBe(Condition.visible).shouldHave(text(expectedText));
    }

}
