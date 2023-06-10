package laptopsandnotebooks;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LaptopsAndNotebooksTest extends BaseTest {
    String baseurl = "http://tutorialsninja.com/demo/index.php?";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully(){
        Actions actions = new Actions(driver);
        WebElement Desktop = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[2]"));

        WebElement showme = driver.findElement(By.xpath("//a[contains(text(), \"Show AllLaptops & Notebooks\")]"));
        showme.click();


        WebElement desk = driver.findElement(By.id("input-sort"));
        Select select = new Select(desk);
        select.selectByVisibleText("Price (High > Low)");




    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully(){
        Actions actions = new Actions(driver);
        WebElement Desktop = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[2]"));

        WebElement showme = driver.findElement(By.xpath("//a[contains(text(), \"Show AllLaptops & Notebooks\")]"));
        showme.click();


        WebElement desk = driver.findElement(By.id("input-sort"));
        Select select = new Select(desk);
        select.selectByVisibleText("Price (High > Low)");

        WebElement mac = driver.findElement(By.xpath("//div[@class='caption']/h4/a[contains(text(),\"MacBook\")]"));
        mac.click();

        WebElement addButton=driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']"));
        addButton.click();

        WebElement addlink=driver.findElement(By.xpath("//a[contains(text(),\"shopping cart\")]"));
        addlink.click();

        WebElement qtyField=driver.findElement(By.xpath("//input[@name='quantity[25135]']"));
        qtyField.sendKeys("3");

        WebElement update=driver.findElement(By.xpath("//button[@type='submit']"));
        update.click();



    }
    @After
    public void tearDown() {
        //closeBrowser();
    }
}
