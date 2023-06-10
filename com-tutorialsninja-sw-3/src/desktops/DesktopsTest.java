package desktops;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import units.Utility;

public class DesktopsTest extends Utility {
    String baseurl = "http://tutorialsninja.com/demo/index.php?";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {

        Actions actions = new Actions(driver);
        WebElement Desktop = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[1]"));

        WebElement showme = driver.findElement(By.xpath("//a[contains(text(), \"Show AllDesktops\")]"));
        showme.click();


        WebElement desk = driver.findElement(By.id("input-sort"));
        Select select = new Select(desk);
        select.selectByVisibleText("Name (Z - A)");


    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        Actions actions = new Actions(driver);
        WebElement Desktop = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[1]"));

        WebElement showme = driver.findElement(By.xpath("//a[contains(text(), \"Show AllDesktops\")]"));
        showme.click();


        WebElement desk = driver.findElement(By.id("input-sort"));
        Select select = new Select(desk);
        select.selectByVisibleText("Name (A - Z)");

        WebElement hp = driver.findElement(By.xpath("//div[@class='caption']/h4/a[contains(text(),\"HP LP3065\")]"));
        hp.click();

        /*String year = "2023";
        String month = "jun";
        String date = "15";

        driver.findElement(By.xpath("//input[@id='onward_cal']")).click();

        while (true) {
            String monthYear = driver.findElement(By.xpath("//th[contains(text(),\"April 2011\")]")).getText(); // jun 2024
            String arr[] = monthYear.split(" ");
            String mon = arr[0];
            String year1 = arr[1];

            System.out.println(mon);
            System.out.println(year1);

            if (mon.equalsIgnoreCase(month) && year1.equalsIgnoreCase(year)) {
                break;
            } else {
               // clickOnElement(By.xpath("//td[@class='next']"));
                WebElement next = driver.findElement(By.xpath("//table/thead/tr/th[@class='next']"));
                next.click();

            }
        }

        List<WebElement> listOfDates = driver.findElements(By.xpath("//div[@class='bootstrap-datetimepicker-widget dropdown-menu top pull-right picker-open']/div/div/table/tbody/tr[5]"));
        for (WebElement dt : listOfDates) {
            if (dt.getText().equalsIgnoreCase(date)) {
                dt.click();
                break;
            }
        }*/
        driver.findElement(By.xpath("//div/input[@id='input-quantity']")).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.xpath("//div/input[@id='input-quantity']")).sendKeys(Keys.DELETE);

        WebElement qtyField=driver.findElement(By.xpath("//div/input[@id='input-quantity']"));
        qtyField.sendKeys("1");


        WebElement addButton=driver.findElement(By.xpath("//button[@id='button-cart']"));
        addButton.click();

       /* WebElement welcome = driver.findElement(By.xpath("//div[@id='product-product']/div[1]"));
        String actualmessage = welcome.getText();
        String expectedmessage = "Success: You have added";
        Assert.assertEquals("Verifying Message",expectedmessage,actualmessage);
        System.out.println(actualmessage);*/

        click1(By.xpath("//div[@id='product-product']/div[1]/a[2]"));  // click on Shopping Cart link

        WebElement welcome1 = driver.findElement(By.xpath("//div[@id='content']/h1"));
        String actualmessage1 = welcome1.getText();
        String expectedmessage1 = "Shopping Cart  (1.00kg)";
        Assert.assertEquals("Verifying Message",expectedmessage1,actualmessage1);
        System.out.println(actualmessage1);






    }

    @After
    public void tearDown() {
        //closeBrowser();
    }


}
