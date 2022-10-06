package tests;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.visible;
public class ProjectTest extends BaseTest {

    @Test
    public void CreateNewProject() {
        loginPage.login();
        projectsPage.titleProjectPage.shouldBe(visible);
        projectStep.createNewProject();
        projectsPage.afterCreateLocator.shouldBe(visible);
    }

    @Test
    public void negativeCreationAttempt() {
        loginPage.login();
        projectsPage.titleProjectPage.shouldBe(visible);
        projectStep.negativeCreateNewProject();
        projectsPage.messageErrorCode.shouldBe(visible);
    }

    @Test
    public void newStatus() {
        loginPage.login();
        projectsPage.goToStatus();
        projectsPage.buttonSelect.click();
        projectsPage.checkTitleProject.shouldBe(visible);
    }
    @Test
    public void newStatusTwo() {
        loginPage.login();
        projectsPage.goToStatus();
        projectsPage.buttonSelect.click();
        projectsPage.checkTitleProject.shouldBe(visible);
    }
}
