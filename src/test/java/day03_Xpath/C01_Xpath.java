package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();// Bos bir Browser actik

        driver.manage().window().maximize();//Acilan browser'i tam ekran yapar

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// Bu method sayfadki her bir webelement icin
        // max.bekleme suresini belirler

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        Thread.sleep(3000);
        //WebElement addButton = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        WebElement addButtonT = driver.findElement(By.xpath("//*[text()='Add Element']"));
        //               <button onclick="addElement()">Add Element</button>
        // Xpath kullanımında locate edeceğimiz webelement text'e sahipse yukardaki şekilde kullanabiliriz
        addButtonT.click();

        //3 Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if (deleteButton.isDisplayed()){
            System.out.println("Test PASSED!");
        }else System.out.println("Test FAILED!");

        //4 Delete tusuna basin
        Thread.sleep(3000);
        deleteButton.click();

        //5 “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addButonu = driver.findElement(By.xpath("//h3"));
        if (addButonu.isDisplayed()) {
            System.out.println("Add Butonu Testi PASSED");
        }else {
            System.out.println("Add Butonu Testi FAILED");
        }
        driver.close();
    }
}


