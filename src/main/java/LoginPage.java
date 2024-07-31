import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement usernameInputField=  $("[name=\"username\"]");
    private SelenideElement passwordInputField=  $("[name=\"password\"]");
    private SelenideElement loginButton=  $("[type=\"submit\"]");

    private SelenideElement errorMessage = $(byClassName("oxd-alert-content-text"));

    private SelenideElement emptyPassword =$(byTagName("span"));
    private SelenideElement forgotYourPasswordLink = $(byClassName("orangehrm-login-forgot-header"));

    private SelenideElement logoImage =$("[alt=\"company-branding\"]");


    public void enterUserName(String usernameValue){
        usernameInputField.setValue(usernameValue);
    }

    public void enterPassword(String passwordValue){
        passwordInputField.setValue(passwordValue);
    }
    public void clickOnTheLoginButton(){
        loginButton.click();
    }

        public void errorMassageText(String expectedText){
            errorMessage.shouldBe(visible).shouldHave(text(expectedText));
        }


    public void checkEmptyPassword(String expectedText){
        emptyPassword.shouldBe(visible).shouldHave(text(expectedText));
    }

    public void clickOnForgotYourPasswordLink(){
        forgotYourPasswordLink.click();

    }

    public void logoImageIsDisplayed() {
         logoImage.shouldBe(visible);
    }

    public void logoIsCorrect() {
        logoImage.shouldHave(attributeMatching("src", ".*web/images/ohrm_branding.png.*"));

            }

    }


