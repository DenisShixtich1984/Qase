package tests;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
public class WorkSpaceTest extends BaseTest{
    String massageErrorDescriptions = "The description field is required.";
    @Test
    public void workSpaseTest() {
        loginPage.login();
        projectsPage.titleProjectPage.shouldBe(visible);
        projectsPage.goToWorkSpace();
        workspacePage.titleWorkSpace.shouldBe(visible);
    }
    @Test
    public void workCreateGroup() {
        loginPage.login();
        projectsPage.goToWorkSpace();
        workspacePage.titleWorkSpace.shouldBe(visible);
        workspacePage.groupElementClick();
        workspacePage.createNewGroup("QA Engineеrs", "young, but certainly dangerous");
        workspacePage.qaGroup.shouldBe(visible);
    }

    @Test
    public void workCreateGroupWithoutDescription() {
        loginPage.login();
        projectsPage.goToWorkSpace();
        workspacePage.titleWorkSpace.shouldBe(visible);
        workspacePage.groupElementClick();
        workspacePage.createNewGroup("QA Engineеrs", "");
        workspacePage.errorGroupMassage.shouldHave(exactText(massageErrorDescriptions));
    }
}
