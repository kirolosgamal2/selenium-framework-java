package Alerts;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {
    @Test
    public void testJsAlertButton(){
        var jsAlert=homePage.clickJavaScript_Alerts();
        jsAlert.ClickForJsAlerts();
        jsAlert.interactionJsAlert();
        assertEquals(jsAlert.getTextJsAlert(),"You successfully clicked an alert","Wrong message");
    }
    @Test
    public void testJsConfirmButton(){
        var jsAlert=homePage.clickJavaScript_Alerts();
        jsAlert.ClickForJsConfirm();
        jsAlert.interactionJsConfirm();
        assertEquals(jsAlert.getTextConfirm(),"You clicked: Cancel","Wrong message");
    }
    @Test
    public void testJsPromptButton(){
        var jsAlert=homePage.clickJavaScript_Alerts();
        jsAlert.ClickForJsPrompt();
        String text="Hello";
        jsAlert.interactionJsPrompt(text);
        jsAlert.clickAccept();
        assertEquals(jsAlert.getTextPrompt(),"You entered: " + text ,"Wrong message");
    }

}
