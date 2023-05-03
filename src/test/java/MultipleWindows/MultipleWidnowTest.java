package MultipleWindows;

import Base.BaseTests;
import org.testng.annotations.Test;


public class MultipleWidnowTest extends BaseTests {

    @Test
    public void testSwitchTabs(){
     var multiple=   homePage.clickMultipleWindows();
     multiple.clickNewWindowButton();
     getWindowManager().switchToTab("The internet");
    }
}
