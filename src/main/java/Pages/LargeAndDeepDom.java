package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDom {
    WebDriver driver;
    private By table = By.id("large-table");

    public LargeAndDeepDom(WebDriver driver){
        this.driver = driver;
    }

    //scroll to table
    public void scrollToTable(){
        WebElement tableElement = driver.findElement(table);
        String script = "arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(script, tableElement);
    }

}
