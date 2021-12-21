package frame;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {
    @Test
    public void testIFrame(){
        String text = "Hello";
        var editorPage= homePage.clickWysiwygEditor();
        editorPage.clearEditorBox();
        editorPage.writeInsideEditor(text);
        String getText = editorPage.getTextFromEditor();

        assertEquals(getText, "Hello", "Wrong text");
    }
}
