package Batch108109ENG;

import org.junit.*;

public class Day02_JUnitAnnotations {

    /*
     *So far we kept using main method
     * We no longer need to use main method to create test cases with JUnit
     * -@Test : is used to create test cases
     * NOTE : All @Test methods must be VOID
     * -@Before  : RUNS BEFORE EACH @Test CLASS.This is used to run repeated before pre conditions.
     * For example,setup,create driver,maximize window
     * -@After   : RUNS AFTER EACH @Test CLASS .This is used to run repeated after conditions.
     * For example,driver quit,report generation
     * -@BeforeClass :Runs before each CLASS only once.THIS METHOD MUST BE static
     * -@AfterClass : Runs after each CLASS only once .THIS METHOD MUST BE static
     * -@Ignore : Is used to skip / Ignore a test case
     */

    @BeforeClass
    public static void setupClass(){
        System.out.println("Before Class Runs before the entire class");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After Class Runs after the entire class");
    }

    @Before
    public void setUp(){
        System.out.println("Before Method Runs before each @Test annotation");
    }
    @After
    public void tearDown(){
        System.out.println("After Method Runs after each @Test annotation");
    }

    @Ignore
    @Test
    public void test01(){
        System.out.println("Test1");
    }
    @Test
    public void test02(){
        System.out.println("Test2");
    }
    @Test
    public void test03(){
        System.out.println("Test3");
    }
    @Test
    public void test04(){
        System.out.println("Test4");
    }
    @Test
    public void test05(){
        System.out.println("Test5");
    }
}
