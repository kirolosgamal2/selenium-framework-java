package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }
    private By box=new By.ById("hot-spot");
    public void rightClickBox(){
        Actions rightClick=new Actions(driver);
        rightClick.contextClick(driver.findElement(box)).perform();
    }
    public String verifyAlertText(){
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return alertText;
    }
}
