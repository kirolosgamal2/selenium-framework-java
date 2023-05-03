package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    private By Email = new By.ById("email");
    private By Retrieve = new By.ById("form_submit");
     public void setEmail(String email){
         driver.findElement(Email).sendKeys(email);
     }
     public RetrievePage clickRetrieve(){
         driver.findElement(Retrieve).click();
         return new RetrievePage(driver);

     }


}
