package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetrievePage {
    private WebDriver driver;

    public RetrievePage(WebDriver driver) {
        this.driver = driver;
    }
    private By textOfRetrieval = new By.ByTagName("h1");
    public String getTextOfRetrieval(){
        return driver.findElement(textOfRetrieval).getText();
    }
}
