package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePages {
    private WebDriver driver;
    private By nestedFramesLink = By.linkText("Nested Frames");

    public FramePages(WebDriver driver){
        this.driver = driver;
    }

    public NestedFramePage clickNestedFrames(){
        driver.findElement(nestedFramesLink).click();
        return new NestedFramePage(driver);
    }
}
