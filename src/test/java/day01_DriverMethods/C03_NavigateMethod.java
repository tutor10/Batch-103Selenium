package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();// Bos bir Browser actik

        //Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");//driver.get("https://amazon.com"); olabilir

        //techproeducation sayfasina gidelim
        Thread.sleep(3000);// amazon sayfasindan sonra Techpro'ya gitmeden 3 saniye bekliyor
        driver.navigate().to("https://techproeducation.com");

        //Tekrar Amazon sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();//Amazon sayfasina tekrar geri gider

        //Tekrar techproeducation sayfasina gidlim
        Thread.sleep(3000);
        driver.navigate().forward();//Techpro'ya tekrar gider.

        //Son sayfayi yenileyelim(refresh)
        Thread.sleep(3000);
        driver.navigate().refresh();

        //ve sayfayi kapatalim
        Thread.sleep(3000);
        driver.close();
    }
}
