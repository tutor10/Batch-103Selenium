package Batch108109ENG;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Day05_Dropdown {
    WebDriver driver;

    @Before
    public void steUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(15));//15 seconds wait in case needed
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

    }

    @Test
    public void selectByIndexTest() {

        //Select Option 1 by index from the dropdown
        //1.Locate the dropdown
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='dropdown']"));

        //2.Create Select object cause dropdown is in the select tag,this is for only dropdowns
        Select select = new Select(dropdown);

        //3.Select any option using the select object
        select.selectByIndex(1);//index starts from 0
    }

    @Test
    public void selectByVisibleTextTest() {

        //2.Create method selectByVisibleTextTest Select Option 2 value by visible text
        WebElement selectByVisibleTextTest = driver.findElement(By.xpath("//*[@id='dropdown']"));
        Select select1 = new Select(selectByVisibleTextTest);
        select1.selectByVisibleText("Option 2");
    }

    @Test
    public void selectByValueTest() throws InterruptedException {

        //3.Create method selectByValueTest Select Option  by value
        WebElement selectByValueTest = driver.findElement(By.xpath("//*[@id='dropdown']"));
        Select select = new Select(selectByValueTest);
        Thread.sleep(3000);//HARD WAIT.WAITS 3 SECONDS
        select.selectByValue("1");
        Thread.sleep(3000);
        select.selectByValue("2");
        Thread.sleep(3000);
        select.selectByValue("1");
        Thread.sleep(3000);
        select.selectByValue("2");
    }

    @Test
    public void printAllTest() {

        //4.Create method printAllTest Print all dropdown value
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='dropdown']"));
        Select select = new Select(dropdown);
        //getOptions();return all of the dropdown options
        List<WebElement> allOptions = select.getOptions();
        for (WebElement eachOption : allOptions) {
            // getText() returns the TEXT of the Webelements as STRING
            System.out.println(eachOption.getText());
        }
        //5. Verify the dropdown has Option 2 text
        boolean isOption2Exist = false;
        for (WebElement eachOption : allOptions) {
            if (eachOption.getText().equals("Option 2")) {
                isOption2Exist = true;
            }
        }
            // fails if Option 2 is not in the dropdown
            // pass if Option 2 is in the dropdown
            Assert.assertTrue(isOption2Exist);

        }
        @Test
        public void printFirstSelectedOptionTest () {
        //6.Create method printFirstSelectedOptionTest Print first selected option
            WebElement dropdown = driver.findElement(By.xpath("//*[@id='dropdown']"));
            Select select = new Select(dropdown);
            //printing the selected option
            System.out.println("Selected Option=" + select.getFirstSelectedOption().getText());
            //selecting a different option from the dropdown
            select.selectByIndex(2);
            //printing the selected option
            System.out.println("Selected Option=" + select.getFirstSelectedOption().getText());

            //7.Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown

            int numberOfOptions= select.getOptions().size();
            int expectedNumberOfOptions=3;
            //Assertion will print "Expected Is Not Equal Actual" only if this assertions fails
            Assert.assertEquals("Expected Is Not Equal Actual",expectedNumberOfOptions,numberOfOptions);
    }
    @After
    public void tearDown(){
        driver.quit();
    }
    /*
    -WHAT IS A DROPDOWN?
      ---Dropdown is a Webelement.It has list of options

    -HOW DO YOU HANDLE DROPDOWN?WHAT DO YOU DO TO AUTOMATE DROPDOWN?
       ---Dropdowns are created using Select class.So we first locate the dropdown element,then use Select class
          to interact with dropdown elements.

    -HOW DO YOU SELECTDROPDOWN ELEMENTS?
      ----We actually have 3 options to select a dropdown(index,value,visible text)
     */
}