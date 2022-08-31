package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ZSNhomeworkTest_14_5 {

    @BeforeAll
    static void configure() {
          Configuration.browserSize = "1920x1080";
    }

    @Test
    public void ZSNhomeworkTest_homework5()
    {
        open("https://github.com");
        $("html").hover();
        $(byText("Pricing")).hover();
        $(byText("Compare plans")).click();
        $("h1.h1").shouldHave(text("Compare features"));
    }
}
