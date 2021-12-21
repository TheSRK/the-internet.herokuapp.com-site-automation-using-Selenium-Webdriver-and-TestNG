package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String link_xpath = ".//a[ contains(text(), '%s')]";
    private By example2_link = By.xpath(String.format(link_xpath, "Example 2"));

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicExample2Page clickExample2Link(){
        driver.findElement(example2_link).click();
        return new DynamicExample2Page(driver);
    }


}
