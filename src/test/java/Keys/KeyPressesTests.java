package Keys;

import Base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class KeyPressesTests extends BaseTests {
    @Test
    public void testBack_Space(){
        var keyPressesPage=homePage.clickKeyPresses();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResultText(),"You entered: BACK_SPACE");
    }
    @Test
    public void testPI(){
        var keyPage=homePage.clickKeyPresses();
        keyPage.enterPi();
        assertEquals(keyPage.getResultText(),"You entered: 4");
    }
}
