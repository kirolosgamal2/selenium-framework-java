package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }
    private By inputField=new By.ById("target");
    private By resultText=new By.ById("result");

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }
    public String getResultText(){
        String text=driver.findElement(resultText).getText();
        return text;
    }
    public void enterPi(){
        enterText(Keys.chord(Keys.ALT,"2","2","7") +"=3.14");
    }

}
