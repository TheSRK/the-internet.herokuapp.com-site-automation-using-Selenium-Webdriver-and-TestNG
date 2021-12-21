package nestedFrames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFrameTests extends BaseTests {
    @Test
    public void testNestedFrame(){
        var nestedFramePage = homePage.clickFrameLink().clickNestedFrames();

        String leftText = nestedFramePage.getTextFromLeftFrame();
        String bottomText = nestedFramePage.getTextFromBottomFrame();

        assertEquals(leftText, "LEFT", "Wrong Left Text");
        assertEquals(bottomText, "BOTTOM", "wrong bottom message");
    }
}
