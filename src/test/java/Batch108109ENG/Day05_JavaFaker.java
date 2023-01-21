package Batch108109ENG;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Day05_JavaFaker {

    /*
     * TEST DATA : username , password , URL , test enviroment , city,ssn,....etc.
     *

      * WHERE DO YOU GWT YOUR TEST DATA?

     * -BA-Business Analyst(Writes the acceptance criteria(AC))
     * -Test Lead
     * -Manual Tester
     * -Tech Lead(Team Lead)
     * -Developer
     * -We can get retreive data from the database
     * -We can retrieve data from API
     * -Documentation .For example swagger doc. can be used for API
     * -If we need mock data(fake data),we can use the Java Faker
     * -NOTE : Java Faker generates data randomly
     * */

    @Test
    public void javaFaker(){
        // 1.CREATE THE FAKER OBJECT
        Faker faker = new Faker();

        //2.NOW THAT WE HAVE FAKER OBJECT WE CAN GENRATE THE FAKE DATA GENERATING USERNAME
        String firstName =faker.name().firstName();
        System.out.println(firstName);

        //GENERATE FAKER LAST NAME
        String lastName =faker.name().lastName();
        System.out.println(lastName);

        //GENRATE FAKER USERNAME
        String username=faker.name().username();
        System.out.println(username);

        //GENARATE FAKER TITLE
        String title = faker.name().title();
        System.out.println(title);

        //GENERATE FAKER CITY
        String city = faker.address().city();
        System.out.println(city);

        //GENRATE FAKER STATE
        String state = faker.address().state();
        System.out.println(state);

        //GENARATE FAKER FULL ADDRESS
        String fullAddress = faker.address().fullAddress();
        System.out.println(fullAddress);

        //GENARATE FAKER CELL PHONE NUMBER
        String cellPhone = faker.phoneNumber().cellPhone();
        System.out.println(cellPhone);

        //GENARATE FAKER EMAIL
        String email = faker.internet().emailAddress();
        System.out.println(email);

        //GENARATE FAKER ZIPCODE(POSTCODE|)
        String zipCode = faker.address().zipCode();
        System.out.println(zipCode);

        //GENRATE FAKER RANDOM DIGIT NUMBER
        String randomDigits = faker.number().digits(10);
        System.out.println(randomDigits);
    }
}
