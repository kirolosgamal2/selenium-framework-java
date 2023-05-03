package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class NestedFramesPage {
    private WebDriver driver;

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    private String topFrameName ="frame-top";
    private String leftFrameName ="frame-left";
    private String bottomFrameName ="frame-bottom";
    private By body = By.tagName("body");

    public void switchToTopFrame(){
        driver.switchTo().frame(topFrameName);
    }
    public void switchToLeftFrame(){
        driver.switchTo().frame(leftFrameName);
    }
    public void switchToBottomFrame(){
        driver.switchTo().frame(bottomFrameName);
    }
    public void switchToMainFrame(){
        driver.switchTo().parentFrame();
    }
    public String getLeftFrameName(){
        switchToTopFrame();
        switchToLeftFrame();
        String text= driver.findElement(body).getText();
        switchToMainFrame();
        switchToMainFrame();
        return text;
    }
    public String getBottomFrameName(){
        switchToBottomFrame();
        String text= driver.findElement(body).getText();
        switchToMainFrame();
        return text;
    }

}
