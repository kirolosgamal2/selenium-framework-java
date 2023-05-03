package Alerts;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTest extends BaseTests {
    @Test
    public void testUploadFile(){
       var fileUpload= homePage.clickFileUpload();
       fileUpload.uploadFile("C:\\Users\\world\\Desktop\\meeting.txt");
       fileUpload.clickUploadFileButton();
        assertEquals(fileUpload.verifyUploadedFilesText(),"meeting.txt","Wrong file");
    }
}
