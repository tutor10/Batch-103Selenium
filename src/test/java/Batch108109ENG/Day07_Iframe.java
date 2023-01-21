package Batch108109ENG;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Day07_Iframe extends TestBase {

    @Test
    public void iframeTest() {

//        Go to https://the-internet.herokuapp.com/iframe
        driver.get("https://the-internet.herokuapp.com/iframe");

//        Verify the Bolded text contains “Editor”
        //Header is not in the iframe so do not switch to iframe
        String header = driver.findElement(By.xpath("//h3")).getText();
        String contains = "Editor";
        Assert.assertTrue(header.contains(contains));


        //NOTE:textbox is in the iframe so we have to switch to the iframe
        //GETTING IN THE IFRAME
        //THERE ARE 3 WAYS TO SWITCH TO AN IFRAME
        driver.switchTo().frame(0);//INDEX
//        driver.switchTo().frame("mce_0_ifr");// ID OR NAME
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr'")));//WEBELEMENT OF IFRAME

        //        Locate the text box
        WebElement box = driver.findElement(By.xpath("//p"));

//        Delete the text in the text box
        box.clear();//clear() is used to delete the text is the elements

        //        Type “This text box is inside the iframe”
        box.sendKeys("This text box is inside the iframe");

//        SO FAR DRIVER IS IN THE IFRAME BUT Elemental Selenium text IS OUTSIDE THE FRAME
        //GETTING OUT OF THE FRAME
        driver.switchTo().parentFrame();

//        Verify the text Elemental Selenium text is displayed on the page
        String actualText = driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).getText();
        String expectedText = "Elemental Selenium ";
        Assert.assertTrue(expectedText.contains(actualText));




    }
}
