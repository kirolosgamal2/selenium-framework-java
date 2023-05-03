package Navigation;

import Base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigation(){
       homePage.clickDynamicLoading().clickExample1();
       getWindowManager().goBack();
       getWindowManager().refresh();
       getWindowManager().goForward();
       getWindowManager().goTo("https://google.com");
    }
    @Test
    public void testNavigationDynamicLoading2(){
        homePage.clickDynamicLoading().openInNewTab();
    }
}
