package homepage;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TopMenuTest extends BaseTest{
    String baseurl = "http://tutorialsninja.com/demo/index.php?";
    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void selectMenu(){

        Actions actions = new Actions(driver);
        WebElement Desktop = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[1]"));

        WebElement showme = driver.findElement(By.xpath("//a[contains(text(), \"Show AllDesktops\")]"));
        showme.click();

        WebElement welcome = driver.findElement(By.xpath("//h2"));
        String actualmessage = welcome.getText();
        String expectedmessage = "Desktops";
        Assert.assertEquals("Verifying Desktop Message",expectedmessage,actualmessage);




    }
    @After
    public void tearDown() {
        //closeBrowser();
    }



}
