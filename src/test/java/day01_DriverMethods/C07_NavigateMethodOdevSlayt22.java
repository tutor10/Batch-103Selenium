package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_NavigateMethodOdevSlayt22 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();// Bos bir Browser actik


       //1. Yeni bir Class olusturalim.C05_NavigationMethods
       // 2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com/");

       // 3. Amazon soyfasina gidelim. https://www.amazon.com/
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.com/");

       // 4. Tekrar YouTube’sayfasina donelim
        Thread.sleep(2000);
        driver.navigate().back();

        //5. Yeniden Amazon sayfasina gidelim
        Thread.sleep(2000);
        driver.navigate().forward();

       // 6. Sayfayi Refresh(yenile) yapalim
        Thread.sleep(2000);
        driver.navigate().refresh();

        //7. Sayfayi kapatalim / Tum sayfalari kapatalim
        Thread.sleep(2000);
        driver.close();
    }
}
