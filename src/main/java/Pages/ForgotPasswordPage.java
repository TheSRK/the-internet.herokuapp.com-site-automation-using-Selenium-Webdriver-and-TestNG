package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By inputEmailfield = By.id("email");
    private By retrivePasswordButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }
    public void inputEmail(){
        driver.findElement(inputEmailfield).sendKeys("test@test.com");
    }

    public EmailSent clickRetrivePasswordButton(){
        driver.findElement(retrivePasswordButton).click();
        return new EmailSent(driver);
    }
}
