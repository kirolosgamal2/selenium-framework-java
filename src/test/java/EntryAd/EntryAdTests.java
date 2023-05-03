package EntryAd;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EntryAdTests extends BaseTests {
    @Test
    public void testModalEntry(){
        var entryAd=homePage.clickEntryAd();
        Assert.assertEquals(entryAd.getModalText(),"It's commonly used to encourage a user to take an action (e.g., give their e-mail address to sign up for something or disable their ad blocker).","Wrong message");
        entryAd.closeModal();
    }
}
