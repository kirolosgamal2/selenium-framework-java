package ForgotPassword;

import Base.BaseTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends BaseTests {

    @Test
    public void testForgotPassword(){
        var forgotpasswrod=homePage.clickForgotPassword();
        forgotpasswrod.setEmail("kiro@example.com");
        var RetrievePage=forgotpasswrod.clickRetrieve();
        assertTrue(RetrievePage.getTextOfRetrieval().contains("Internal Server Error"),"Wrong Retrieved message");
    }

}
