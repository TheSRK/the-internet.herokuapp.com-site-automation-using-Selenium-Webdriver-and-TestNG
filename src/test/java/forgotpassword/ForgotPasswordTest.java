package forgotpassword;

import Pages.EmailSent;
import Pages.ForgotPasswordPage;
import base.BaseTests;
import org.testng.Assert.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTest extends BaseTests {
    @Test
    public void testForgotPassword(){
       ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
       forgotPasswordPage.inputEmail();
       EmailSent emailSent = forgotPasswordPage.clickRetrivePasswordButton();
       assertEquals(emailSent.getErrorText(),"Internal Server Error", "Text doesn't match");
    }
}
