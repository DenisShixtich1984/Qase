package pages;

import com.codeborne.selenide.SelenideElement;
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




    public void createNewProject () {
        createButtonStart.click();
        projectName.sendKeys("Main Project");
        projectCode.sendKeys("UVXHRW");
        projectDescription.sendKeys("this is such a project blah blah blah");
        accessType.click();
        createButtonFinish.click();
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
