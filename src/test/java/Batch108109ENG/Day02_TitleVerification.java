package Batch108109ENG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day02_TitleVerification {

    public static void main(String[] args) {

        //1.SET UP
        System.setProperty("webdriver.chrome.driver", "./src/resources/drivers/chromedriver.exe");
        //2.CREATE
        WebDriver driver = new ChromeDriver();
        //3.MAXIMIZE THE WINDOW
        driver.manage().window().maximize();
        //4.WAITING TIME BETWEEN WINDOWS
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //Navigate to techproeducation homepage
        driver.get("https://www.techproeducation.com");


        //get the title
        String actualTitle = driver.getTitle();
        String expectedTitle = "Techpro Education Online It Courses & Bootcamps";

        //Verify if page title i“Techpro Education |Online It Courses & Bootcamps"
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title PASSED");
        }else {
            System.out.println("Title FAILED");
        }

        driver.close();


        }
    }
