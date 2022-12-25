package Batch108109ENG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstClass {
//main method
    public static void main(String[] args) {

        // chrome:wbdriver.chrome.driver
        //System.setProperty("Driver","PATH");

        //1.SETTING THE PATH FOR CHROMEDRIVER
        // System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver");// FOR MAC

        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver.exe");//FOR WINDOWWS

        //2.CREATE CHROME DRIVER
        WebDriver driver = new ChromeDriver();

        //MAXIMIZE THE WINDOW
        driver.manage().window().maximize();

        //WAITING TIME BETWEEN WINDOWS
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //3.WRITE YOUR TEST
        driver.get("https://techproeducation.com");
        //driver.navigate().to("https://techproeducation.com");


    }
}
