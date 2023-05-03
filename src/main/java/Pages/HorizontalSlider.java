package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {
    private WebDriver driver;

    public HorizontalSlider(WebDriver driver) {
        this.driver = driver;
    }
    private By slider=new By.ByTagName("input");
    private By rangeNumber=new By.ById("range");

    public void setRange(){
        driver.findElement(slider).click();
        driver.findElement(slider).sendKeys(Keys.chord(Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT));
    }
    public String getRangeNumber(){
        String range= driver.findElement(rangeNumber).getText();
        return range;
    }

}
