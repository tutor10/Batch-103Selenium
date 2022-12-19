package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {

    static WebDriver driver;

    public static void main(String[] args) {

        /*
        Ilk once driver'i maximize yapalim,sonra tum sayfa icin max bekleme suresi olarak 15 saniye belirtelim
        Sirasiyle amazon,facebook,youtube sayfalarina gidelim
        Amazon sayfasina tekrar donelim
        Amazon sayfasinin Url'nin https://www.amazon.com/adresine esit oldugunu test edelim
        Sayfanin konumunu ve pozisyonunu yazdiralim
        Sayfanin konumunu ve size'ni istedigimiz sekilde ayarlayalim
        ve istedigimiz sekilde oldugunu test edelim
        Sayfayi kapatalim.
        */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        driver=new ChromeDriver();
       // WebDriver driver = new ChromeDriver();// Bos bir Browser actik

        // Ilk once driver'i maximize yapalim,sonra tum sayfa icin max bekleme suresi olarak 15 saniye belirtelim
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Sırasıyla amazon,facebook ve youtube sayfalarına gidelim.
        driver.get("https://www.amazon.com");
        driver.get("https://www.facebook.com");
        driver.get("https://www.youtube.com");

        //Amazon sayfasına tekrar dönelim.
        driver.navigate().back();
        driver.navigate().back();

        //Amazon sayfasının Url'inin https://www.amazon.com/ adresine eşit olduğunu test edelim
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("Url TESTİ PASSED");
        }else System.out.println("Url TESTİ FAILED");

        //Sayfanın konumunu ve size'ını yazdıralım
        System.out.println("Sayfanın size'i : "+driver.manage().window().getSize());
        System.out.println("Sayfanın konumu : " + driver.manage().window().getPosition());

        //Sayfanın konumunu ve size'inı istediğimiz şekilde ayarlıyalım
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));
        System.out.println("Sayfanın yeni size'i : "+driver.manage().window().getSize());
        System.out.println("Sayfanın yeni konumu : " + driver.manage().window().getPosition());

        //ve istediğimiz şekilde olduğunu test edelim
        Dimension actualYenisize = driver.manage().window().getSize();
        if(actualYenisize.getWidth()==600 && actualYenisize.getHeight()==600){
            System.out.println("Size TESTİ PASSED");
        }else System.out.println("Size TESTİ FAILED");

        Point actualYeniKonum = driver.manage().window().getPosition();
        if(actualYeniKonum.getX()==50 && actualYeniKonum.getY()==50){
            System.out.println("Konum TESTİ PASSED");
        }else System.out.println("Konum TESTİ FAILED");

        //ve sayfayı kapatalım
        driver.close();
    }
}