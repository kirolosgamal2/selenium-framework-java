package ContextMenu;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
    @Test
    public void testRightClick(){
        var context=homePage.clickContextMenu();
        context.rightClickBox();
        assertEquals(context.verifyAlertText(),"You selected a context menu","Wrong Message");
    }
}
