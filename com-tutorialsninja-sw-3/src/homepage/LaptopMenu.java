package homepage;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LaptopMenu extends BaseTest {
    String baseurl = "http://tutorialsninja.com/demo/index.php?";
    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void selectMenu1(){

        Actions actions = new Actions(driver);
        WebElement laptop = driver.findElement(By.xpath("//div/ul[@class='nav navbar-nav']/li[2]"));

        WebElement showme = driver.findElement(By.xpath("//div/ul[@class='nav navbar-nav']/li[2]/div/a"));
        showme.click();

        WebElement welcome = driver.findElement(By.xpath("//h2"));
        String actualmessage = welcome.getText();
        String expectedmessage = "Laptops & Notebooks";
        Assert.assertEquals("Verifying Laptops Message",expectedmessage,actualmessage);




    }
    @After
    public void tearDown() {
        //closeBrowser();
    }
}
