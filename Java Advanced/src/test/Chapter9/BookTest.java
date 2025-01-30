package Chapter9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {


    @Test
    @DisplayName("Determine Book Type")
    void testDetermineType(){
        //Assign
        int pages = 7;
        String expected = "Article";

        //Actual
        Book objbook = new Book();
        String actual = objbook.determineType(pages);

        //Assert -basically check if the actual and expected are equal
      //  assertEquals(expected,actual,"The expected book type is: "+ expected);
        //Boundary value assertions
        //Maximum Test coverage
        //remember this tests for multiple conditions
        Assertions.assertAll(
                ()->assertEquals("No type",objbook.determineType(0)),
                ()->assertEquals("Article",objbook.determineType(1)),
                ()->assertEquals("Article",objbook.determineType(12)),
                ()->assertEquals("Article",objbook.determineType(15)),
                ()->assertEquals("Research Paper",objbook.determineType(16)),
                ()->assertEquals("Research Paper",objbook.determineType(25)),
                ()->assertEquals("Research Paper",objbook.determineType(50)),
                ()->assertEquals("Book",objbook.determineType(51)),
                ()->assertEquals("Book",objbook.determineType(74))
        );
    }

    //Test to see if exceptions are thrown
    @Test

    @DisplayName("Should not create a book with zero pages")
    void shouldNotCreatABookWithZeroPages(){
        //assign
        int pages = 0;
        assertThrows(IllegalArgumentException.class, ()-> new Book("2025001503","Haibo",pages) );



        //assert

    }
}