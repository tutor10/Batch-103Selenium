package day01_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_ManageMethodOdevSlayt26 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();// Bos bir Browser actik

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// Bu method sayfadki her bir webelement icin
        // max.bekleme suresini belirler




        //1. Yeni bir Class olusturalim.C07_ManageWindowSet
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/"); // Or driver.get("https://www.amazon.com/") yapabiliriz

        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(80,10));
        driver.manage().window().setSize(new Dimension(800,600));

        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        int x=driver.manage().window().getPosition().getX();
        int y=driver.manage().window().getPosition().getY();
        int width=driver.manage().window().getSize().getWidth();
        int height=driver.manage().window().getSize().getHeight();

        if (x==80 && y==100 && width==800 && height==600){
            System.out.println("Test PASSED");
        }else{
            System.out.println("TEST FAILED");
        }

        //6. Sayfayi kapatin

        driver.close();
    }
}
