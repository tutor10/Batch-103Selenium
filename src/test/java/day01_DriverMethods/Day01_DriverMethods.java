package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();// Bos bir Browser actik

        driver.get("https://www.amazon.com");//Ilk olarak gitmek istedigimiz sayfayi belirtiriz

        System.out.println("Sayfa Basligi:"+driver.getTitle());

        System.out.println("Sayfa Url'i:"+driver.getCurrentUrl());

       // System.out.println(driver.getPageSource());//sayfanin kaynak kodlarini veirir

        System.out.println(driver.getWindowHandle());//Bize o Window a ait hash dergerini veriri.Biz bu hash degerlerini
                                                    // Bir String'e atayip pencereler arasi gecis yapabiliriz.




    }
}
