package Batch108109ENG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day02_WebDriverManager {

    public static void main(String[] args) {

        //1.SET UP
        //System.setProperty("webdriver.chrome.driver", "./src/resources/drivers/chromedriver.exe");
        //We no longer need to use System.setPorperty.We can use WebDriverManager API

        WebDriverManager.chromedriver().setup();
        //REST IS THE SAME

        //2.CREATE
        WebDriver driver = new ChromeDriver();
        //3.MAXIMIZE THE WINDOW
        driver.manage().window().maximize();
        //4.WAITING TIME BETWEEN WINDOWS
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //going to page
        driver.get("https://techproeducation.com");
        //close
        driver.quit();
    }
}
