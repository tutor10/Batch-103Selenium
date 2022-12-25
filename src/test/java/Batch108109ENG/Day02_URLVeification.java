package Batch108109ENG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day02_URLVeification {

    public static void main(String[] args) {

        //1.SET UP
        System.setProperty("webdriver.chrome.driver", "./src/resources/drivers/chromedriver.exe");
        //2.CREATE
        WebDriver driver = new ChromeDriver();
        //3.MAXIMIZE THE WINDOW
        driver.manage().window().maximize();
        //4.WAITING TIME BETWEEN WINDOWS
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       driver.get("https://techproeducation.com/");

        //Verify if  homepage url is "https://techproeducation.com/"
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://techproeducation.com/";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("PASSED");
        }else System.out.println("FAILED");
        System.out.println("Actual URL="+actualUrl);
        System.out.println("Expected URL="+expectedUrl);

        /*
           WHAT IS YOUR APPROACH FOR AUTOMATION?
           -I read the acceptance criteria carefully
           -I then create my test cases
           -Then I do my manual testing FIRST
             -If all good,then I start complete my automation script
             -If I find a bug / defect ,then I talk to dev.,DEV. fixes the issue,then I RETEST
              If all is good then complete my automation script
           -When the automation is complete,I prepare the report for the user story.In fact,My automation script
            genarates html reports for us.I upload those report to the JIRA.
           -For my manual test cases, I manually take screenshots and prepare reports and attach them to the JIRA.
------------------------------------------------------------------------------------------------------------------------
           WHAT DO YOU DO WHEN YOUR AUTOMATION TEST CASE PASS?
           -Prepare report and upload to JIRA
------------------------------------------------------------------------------------------------------------------------
           WHAT DO YOU DO WHEN YOUR TEST CASE FAIL?
           -Retest to make sure from the  failure.It can be data issue,type,documentation issue or is can be a real bug
           -If that is a bug,then talk to the DEV. and let them fix the bug.
           -After the fix,we retest.When the test cases passes we upload to JIRA
------------------------------------------------------------------------------------------------------------------------
           WHAT DO YOU DO WHEN YOU FIND A BUG?
           -Retest to make sure from the  failure.It can be data issue,type,documentation issue or is can be a real bug
           -If that is a bug,then talk to the DEV. and let them fix the bug.
           -After the fix,we retest.When the test cases passes we upload to JIRA

         */


    }

}
