package WYSIWYGEditor;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WYSIWYGEditorTests extends BaseTests {
    @Test
    public void testWYSIWYGEditorPage(){
        var editor=homePage.clickWYSIWYGEditorPage();
        editor.clearTextArea();
        String text="Hello world";
        editor.insertText(text);
        editor.clickDecreaseIndentButton();
        Assert.assertEquals(editor.getTextFromTextArea(),"Hello world","Wrong Message");
    }
}
