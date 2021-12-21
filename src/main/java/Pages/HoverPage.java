package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HoverPage {
    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By captionBox = By.className("figcaption");

    public HoverPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     *
     * @param index starts from 0 because it's List type
     * @return
     */
    public FigureCaption hoverOverProfiles(int index){
        WebElement figure = driver.findElements(figureBox).get(index-1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();

        return new FigureCaption(figure.findElement(captionBox));

    }

    public class FigureCaption {
        WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaption(WebElement caption){
            this.caption = caption;
        }

        public boolean isCaptionDisplayed (){
            return caption.isDisplayed();
        }

        public String getCaption(){
           return caption.findElement(header).getText();
        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }

        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }

    }
}
