import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideWikiTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1600x1080";

    }

    @Test
    public void fillFormTest() {
        open("https://github.com/selenide/selenide");
        $(By.id("wiki-tab")).click();
        $(".filter-bar").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("JUnit5"));
    }
}
