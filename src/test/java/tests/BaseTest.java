package tests;
import browser.SelenideConfiguration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.DashboardsPage;
import pages.LoginPage;
import pages.ProjectsPage;
import pages.WorkspacePage;
import steps.ProjectStep;
import java.util.Optional;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    LoginPage loginPage;
    ProjectsPage projectsPage;
    WorkspacePage workspacePage;
    DashboardsPage dashboardsPage;
    ProjectStep projectStep;

    @BeforeMethod (alwaysRun = true)
    public void setUp() {

        String browser = Optional.ofNullable(System.getProperty("browser")).orElse("chrome");
        SelenideConfiguration.configureBrowser(browser);
        open("Login");

        loginPage = new LoginPage();
        projectsPage = new ProjectsPage();
        workspacePage = new WorkspacePage();
        dashboardsPage = new DashboardsPage();
        projectStep = new ProjectStep();
    }
    @AfterMethod
    public void closeBrowser () {
        Selenide.closeWebDriver();
    }
}