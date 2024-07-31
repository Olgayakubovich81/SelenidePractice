import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class ResetPasswordPage {

    private SelenideElement resetPasswordButton = $(byCssSelector("[type =\"submit\"]"));

    public void resetButtonIsDisplayed(){
        resetPasswordButton.isDisplayed();
    }

}

