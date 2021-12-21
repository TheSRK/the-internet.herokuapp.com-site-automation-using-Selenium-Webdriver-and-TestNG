package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NestedFramePage {
    private WebDriver driver;
    private String topFrameName = "frame-top";
    private String leftFrameName = "frame-left";
    private String bottomFrameName = "frame-bottom";
    private By body = By.tagName("body");

    public NestedFramePage(WebDriver driver){
        this.driver =driver;
    }

    private void switchToTopFrame(){
        driver.switchTo().frame(topFrameName);
    }

    private void switchToLeftFrame(){

        driver.switchTo().frame(leftFrameName);
    }

    public String getTextFromLeftFrame(){
        switchToTopFrame();
        switchToLeftFrame();
        /*driver.switchTo().frame(topFrameName);
        driver.switchTo().frame(leftFrameName);*/
        String textFromLeftFrame = driver.findElement(body).getText();
       /* driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();*/
        switchToMainArea(); //out of left frame
        switchToMainArea(); //out of top frame
        return textFromLeftFrame;
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    private void switchToBottomFrame(){
        driver.switchTo().frame(bottomFrameName);
    }
    public String getTextFromBottomFrame(){
        switchToBottomFrame();
        String textFromBottomFrame = driver.findElement(body).getText();
        switchToMainArea(); //out of bottom frame
        return textFromBottomFrame;
    }
}


/*
public class NestedFramePage {

    private WebDriver driver;
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By body = By.tagName("body");

    public NestedFramePage(WebDriver driver){
        this.driver = driver;
    }

    public String getLeftFrameText(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame(); //exit left to top
        driver.switchTo().parentFrame(); //exit top to main
        return text;
    }

    public String getBottomFrameText(){
        driver.switchTo().frame(bottomFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame(); //exit top to main
        return text;
    }

    private String getFrameText(){
        return driver.findElement(body).getText();
    }
}
*/
