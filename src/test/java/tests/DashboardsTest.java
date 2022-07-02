package tests;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.visible;
public class DashboardsTest extends BaseTest {

    @Test
    public void DashboardNotNowTest() {
        loginPage.login();
        projectsPage.goToDashboards();
        dashboardsPage.buttonNotNow.click();
        projectsPage.titleProjectPage.shouldBe(visible);
    }

    @Test
    public void DashboardUpgradeTest() {
        loginPage.login();
        projectsPage.goToDashboards();
        dashboardsPage.buttonUpgrade.click();
        dashboardsPage.checkTittle.shouldBe(visible);
    }
}