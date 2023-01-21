package Batch108109ENG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day04_LinkTexts {

    WebDriver driver;

    @Before
    public void steUp(){
        WebDriverManager .chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(15));

    }
    //LINKTEST AND PARTIALLINKTEST ARE CASE SENSITIVE
    @Test
    public void LMSPage(){
        driver.get("https://techproeducation.com/");

        //Click on  LMS Login
        //LMS LOGIN IS A LINK
        //TEXT OF THAT LINK IS "LMS LOGIN"
        driver.findElement(By.linkText("LMS LOGIN")).click();
        //Verify LMS page is visible
        String actualURL = driver.getCurrentUrl();
        String expectedURL ="https://lms.techproeducation.com/";
        Assert.assertEquals("LMS LOGIN IS NOT DISPLAYED",expectedURL,actualURL);
        //MESSAGE ONLY BE VISIBLE IF ASSERTION FAILS : LMS LOGIN PAGE IS NOT DISPLAYED
    }
    @Test
    public void LMSPagePartialLinkTest(){
        driver.get("https://techproeducation.com/");
        driver.findElement(By.partialLinkText("LMS L")).click();

        //ALTERNATIVELY WE CAN LOCATE A CORE ELEMENT ON LMS PAGE AND CHECK IF THAT ELEMENT IS DISPLAYED ON THE PAGE
        WebElement loginElement=driver.findElement(By.linkText("Login/Register"));
        Assert.assertTrue(loginElement.isDisplayed());//isDisplayed() returns TRUE if is element on the page,
                                                     //returns FALSE if is not displayed on the page

       //Assert.assertTrue(driver.findElement(By.linkText("Login/Register")).isDisplayed()); either you can use this

    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
