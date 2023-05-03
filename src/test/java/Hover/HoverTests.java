package Hover;

import Base.BaseTests;
import Pages.HoversPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
       var hoverPage=homePage.clickHovers();
       var figureCaption= hoverPage.hoverFigure(1);
       assertTrue(figureCaption.isCaptionDisplayed(),"Caption Not displayed");
       assertEquals(figureCaption.getHeader(),"name: user1", "Caption title incorrect");
       assertTrue(figureCaption.getLink().endsWith("/users/1"),"Link incorrect");
       assertEquals(figureCaption.getLinkText(),"View profile", "Caption link text incorrect" );
    }
    @Test
    public void testHoverUser2(){
        var hoverPage=homePage.clickHovers();
        var figureCaption= hoverPage.hoverFigure(2);
        assertTrue(figureCaption.isCaptionDisplayed(),"Caption Not displayed");
        assertEquals(figureCaption.getHeader(),"name: user2", "Caption title incorrect");
        assertTrue(figureCaption.getLink().endsWith("/users/2"),"Link incorrect");
        assertEquals(figureCaption.getLinkText(),"View profile", "Caption link text incorrect" );
    }
}
