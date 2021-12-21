package Pages;

import io.netty.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class DynamicExample2Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By finalText = By.id("finish");
    private By loadingText = By.id("loading");

    public DynamicExample2Page(WebDriver driver){
        this.driver = driver;
    }

    //click start button
    public void clickStart(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(finalText));

    }

    public String getText(){
        return driver.findElement(finalText).getText();
    }
}
