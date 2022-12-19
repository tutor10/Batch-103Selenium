package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_ClassWork1 {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();// Bos bir Browser actik


              //Amazon sayfasina gidelim. https://www.amazon.com/

        driver.get("https://www.amazon.com");//Ilk olarak gitmek istedigimiz sayfayi belirtiriz

              //Sayfa basligini(title) yazdirin

        System.out.println("Sayfa Basligi:"+driver.getTitle());

             //Sayfa basliginin “Amazon” icerdigini test edin

        String actualTitle=driver.getTitle();
        if(actualTitle.contains("Amazon")) {
            System.out.println("Title Testi PASSED");
        }else
            System.out.println("Title Testi FAILED");

        //Sayfa adresini(url) yazdirin

        System.out.println("Sayfa Url'i:"+driver.getCurrentUrl());

        // Sayfa url’inin “amazon” icerdigini test edin.

        String actualUrl=driver.getCurrentUrl();
        if(actualUrl.contains("amazon")){
            System.out.println("URL Testi PASSED");
        }else
            System.out.println("URL Testi FAILED");

        // Sayfa handle degerini yazdirin

        System.out.println(driver.getWindowHandle());//Bize o Window a ait hash dergerini veriri.Biz bu hash degerlerini
        // Bir String'e atayip pencereler arasi gecis yapabiliriz.

        // Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
       // System.out.println(driver.getPageSource());//sayfanin kaynak kodlarini verir

        String actualHtml = driver.getPageSource();
        if(actualHtml.contains("Gateway")){
            System.out.println("HTML Source Code Test PASSED");
        }else
            System.out.println("HTML Sorce Code Test FAILED");

        //Sayfayi kapatin.
        driver.close();//Sayfayi kapatmak icin close() methodu kullaniriz.
        System.out.println("Sayfa Kapandi");





















    }
}
