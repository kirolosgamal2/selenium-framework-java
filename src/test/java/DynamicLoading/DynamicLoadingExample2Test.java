package DynamicLoading;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadingExample2Test extends BaseTests {
    @Test
    public void verifyLoadedTextAfterRender(){
        var example2=homePage.clickDynamicLoading().clickExample2();
        example2.clickOnStartButton2();
        Assert.assertEquals(example2.getLoadedText2(),"Hello World!","Wrong message");
    }
    @Test
    public void openInNewTab(){
        var ex=homePage.clickDynamicLoading().openInNewTab();
        getWindowManager().switchToTab("The internet");
        ex.clickOnStartButton2();
        Assert.assertEquals(ex.getLoadedText2(),"Hello World!","Wrong message");

    }
}
