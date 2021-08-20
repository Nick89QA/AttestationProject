package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

  public class CrtContactPage {
  private final SelenideElement checkNumber = $x("(//a[@href='tel:+74991136889'])[3]");
 private final SelenideElement checkEmail = $x("(//a[text()='mail@crtweb.ru'])[2]");


 public void verifyCheckNumber(){
     checkNumber.should(Condition.appear);
 }
 public void verifyCheckEmail() {
     checkEmail.should(Condition.appear);
 }

 }
