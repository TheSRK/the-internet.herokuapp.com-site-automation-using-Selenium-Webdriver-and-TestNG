package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditorPage {
    private WebDriver driver;
    private String frameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton =
            By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]/div[2]/div/div[5]/button[2]");

    public EditorPage(WebDriver driver){
        this.driver = driver;
    }

    private void switchToIframe(){
        driver.switchTo().frame(frameId);
    }

    public void clearEditorBox (){
        switchToIframe();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    /**
     *
     * @param text = input parameter from FrameTests page
     */
    public void writeInsideEditor(String text){
        switchToIframe();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void increaseIndentation(){
        driver.findElement(increaseIndentButton).click();
    }

    public String getTextFromEditor(){
        switchToIframe();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    public void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
