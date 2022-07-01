package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class ProjectsPage {

    public SelenideElement titleProjectPage = $x("//h1[text()='Projects']");
    public SelenideElement createButtonStart = $(By.id("createButton"));
    public SelenideElement projectName = $(By.id("inputTitle"));
    public SelenideElement projectCode = $ (By.id("inputCode"));
    public SelenideElement projectDescription = $ (By.id("inputDescription"));
    public SelenideElement accessType = $x("//input[@value ='public']");
    public SelenideElement  createButtonFinish = $x("//button[text ()='Create project']");
    public SelenideElement  afterCreateLocator = $x("//div[text()='Main Project']");
    public SelenideElement  messageErrorCode = $x("//div[text() ='The selected project code is already in use.']");
    public SelenideElement  buttonForDelete = $x("//*[@id='application-content']/div/div/div/table/tbody/tr[3]/td[1]/button/i");
    public SelenideElement buttonWorkSpace = $x(" //a[text()='Workspace']");
    public SelenideElement buttonDashboards = $x("//a[text()='Dashboards']");
    public SelenideElement buttonStatus = $x("//span[text()='Status: Active']");
    public SelenideElement buttonSelect = $x("//button[text()='Select all']");
    public SelenideElement checkTitleProject = $x("//a[text()='Start project']");

    public void goToStatus() {
        buttonStatus.click();
    }

    public DashboardsPage goToDashboards() {
        buttonDashboards.click();
        return new DashboardsPage();
    }

    public WorkspacePage goToWorkSpace () {
        buttonWorkSpace.click();
        return new WorkspacePage();
    }
    @Step
    public ProjectsPage createStartButton () {
        createButtonStart.click();
        return this;
    }
    @Step
    public ProjectsPage projectName () {
        projectName.sendKeys("Main Project");
        return this;
    }
    @Step
    public ProjectsPage projectCode () {
        projectCode.sendKeys("UVXHRW");
        return this;
    }
    @Step
    public ProjectsPage projectDescription () {
        projectDescription.sendKeys("this is such a project blah blah blah");
        return this;
    }
    @Step
    public ProjectsPage accessType () {
        accessType.click();
        return this;
    }
    @Step
    public ProjectsPage createButtonFinish () {
        createButtonFinish.click();
        return this;
    }

    public void negativeCreateNewProject () {
        createButtonStart.click();
        projectName.sendKeys("Main Project 2");
        projectCode.sendKeys("SP");
        projectDescription.sendKeys("this is such a project blah blah blah");
        accessType.click();
        createButtonFinish.click();
    }
    public void createNewProj () {
        createButtonStart.click();
        projectName.sendKeys("Main Project");
        projectCode.sendKeys("UVXHRW");
        projectDescription.sendKeys("this is such a project blah blah blah");
        accessType.click();
        createButtonFinish.click();
    }


}
