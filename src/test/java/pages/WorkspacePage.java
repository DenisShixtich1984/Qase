package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class WorkspacePage {
    public SelenideElement titleWorkSpace = $x("//h1[text()='Workspace']");
    public SelenideElement groupElement = $x("//span[text()='Groups']");
    public SelenideElement buttonCreateNewGroupBeforeFill = $x(" //a[text()='Create a new group']");
    public SelenideElement fieldGroupTitle = $(By.id("inputTitle"));
    public SelenideElement fieldDescription = $(By.id("inputDescription"));
    public SelenideElement buttonCreateGroupAfterFill = $x("//button[text()='Create']");
    public SelenideElement qaGroup = $x("//a[text()='QA Engineеrs']");
    public SelenideElement errorGroupMassage = $x("//div[text()='The description field is required.']");


    public WorkspacePage createNewGroup(String nameGroup, String description) {
        buttonCreateNewGroupBeforeFill.click();
        fieldGroupTitle.sendKeys(nameGroup);
        fieldDescription.sendKeys(description);
        buttonCreateGroupAfterFill.click();
        return this;
    }

    public WorkspacePage groupElementClick() {
        groupElement.click();
        return this;
    }
}
