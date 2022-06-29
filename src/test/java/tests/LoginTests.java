package tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests {

    @Test
    public void Test() {
        open("/login");
        $("#submit").click();
        $(".message").shouldHave(text("Hello"));

    }

}
