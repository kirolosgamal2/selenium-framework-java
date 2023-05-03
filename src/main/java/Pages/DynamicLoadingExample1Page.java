package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {
    private WebDriver driver;

    public DynamicLoadingExample1Page(WebDriver driver) {
        this.driver = driver;
    }
    private By startButton=new ByCssSelector("#start button");
    private By loadingImg=new ById("loading");
    private By loadedText = By.id("finish");

    //This method will click on the 'Start' button and waits until the loading image disappears before continuing.
    public void clickOnStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingImg)));
    }

    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }


}
