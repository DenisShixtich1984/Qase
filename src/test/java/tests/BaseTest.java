package tests;

import browser.SelenideConfiguration;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.ProjectsPage;

import java.util.Optional;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    LoginPage loginPage;
    ProjectsPage projectsPage;

    @BeforeMethod
    public void setUp() {

        String browser = Optional.ofNullable(System.getProperty("browser")).orElse("chrome");
        SelenideConfiguration.configureBrowser(browser);

        Configuration.baseUrl = "https://qase.io/";
        Configuration.timeout = 10000;
        open("login");
        loginPage = new LoginPage();
        projectsPage = new ProjectsPage();
    }

}