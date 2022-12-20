package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C04_ClassWork {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();// Bos bir Browser actik

        driver.manage().window().maximize();//Acilan browser'i tam ekran yapar

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// Bu method sayfadki her bir webelement icin
        // max.bekleme suresini belirler



        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);
        //WebElement locate= driver.findElement(By.id("twotabsearchtextbox"));boylede yapabiliriz
        //locate.sendKeys("city bike", Keys.ENTER);

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucYazisi = driver.findElements(By.className("sg-col-inner"));
        System.out.println("aramaSonucYazisi="+aramaSonucYazisi.get(0).getText());


        //Arama sonuc saysini konsola yazdiriniz.
        String [] sonucSayisi = aramaSonucYazisi.get(0).getText().split(" ");
        System.out.println("Sonuc Sayisi="+sonucSayisi[2]);

        //Sonuc sayisini LAMBDA ile yazdiriniz.
        Arrays.stream(aramaSonucYazisi.get(0).getText().split(" ")).limit(3).skip(2).forEach(System.out::println);


        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> ilkWe = driver.findElements(By.className("s-image"));
        ilkWe.get(0).click();

        driver.close();

    }
}