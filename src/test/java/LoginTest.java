import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {

   @BeforeEach
    public void setUp() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }


    @Test
    public void successLoginPO(){
        LoginPage loginPage = new LoginPage();
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnTheLoginButton();
        DashBoardPage dashboardPage = new DashBoardPage();
        dashboardPage.headerHasText("Dashboard");
    }

    @Test
    public void invalidPassword(){
        LoginPage loginPage = new LoginPage();
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin124");
        loginPage.clickOnTheLoginButton();
        loginPage.errorMassageText("Invalid credentials");



        //Valid username
        //Invalid password
        //click on Login button
        //check that error message text "Invalid credentials" is displayed
    }

    @Test

    public void invalidUsername() {
        LoginPage loginPage = new LoginPage();
        loginPage.enterUserName("ooo");
        loginPage.enterPassword("admin123");
        loginPage.clickOnTheLoginButton();
        loginPage.errorMassageText("Invalid credentials");


    }

    @Test
     public void emptyPassword() {
        LoginPage loginPage = new LoginPage();
        loginPage.enterUserName("Admin");
        loginPage.clickOnTheLoginButton();
        loginPage.checkEmptyPassword("Required");

     }
   @Test
     public void forgotYourPassword() {
         LoginPage loginPage = new LoginPage();
         loginPage.clickOnForgotYourPasswordLink();
         ResetPasswordPage resetPasswordPage= new ResetPasswordPage();
         resetPasswordPage.resetButtonIsDisplayed();


     }

    @Test
    public void logoIsDisplayed(){
        LoginPage loginPage = new LoginPage();
        loginPage.logoImageIsDisplayed();
        loginPage.logoIsCorrect();
    }

}
