package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {
    private WebDriver driver;

    public MultipleWindowsPage(WebDriver driver) {
        this.driver = driver;
    }
    private By newWindowText=new By.ByLinkText("Click Here");
    public void clickNewWindowButton(){
        driver.findElement(newWindowText).click();
    }
}
