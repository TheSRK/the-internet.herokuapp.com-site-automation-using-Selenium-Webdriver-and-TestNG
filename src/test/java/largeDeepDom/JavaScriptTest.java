package largeDeepDom;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTest extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDomLink().scrollToTable();
    }
}
