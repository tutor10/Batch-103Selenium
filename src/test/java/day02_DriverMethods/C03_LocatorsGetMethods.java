package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LocatorsGetMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();// Bos bir Browser actik

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// Bu method sayfadki her bir webelement icin
        // max.bekleme suresini belirler

        // Amazon sayfasina gidelim.
        driver.get("https://www.amazon.com");

       // Search bolumunu locate edip iphone kelimesini aratalim.
       WebElement locate= driver.findElement(By.id("twotabsearchtextbox"));
       locate.sendKeys("iphone", Keys.ENTER);
     //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);//bunuda yapabiliriz

        // Arama sonuc yazisinda Iphone yazisini locate edip konsola yazdiralim.
        WebElement aramaSonucYazisi=driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazisi.getText());


      // Sayfayi kapatalim.

        driver.close();
    }
}
