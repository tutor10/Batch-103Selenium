package Batch108109ENG;

import org.junit.Assert;
import org.junit.Test;

public class Day03_Assertions {

     @Test
    public void assertions(){

         /*
         *WHAT IS THE ASSERTIONS IN TESTING?
         * -Assertion is done to check if expected result is equal to actual result
         * -expected == actual-->PASS
         * -expected != actual-->FAIL
         ------------------------------------------------
         * assertEquals("expected","actual");

         * assertTrue(true);-->PASS
         * assertTrue(false);-->FAIL

          * assertFalse(false);-->PASS
          * assertFalse(true);-->FAIL
          ------------------------------------------------
         */
         Assert.assertEquals(5,5);//PASS


         if("Java".contains("apple")){//FAIL
             System.out.println("PASS");
         }else
             System.out.println("FAIL");


         Assert.assertEquals("java","java");//PASS
         Assert.assertEquals("java".contains("j"),true );//PASS
//  -----------------------------------------------------------
         Assert.assertTrue("java".contains("j"));//PASS
//  ------------------------------------------------------------
          Assert.assertFalse("Java".contains("j"));//PASS--WE MAY MIGHT TO USE FALSE ALWAYS

//       *TEST EXECUTION STOPS IF ONE THE ASSERTION FAILS.THIS IS CALLED HARD ASSERTIONS
//       *TEST EXECUTION CONTINUES EVEN IF TEST VERIFICATION FAILS.VERIFICATION MEANS LIKE IF STATEMENT

//        *WHAT DIFFERENCE BETWEEN ASSERTION AND VERIFICATION?
//        *-Assertion stops after assertion fails.Verification continues even after verification fails
//        *-JUnit assertions ar hard asssertion.If statement is verification.
//        *NOTE :TestNG has soft assertion aswell,We'll learn it in TestNG


}
}
