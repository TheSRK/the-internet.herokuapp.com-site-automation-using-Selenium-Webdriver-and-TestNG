package alert;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {
    @Test
    public void testClickAlert(){
      var alertPage = homePage.clickJsAlert();
      alertPage.triggerAlert();
      alertPage.alert_Click();
      String text = alertPage.getResultText();
      assertEquals(text, "You successfully clicked an alert", "Wrong alert message 1");
    }

    @Test
    public void testClickConfirm(){
        var alertPage = homePage.clickJsAlert();
        alertPage.triggerConfirmAlert();
        alertPage.alert_Confirm();
        //alertPage.alert_dismiss();
        //String text =


        assertEquals(alertPage.getResultText(), "You clicked: Ok", "Wrong result text");
    }

}
