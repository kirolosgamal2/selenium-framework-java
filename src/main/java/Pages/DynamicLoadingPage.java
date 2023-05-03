package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utils.WindowManager;

import java.util.ArrayList;

public class DynamicLoadingPage {
    private WebDriver driver;

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }
    private By exampleLink1 =new By.ByXPath("//a[@href='/dynamic_loading/1']");
    private By exampleLink2 =new By.ByXPath("//a[@href='/dynamic_loading/2']");

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(exampleLink1).click();
        return new DynamicLoadingExample1Page(driver);
    }
    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(exampleLink2).click();
        return new DynamicLoadingExample2Page(driver);
    }
    public  DynamicLoadingExample2Page openInNewTab(){
        (driver.findElement(exampleLink2)).sendKeys(Keys.CONTROL,Keys.RETURN);
        return new DynamicLoadingExample2Page(driver);
    }

}
