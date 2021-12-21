package hover;

import Pages.HoverPage;
import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverAction(){
       HoverPage hoverPage = homePage.clickHover();
       HoverPage.FigureCaption figureCaption = hoverPage.hoverOverProfiles(1);
       assertTrue(figureCaption.isCaptionDisplayed(), "Caption not displayed");
       assertEquals(figureCaption.getCaption(),"name: user1", "Wrong caption");
       assertEquals(figureCaption.getLinkText(),"View profile", "Wrong link text");
       assertTrue(figureCaption.getLink().endsWith("/users/1"), "Link didn't match");

    }
}
