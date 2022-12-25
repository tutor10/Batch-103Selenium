package Batch108109ENG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_BasicNavigations {
      //MAIN METHOD
    public static void main(String[] args) {
        //1.SET UP
        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver.exe");
        //2.CREATE
        WebDriver driver = new ChromeDriver();
        //3.MAXIMIZE THE WINDOW
        driver.manage().window().maximize();
        //4.WAITING TIME BETWEEN WINDOWS
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //STEPS

        //Create a new class under : BasicNavigations
        //Create main method
        //Set Path
        //Create chrome driver
        //Maximize the window


        //Open google home page https://www.walmart.com/.
        driver.get(" https://www.walmart.com/");

        //On the same class, Navigate to amazon home page https://www.amazon.com/
        driver.get("https://amazon.com");

       //Navigate back to google
        driver.navigate().back();

        //Navigate forward to amazon
        driver.navigate().forward();

        //Refresh the page
        driver.navigate().refresh();

        //Close/Quit the browser
       driver.close();
        //driver.quit();//more stronger

        }
    }

