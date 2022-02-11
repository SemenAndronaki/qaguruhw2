import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragNDrop {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1600x1080";
    }

    @Test
    public void fillFormTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));

        $("#column-b").shouldHave(text("A"));
        $("#column-a").shouldHave(text("B"));
    }
}
