package myaccounts;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyAccountsTest extends BaseTest {
    String baseurl = "http://tutorialsninja.com/demo/index.php?";
    String option;

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

   /* @Test
    public void selectMyAccountOptions1(String option){
        if(option.equalsIgnoreCase("Register")){
            WebElement reg = driver.findElement(By.xpath("//a[contains(text(),\"Register\")]"));
            reg.click();
        }

    }*/

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

        WebElement myac = driver.findElement(By.xpath("//span[contains(text(),\"My Account\")]"));
        myac.click();
        //selectMyAccountOptions1("Register");
        WebElement reg = driver.findElement(By.xpath("//a[contains(text(),\"Register\")]"));
        reg.click();

    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        WebElement myac = driver.findElement(By.xpath("//span[contains(text(),\"My Account\")]"));
        myac.click();
        //selectMyAccountOptions1("Register");
        WebElement log = driver.findElement(By.xpath("//a[contains(text(),\"Login\")]"));
        log.click();
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        WebElement myac = driver.findElement(By.xpath("//span[contains(text(),\"My Account\")]"));
        myac.click();
        //selectMyAccountOptions1("Register");
        WebElement reg = driver.findElement(By.xpath("//a[contains(text(),\"Register\")]"));
        reg.click();

        WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
        fname.sendKeys("Meet");

        WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
        lname.sendKeys("Patel");

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("meetm2@gmail.com");

        WebElement tele = driver.findElement(By.xpath("//input[@name='telephone']"));
        tele.sendKeys("07333444555");

        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        pass.sendKeys("Patel123");

        WebElement cpass = driver.findElement(By.xpath("//input[@name='confirm']"));
        cpass.sendKeys("Patel123");

        WebElement sel = driver.findElement(By.xpath("//div[@class='col-sm-10']/label/input[@value='1']"));
        sel.click();

        WebElement sel1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
        sel1.click();

        WebElement con = driver.findElement(By.xpath("//input[@type='submit']"));
        con.click();


    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        WebElement myac = driver.findElement(By.xpath("//span[contains(text(),\"My Account\")]"));
        myac.click();

        WebElement log = driver.findElement(By.xpath("//a[contains(text(),\"Login\")]"));
        log.click();

        WebElement email = driver.findElement(By.xpath("//input[@id='input-email']"));
        email.sendKeys("meetm2@gmail.com");

        WebElement pass = driver.findElement(By.xpath("//input[@id='input-password']"));
        pass.sendKeys("Patel123");

        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();


    }


    @After
    public void tearDown() {
        //closeBrowser();
    }

}
