package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    private By clickForJsAlerts=new By.ByXPath("//button[contains(text(),'Click for JS Alert')]\n");
    private By clickForConfirm=new By.ByXPath("//button[contains(text(),'Click for JS Confirm')]\n");
    private By clickForJsPrompt=new By.ByXPath("//button[contains(text(),'Click for JS Prompt')]\n");
    private By result = new By.ById("result");

    public void ClickForJsAlerts(){
        driver.findElement(clickForJsAlerts).click();
    }
    public String getTextJsAlert(){
       return   driver.findElement(result).getText();
    }
    public void interactionJsAlert(){
        driver.switchTo().alert().accept();
    }
    public void ClickForJsConfirm(){
        driver.findElement(clickForConfirm).click();
    }
    public String getTextConfirm(){
        return   driver.findElement(result).getText();
    }
    public void interactionJsConfirm(){
        driver.switchTo().alert().dismiss();
    }
    public void ClickForJsPrompt(){
        driver.findElement(clickForJsPrompt).click();
    }
    public String getTextPrompt(){
        return   driver.findElement(result).getText();
    }
    public void interactionJsPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public void clickAccept(){
        driver.switchTo().alert().accept();
    }




}
