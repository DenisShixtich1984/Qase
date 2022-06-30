package tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;

public class ProjectTest extends BaseTest{

    @Test
    public void CreateNewProject () {
        loginPage.login();
        projectsPage.titleProjectPage.shouldBe(visible);
        projectsPage.createNewProject();
        projectsPage.afterCreateLocator.shouldBe(visible);
    }
    @Test
    public void negativeCreationAttempt () {
        loginPage.login();
        projectsPage.titleProjectPage.shouldBe(visible);
        projectsPage.negativeCreateNewProject();
        projectsPage.messageErrorCode.shouldBe(visible);
    }

}