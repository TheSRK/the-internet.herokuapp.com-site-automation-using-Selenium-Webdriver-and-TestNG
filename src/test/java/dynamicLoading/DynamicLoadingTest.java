package dynamicLoading;

import Pages.DynamicExample2Page;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTest extends BaseTests {
    @Test
    public void testDynamicLoading(){
        DynamicExample2Page dynamicExample2Page= homePage.clickDynamicLoading().clickExample2Link();
        dynamicExample2Page.clickStart();
        String text = dynamicExample2Page.getText();
        assertEquals(text, "Hello World!", "Wrong text!!!");
    }
}
