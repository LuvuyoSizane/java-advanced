import org.junit.jupiter.api.*;

public class AnnotationTest {
    @Test
    void justNormalTestMethod(){
        System.out.println("@Test - Just a normal test method");
    }

    @BeforeAll
    static void beforeEverythingElse(){
        System.out.println("@BeforeAll - before any test method can be execited");
    }

    @BeforeEach
    void beforeEachMethod(){
        System.out.println("@BeforeEach - executed before each test method");
    }

    @AfterEach
    void afterEachMethod(){
        System.out.println("AfterEach - executed after each test method");
    }

    @AfterAll
    static void afterAllTheMethods(){
        System.out.println("@AfterAll - executed after all test method can be execited");
    }

    @Test
    void lastNormalTestMethod(){
        System.out.println("@Test - one last a normal test method");
    }
}
