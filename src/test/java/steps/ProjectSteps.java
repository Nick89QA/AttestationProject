package steps;

import com.codeborne.selenide.Selenide;
import org.junit.Test;
import pages.CrtContactPage;
import pages.CrtMainPage;
import pages.GooglePage;

public class ProjectSteps {
    CrtContactPage crtContactPage = Selenide.page(CrtContactPage.class);
    CrtMainPage crtMainPage = Selenide.page(CrtMainPage.class);
    GooglePage googlePage = Selenide.page(GooglePage.class);


    @Test
    public void projectRun() {
     googlePage.openGooglePage();
     googlePage.setCheckWrightPage();
     googlePage.clickLinkCrt();
     crtMainPage.verifySuccessRedirect();
     crtMainPage.clickBurgerMenu();
     crtMainPage.clickPageContacts();
     crtContactPage.verifyCheckNumber();
     crtContactPage.verifyCheckEmail();

    }


 }
