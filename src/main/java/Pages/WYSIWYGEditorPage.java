package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String textEditorId="mce_0_ifr";
    private By textArea =new By.ById("tinymce");
    private By decreaseIndentButton=new By.ByXPath("//button[@title='Increase indent']");

    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }
    public void switchToEditArea(){
        driver.switchTo().frame(textEditorId);
    }
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void insertText(String text){
        clearTextArea();
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public void clickDecreaseIndentButton(){
        driver.findElement(decreaseIndentButton).click();
    }
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
    public String getTextFromTextArea(){
        switchToEditArea();
        return driver.findElement(textArea).getText();
    }
}
