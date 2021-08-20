package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.WebDriverConditions.url;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.webdriver;

public class CrtMainPage {
    private final SelenideElement pageContacts = $x("//a[@href='/contacts']");
    private final SelenideElement burgerMenu = $x("//input[@type='checkbox']/parent::nav");


    public void clickBurgerMenu() {
        burgerMenu.should().click();
    }

   public void clickPageContacts() {
     pageContacts.should(Condition.enabled).click();
   }

   public void verifySuccessRedirect() {
        webdriver().shouldHave(url("https://crtweb.ru/"));
   }

}
