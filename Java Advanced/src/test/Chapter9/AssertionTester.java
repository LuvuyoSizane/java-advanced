package Chapter9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionTester {
    @Test
    void testCalculation(){
        //Assign values to expected result
        int num1 =4,num2 =1;
        int expectresult = 5;
        String name1 = "Sadi";
        String name2 = "sadi";
        int [] numbers1 = {5,4,3,2,1};
        int [] numbers2 = {1,2,3,4,5};

        //Actual - actual run the test if  they can add or whatever operation
        int actual = num1+num2;

        //Assert
       // assertEquals(expectresult,actual,"The results should be 5");
        assertTrue(expectresult==actual);
       // assertEquals(name1,name2,"these names are not equals");
       // assertArrayEquals(numbers1,numbers2);
        assertSame(numbers1,numbers2);
    }

    @Test
    void multipleAssertions(){
        //Assign values to expected result
        int num1 =4,num2 =1;
        int expectresult = 5;
        String name1 = "Sadi";
        String name2 = "sadi";
        int [] numbers1 = {5,4,3,2,1};
        int [] numbers2 = {1,2,3,4,5};
        //Actual - actual run the test if  they can add or whatever operation
        int actual = num1+num2;

        //Assert

        Assertions.assertAll(()->assertTrue(expectresult==actual),
                ()-> assertEquals(name1,name2,"these names are not equals"),
                ()->  assertArrayEquals(numbers1,numbers2),
                ()->  assertSame(numbers1,numbers2));

    }
}
