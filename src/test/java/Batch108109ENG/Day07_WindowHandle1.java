package Batch108109ENG;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;

public class Day07_WindowHandle1 extends TestBase {

    @Test
    public void windowHandleTest() throws InterruptedException {

//        Given user is on the https://the-internet.herokuapp.com/windows
        driver.get("https://the-internet.herokuapp.com/windows");



//        Then user verifies the text : “Opening a new window”
        String actualWindow1Text = driver.findElement(By.xpath("//h3")).getText();
        String expectedWindow1Text = "Opening a new window";
        Assert.assertEquals(expectedWindow1Text,actualWindow1Text);

//        Then user verifies the title of the page is “The Internet”
        String actualTitle = driver.getTitle();
        String expectedTitle = "The Internet";
        Assert.assertEquals(expectedTitle,actualTitle);

//        When user clicks on the “Click Here” button
        WebElement button =driver.findElement(By.xpath("//*[text()='Click Here']"));
        button.click();


//          GETTING THE WINDOW 1 HANDLE (UNIQUE PAGE ID)
        String window1Handle = driver.getWindowHandle();//RETURN THE CURRENT WINDOW ID
        System.out.println(window1Handle);

//       WE DO TESTING IN A NEW WINDOW ,SO WE MUST SWITCH TO THAT WINDOW
//       AS OF NOW 2 WINDOWS OPEN.USE getWindowHandles() TO GET BOTH IDs
       Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles);
        for (String eachHandle : allWindowHandles){//LOOPING THROUGH THE WINDOW
            if (!eachHandle.equals(window1Handle)) { //if WE ARE NOT IN WINDOWS 1 (MEANS WINDOW 2)
                driver.switchTo().window(eachHandle);//THEN SWITCH THE WINDOW 2

            }
        }

//         AT THIS POINT DRIVER.IS SWITCHED TO WINDOWS 2
        String window2Handle = driver.getWindowHandle();//WINDOW 2 ID


//        Then user verifies the new window title is “New Window”
        String actualWindow2Title = driver.getTitle();
        String expectedWindow2Title ="New Window";
        Assert.assertEquals(expectedWindow2Title,actualWindow2Title);

//        Then user verifies the text: “New Window”
       String actualWindow2Text = driver.findElement(By.xpath("//h3")).getText();
        String expectedwindow2Text = "New Window";
        Assert.assertEquals(expectedwindow2Text,actualWindow2Text);

        Thread.sleep(3000);
//        When user goes back to the previous window and then verifies the title : “The Internet”
        driver.switchTo().window(window1Handle);//SWITCHES WINDOW 1

//     Then user verifies the title ofthe page is   “The Internet”
        String actualTitle1 = driver.getTitle();
        String expectedTitle1= "The Internet";
        Assert.assertEquals(expectedTitle1,actualTitle1);

        Thread.sleep(3000);
//      SWITCH BACK TO WINDOW 2
        driver.switchTo().window(window2Handle);


        Thread.sleep(3000);
//      SWITCH BACK TO WINDOW 1
        driver.switchTo().window(window1Handle);


        Thread.sleep(3000);
//      SWITCH BACK TO WINDOW 2
        driver.switchTo().window(window2Handle);


        Thread.sleep(3000);
//      SWITCH BACK TO WINDOW 1
        driver.switchTo().window(window1Handle);





    }
}
