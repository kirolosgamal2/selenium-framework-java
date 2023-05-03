package DynamicLoading;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadingExample1Test extends BaseTests {
    @Test
    public void verifyLoadedText(){
       var example1= homePage.clickDynamicLoading().clickExample1();
       example1.clickOnStartButton();
        Assert.assertEquals(example1.getLoadedText(),"Hello World!","Wrong Message");
    }
}
