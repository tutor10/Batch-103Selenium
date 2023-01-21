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

public class Day05_RadioButton {

    WebDriver driver;

    @Before
    public void steUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=radio-buttons");

    }

    @Test
    public void radioTest() {

        //SELECT RED BUTTON
        WebElement redOption=driver.findElement(By.xpath("//*[@id='red']"));
        redOption.click();
        Assert.assertTrue(redOption.isSelected());//Verifying the RED RADIO BUTTON isSelected

      //SELECT FOOTBALL OPTION
      WebElement footballOption = driver.findElement(By.xpath("//*[@id='football']"));
      footballOption.click();
      Assert.assertTrue(footballOption.isSelected());//Verifying the FOOTBALL option isSelected

    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
