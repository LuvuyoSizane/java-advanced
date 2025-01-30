package Chapter9;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ParameterizedTests {
    @ParameterizedTest(name ="Execution: {index} - Number: {arguments}")
    @ValueSource(ints = {15,18,25,40,99})
    void checkForEvenNumbers (int num ){
      //  assertEquals(true, (num %2==0), num + " is not an even number");
        assertTrue(num%2==0, num + " is not an even number");
        System.out.println("num = " + num);
    }

    @ParameterizedTest(name="Run: {index} - Word:{arguments}")
    @ValueSource(strings = {"dad", "mom","taco cat","moon","sagas"})
    void checkforPalindrome(String words){
        StringBuilder sb = new StringBuilder(words);
        sb.reverse();
        assertEquals(words,sb.toString());
    }
    @ParameterizedTest
    @CsvSource(value={"Luvuyo,25,6.1,false","Thando,20,5.1,false","Zeee,21,5.6,true"})
    //name,age,height,isMarried
    void testMultipleDataTypes(String name,int age,double height,boolean isMarried){
        assertTrue(isMarried,name + " is not married");
        System.out.println("name = " + name + ", age = " + age + ", height = " + height + ", isMarried = " + isMarried);

    }
    @ParameterizedTest
    @CsvSource(value={"Luvuyo,My Life,51,","Thando,yebolapho,20","Zeee,hau wena,2"})
        //name,age,height,isMarried
    void createMultipleBookObjects(String isbn,String title,int pages){
        Book objBook = new Book(isbn,title,pages);
        System.out.println("isbn = " + objBook.getIsbn() + ", title = " + objBook.getTitle() + ", Type = " + objBook.determineType(pages));

    }

    @ParameterizedTest
    @MethodSource("palindromes")
    @DisplayName("Test for palindromes from a method")
    void testForPalindromesFromMethod(String words){
        StringBuilder sb = new StringBuilder(words);
        sb.reverse();
        assertEquals(words,sb.toString());
    }

    List<String> palindromes(){
        return new ArrayList<>(List.of("dad", "mom","taco cat","moon","sagas"));
    }

    @ParameterizedTest
    @MethodSource
    void streamOfMultipleTypes(String name,int age,double height,boolean isMarried){
        System.out.println("name = " + name + ", age = " + age + ", height = " + height + ", isMarried = " + isMarried);
    }

    Stream<Arguments> streamOfMultipleTypes(){
        return Stream.of(
                Arguments.arguments("Luvuyo",25,6.1,false),
                Arguments.arguments("Luvu",25,6.1,false),
                Arguments.arguments("Luv",22,6.1,false),
                Arguments.arguments("Lu",25,6.1,false)
        );
    }


    @ParameterizedTest
    @MethodSource("Chapter9.BooksBank#bookList")
    void testIfBookContainsMoney(String book){
        assertTrue(book.contains("lambo"),"["+book + "] doesn't contain lambo");
    }

    @ParameterizedTest(name = "[(index)]- {0} is a {2}")
    @CsvFileSource(files="src/test/resource/SuperStars.csv", numLinesToSkip = 1)
    void testForMarriedPersonel(String name,int age,String career,double height ,String nationality ,boolean isMarried){

        System.out.println("Name = " + name + ", age = " + age + ", career = " + career + ", height = " + height + ", nationality = " + nationality + ", isMarried = " + isMarried);
    assertTrue(isMarried,name+ " is not married yet");
    }

    @BeforeAll
    static void setUp(){

    }
}
