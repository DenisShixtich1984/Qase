package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    public SelenideElement inputEmail = $(By.id("inputEmail"));
    public SelenideElement inputPassword = $(By.id("inputPassword"));
    public SelenideElement buttonLogin = $(By.id("btnLogin"));
    public SelenideElement errorMessage
            = $x("//div[text() ='These credentials do not match our records.']");

    public ProjectsPage login() {
        inputEmail.sendKeys("dehok@mail.ru");
        inputPassword.sendKeys("SKRIZHALI2011");
        buttonLogin.click();
        return new ProjectsPage();
    }

    public void falseLogin() {
        inputEmail.sendKeys("dehok@mail.ru");
        inputPassword.sendKeys("SKRIZHALI2012");
        buttonLogin.click();
    }
}
