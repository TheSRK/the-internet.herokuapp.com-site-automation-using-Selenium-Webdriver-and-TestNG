package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By forgotPasswordLink = By.linkText("Forgot Password");
    private By hoverLink = By.linkText("Hovers");
    private By alertLink = By.linkText("JavaScript Alerts");
    private By wEditorPageLink = By.linkText("WYSIWYG Editor");
    private By frameLink = By.linkText("Frames");
    private By dynamicLoadingLink = By.linkText("Dynamic Loading");
    private By largeAndDeepDomLink = By.linkText("Large & Deep DOM");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Clicking Forgot Password Link and Returning Forgot Password Page
    public ForgotPasswordPage clickForgotPassword(){
        driver.findElement(forgotPasswordLink).click();
        return new ForgotPasswordPage(driver);
    }

    //Clicking Hover link and Retuning Hover Page
    public HoverPage clickHover(){
        driver.findElement(hoverLink).click();
        return new HoverPage(driver);
    }

    //clicking Alert link and returning Alert Page
    public AlertPage clickJsAlert(){
        driver.findElement(alertLink).click();
        return new AlertPage(driver);
    }

    //clicking WYSIWYG Editor
    public EditorPage clickWysiwygEditor(){
        driver.findElement(wEditorPageLink).click();
        return new EditorPage(driver);
    }

    //click Frame link
    public FramePages clickFrameLink(){
        driver.findElement(frameLink).click();
        return new FramePages(driver);
    }

    //click Dynamic loading link
    public DynamicLoadingPage clickDynamicLoading(){
        driver.findElement(dynamicLoadingLink).click();
        return new DynamicLoadingPage(driver);
    }

    //click large and deep dom link
    public LargeAndDeepDom clickLargeAndDeepDomLink(){
        driver.findElement(largeAndDeepDomLink).click();
        return new LargeAndDeepDom(driver);
    }
}
