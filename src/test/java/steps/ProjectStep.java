package steps;
import io.qameta.allure.Step;
import pages.ProjectsPage;

public class ProjectStep {
    ProjectsPage projectsPage;

    public ProjectStep() {
        projectsPage = new ProjectsPage();
    }

    @Step()
    public ProjectStep createNewProject() {
        projectsPage
                .createStartButton()
                .projectName()
                .projectCode()
                .projectDescription()
                .accessType()
                .createButtonFinish();
        return this;
    }
    @Step()
    public ProjectStep negativeCreateNewProject() {
        projectsPage
                .createStartButton()
                .projectNameTwo()
                .projectCodeTwo()
                .projectDescription()
                .accessType()
                .createButtonFinish();
        return this;
    }
}