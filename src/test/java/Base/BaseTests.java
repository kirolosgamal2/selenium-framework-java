package Base;
 import Pages.HomePage;
import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
 public class BaseTests {
    // Declare WebDriver instance
    public WebDriver driver;
    protected HomePage homePage;
     // Set up the driver before running tests
    @BeforeClass
public void setUp(){
    System.setProperty("webdriver.chrome.driver" , "resources/chromedriver.exe");
//    driver = new ChromeDriver(getChromeOptions());
        driver = new ChromeDriver();
        //driver =new FirefoxDriver();
        homePage= new HomePage(driver);
        goHome();
        System.out.println(driver.getTitle());
    }
     // Navigate to the home page before each test
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }
     // Quit the driver after running tests
    @AfterClass
    public void exit(){
//        deleteCookie("optimizelySegments","the-internet.herokuapp.com");
//        deleteCookie("TAU","the-internet.herokuapp.com");

        FluentWait wait=new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(3));
        driver.quit();
    }
     // Get a WindowManager instance
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
     // Take a screenshot if a test fails
    @AfterMethod
    public void recordFailure(ITestResult result){
        if (ITestResult.SUCCESS==result.getStatus()){
            var camera=(TakesScreenshot)driver;
            File screenshot=camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot,new File("resources/screenshots/" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
//        options.addArguments("disable-gpu");
        options.addArguments("start-maximized");
        return options;
    }
    private void setCookie(){
        Cookie cookie = new Cookie.Builder("TAU","123")
                .domain("the-internet.herokuapp.com")
                .build();

        driver.manage().addCookie(cookie);
    }
    private void deleteCookie(String cookie , String domain)  {

        driver.manage().deleteCookieNamed(cookie);
        System.out.println(driver.manage().getCookies().toString());
    }
}