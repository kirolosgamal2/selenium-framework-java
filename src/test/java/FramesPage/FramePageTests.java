package FramesPage;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FramePageTests extends BaseTests {
    @Test
    public void testFrameNames(){
        var frames=homePage.clickFrame();
       var nestedPage= frames.clickNestedFrames();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(nestedPage.getLeftFrameName(),"LEFT","Wrong message");
        softAssert.assertEquals(nestedPage.getBottomFrameName(),"BOTTOM","Wrong message");
        softAssert.assertAll();
    }
}
