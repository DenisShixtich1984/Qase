package tests;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.*;


public class LoginTests extends BaseTest{

    String massageError = "These credentials do not match our records.";

    @Test
    public void loginTrue() {
    loginPage.login();
    projectsPage.titleProjectPage.shouldBe(visible);
    }

    @Test
    public void loginWithFalseData () {
        loginPage.falseLogin();
        loginPage.errorMessage.shouldHave(exactText(massageError));
    }
}
