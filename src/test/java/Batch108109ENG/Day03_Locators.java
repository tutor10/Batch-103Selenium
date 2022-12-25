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

public class Day03_Locators {

    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");//sadece bir url ye gidecegi icin before icine yazabiliriz
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void loginTest(){

//        user goes to "http://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
        driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//        Locate the elements of email textbox, password textbox, and signin button
       WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
       WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
       WebElement sign= driver.findElement(By.xpath("//*[@type='submit']"));

//        Enter below username and password then click sign in button

//        Username :  Admin
//        Password : admin123
//                Then verify that the expected user id Admin (USE getText() method to
//                get the text from the page)

        username.sendKeys(" Admin");
        password.sendKeys("admin123");
        sign.click();

//        Verifying the log in os successful
//      1.We can use default page URL to do assertion
//      2.Or we can locate a CORE ELEMENT on the default page to assert is taht elemnt is displayed on the page
//      Login Page :"http://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
//      Default Page : "http://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "http://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        Assert.assertEquals("LOGIN FAILED",expectedURL,actualURL);//If LOGIN successful PASS,if not FAIL and print




//        Verify the Addresses and Sign Out texts are displayed
//        Find the number of total link on the page
//        Sign out from the page



    }
}
