package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {
    private WebDriver driver;

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }
    private By modal=new By.ByCssSelector("div.modal-body");
    private By closeButton= new By.ByCssSelector("div.modal-footer");

    public String getModalText(){
        return driver.findElement(modal).getText();
    }
    public void closeModal(){
        driver.findElement(closeButton).click();
    }
}

