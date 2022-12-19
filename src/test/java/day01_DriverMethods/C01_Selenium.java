package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Selenium {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        /*
          En temel haliyle otomosyan yapmak icin Class'imiza otomasyon icin gerekli olan
          webdriver'in yerini gostermemiz gerekir,bunun icin Java kutuphanesinden
          System.setProperty(); methodun icine ilk olarak driver'i yazariz,ikinci olarak driver'in
          fiziki yolunu kopyalariz
       */

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com");

        driver.close();



    }
}
