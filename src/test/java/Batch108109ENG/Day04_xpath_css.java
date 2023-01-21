package Batch108109ENG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day04_xpath_css {

    WebDriver driver;

    @Before
    public void steUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(15));

    }
    @Test
    public void loginTest(){

        driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

         //LOCATING USERNAME AND TYPING USERNAME
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");

        //LOCATING PASSWORD AND TYPING PASSWORD
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");

        //LOCATING LOGIN BUTTON AND CLICK
        driver.findElement(By.xpath("//*[@type='submit']")).click();
    }
    @Test
   public void loginTestCss(){

        driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //LOCATING USERNAME AND TYPING USERNAME BY CSSSELECTOR
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");

        //LOCATING PASSWORD AND TYPING PASSWORD
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");

        //LOCATING LOGIN BUTTON AND CLICK
        driver.findElement(By.cssSelector("button[type='submit']")).click();

    }
    @After
    public void tearDown(){
        driver.quit();
    }

    /****************INTERVIEW QUESTIONS**************
    *
     * HOW MANY LOCATORS ARE THERE?
     * ---8 Locators

       WHAT ARE THEY?
     *- id,name,className,linkText,tagName,partialLinkText,xpath,css

       WHICH ONE DO YOU PREFERE?WHY?
     * -First there is ID use id,because id is unique and fast
     * -If there is no id then I use name if there is a unique name
     * I also sometime create dynamic xpath,because some elements do not have stable attributes like id and name.
     * And I can write xpath for any element
     * -I sometimes even use css selector insteadt of xpath.But I personalley use xpath more than css selector.

     * WHAT IS DIFFERENCE BETWEEN ABSOLUTE XPATH AND RELATIVE XPATH ?
     * -Absolute xpath we start from the parent and go child elements one by one
     * -Absolute xpath use /
     * -Absolute xpath may easily be broken when a new element is added on the page
     * -For this reason we should never use absolute xpath.In fact ,my team don't let QA's use absolute xpath

     * ----Relative xpath we don't start from parent and go child one by one .We go straight to the element
     * -Realative xpath use//
     * -Relative xpath is very reliable It doesn't easy broke,because absolute xpath doesn't dependent on other element
     * -I use absolute xpath in my framework when to locate the elements

     * WHAT IS THE DIFFERENCE BETWEEN XPATH AND CSS SELECTOR?
     * -First xpath and css are similar .Both are helpful and there are different ways to create xpath or css
     * -Syntax is a little different
     * -in xpath we use // and @, but in css we don't
     * -css is a little faster than xpath(way less than 1 second),xpath does navigation in the html taht takes a little a bit time
     * -there are more ways to write xpath,For example,dynamic xpath has contains,starts-with,ends-with functions
    * */
}
