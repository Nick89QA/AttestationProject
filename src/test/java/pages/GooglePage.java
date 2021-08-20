package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class GooglePage {
    private final SelenideElement inputGoogle = $x("//input[@name='q']");
    private final SelenideElement checkWrightPage = $x("//h3[text()='Creative']");
    private final SelenideElement linkCrt = $x("//a[@href='https://crtweb.ru/']/child::h3");

    public void openGooglePage() {
        Selenide.open("https://www.google.com/ru");
        inputGoogle.should(Condition.enabled).setValue("компания креатив тюмень").pressEnter();

    }

    public void setCheckWrightPage() {
        checkWrightPage.should(Condition.appear);
    }

    public void clickLinkCrt() {
        linkCrt.should(Condition.enabled).click();
    }
}