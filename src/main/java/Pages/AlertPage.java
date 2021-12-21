package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button [text() = \"Click for JS Alert\"]");
    private By triggerConfirmAlertButton = By.xpath(".//button [text() = \"Click for JS Confirm\"]");
    private By resultText = By.id("result");

    public AlertPage(WebDriver driver){
        this.driver = driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void alert_Click(){
        driver.switchTo().alert().accept();
    }
    public String getResultText(){
        return driver.findElement(resultText).getText();
    }

    public void triggerConfirmAlert (){
        driver.findElement(triggerConfirmAlertButton).click();
    }

    public void alert_Confirm(){
        driver.switchTo().alert().accept();
    }
    public void alert_dismiss(){
        driver.switchTo().alert().dismiss();
    }


}
