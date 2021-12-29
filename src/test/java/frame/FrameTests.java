package frame;

import Pages.EditorPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {
    @Test
    public void testIFrame(){
        String text = "Hello";
        EditorPage editorPage= homePage.clickWysiwygEditor();
        editorPage.clearEditorBox();
        editorPage.writeInsideEditor(text);
        String getText = editorPage.getTextFromEditor();

        assertEquals(getText, "Hello", "Wrong text");
    }
}
