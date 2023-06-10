package units;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {

    public void click1(By by){
        WebElement cl = driver.findElement(by);
        cl.click();
    }

}