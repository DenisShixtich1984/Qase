package pages;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
public class DashboardsPage {

    public SelenideElement buttonNotNow = $x("//button[text()='Not now']");
    public SelenideElement buttonUpgrade = $(".UdZcu9");
    public SelenideElement checkTittle = $x("//h1[text()='Subscriptions']");

}
