package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }
    private By figureBox =new By.ByClassName("figure");
    private By boxcaption =new By.ByClassName("figcaption");

    public FigureCaption hoverFigure(int index){
        WebElement figureBox=driver.findElements(this.figureBox).get(index-1);
        Actions action = new Actions(driver);
        action.moveToElement(figureBox).perform();
        return new FigureCaption(figureBox.findElement(boxcaption));

    }

    public class FigureCaption{
        private WebElement caption;

        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }
        private By header =new By.ByTagName("h5");
        private By link =new By.ByTagName("a");

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }
        public String getHeader(){
            return caption.findElement(header).getText();
        }
        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }
        public String getLinkText(){
            return caption.findElement(link).getText();
        }
    }
}
