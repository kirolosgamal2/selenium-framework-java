package HorizontalSlider;

import Base.BaseTests;
import Pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HorizontalSliderTest extends BaseTests {
    @Test
    public void testSliderRange4(){
        var hzSlider=homePage.clickHorizontalSlider();
        hzSlider.setRange();
       assertEquals(hzSlider.getRangeNumber(),"4");
    }

}
