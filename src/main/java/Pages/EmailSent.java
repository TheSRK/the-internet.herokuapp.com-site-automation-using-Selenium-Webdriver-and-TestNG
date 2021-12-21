package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSent {
    private WebDriver driver;
    private By internalServerErrorText = By.xpath("/html/body/h1");

    public EmailSent(WebDriver driver){
        this.driver = driver;
    }
    public String getErrorText(){
       return driver.findElement(internalServerErrorText).getText();
    }

}
