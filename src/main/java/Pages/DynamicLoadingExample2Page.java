package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample2Page {
    private WebDriver driver;

    public DynamicLoadingExample2Page(WebDriver driver) {
        this.driver = driver;
    }
    private By startButton=new By.ByCssSelector("#start button");
    private By loadingImg=new By.ById("loading");
    private By loadedText = By.id("finish");


    public void clickOnStartButton2(){
        driver.findElement(startButton).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
    }
    public String getLoadedText2(){
        return driver.findElement(loadedText).getText();
    }

}

