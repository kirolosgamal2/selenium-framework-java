package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }
    private By chooseFileButton=new By.ById("file-upload");
    private By uploadFileButton=new By.ById("file-submit");
    private By uploadedFiles = By.id("uploaded-files");
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(chooseFileButton).sendKeys(absolutePathOfFile);
    }
    public void clickUploadFileButton(){
        driver.findElement(uploadFileButton).click();
    }
    public String verifyUploadedFilesText(){
       String uploadedFilesText= driver.findElement(uploadedFiles).getText();
        return uploadedFilesText;
    }

}
