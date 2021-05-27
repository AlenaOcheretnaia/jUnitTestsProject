import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static worknumbersstream.StreamMain.oddMoreThanZeroNaturalOrder;

public class netJunitTests {
    private static long suiteStartTime;
    private long testStartTime;

    @BeforeAll
    static void initSuite() {
        System.out.println("Running Netology JUnit Tests by Alena Ocheretnaia");
        suiteStartTime = System.nanoTime();
    }
    @AfterAll
    static void completeSuite() {
        System.out.println("Netology JUnit Tests completed: " + (System.nanoTime() - suiteStartTime));
    }
    @BeforeEach
    void initTest() { System.out.println("Starting new Test");
        testStartTime = System.nanoTime();
    }
    @AfterEach
    void finalizeTest() {
        System.out.println("Test completed:" + (System.nanoTime() - testStartTime));
    }

    @Test
    void streamPositiveOddNatOrderTest() {
        System.out.println("Test1: worknumbersstream package: Positive Odd Natural Order Filter with Stream" );
        //test data
        List<Integer> testList = Arrays.asList(1, 5, 4, 2, -1);
        //expected result
        List<Integer> expectedList = Arrays.asList(2, 4);
        Assertions.assertEquals(expectedList, oddMoreThanZeroNaturalOrder(testList),"Stream filter works incorrect: ER is not equal AR" );
    }

    private static List<List<Integer>> generateIntegerLists() {
        List<List<Integer>> listOfArguments = new LinkedList<>();
        listOfArguments.add(List.of(-1, -6, 4, 5, 2));
        listOfArguments.add(List.of(2, 5, 4, -2, 1));
        listOfArguments.add(List.of(1, -2, 4, 2, -3));
        return listOfArguments;
    }

    @ParameterizedTest
    @MethodSource ("generateIntegerLists")
    void streamPositiveOddNatOrderParamTest(List<Integer> integerList) {
        System.out.println("Test2: worknumbersstream package: Positive Odd Natural Order Filter with Stream" );
        //test data
        List<Integer> testList = Arrays.asList(1, 5, 4, 2, -1);
        //expected result
        List<Integer> expectedList = Arrays.asList(2, 4);
        Assertions.assertEquals(expectedList, oddMoreThanZeroNaturalOrder(testList),"Stream filter works incorrect: ER is not equal AR" );
    }

    @Test
    void resultNotNull() {
        System.out.println("Test3: worknumbersstream package: result Not Null" );
        List<Integer> testList = Arrays.asList(1, 5, 4, 2, -1);
        Assertions.assertNotNull(oddMoreThanZeroNaturalOrder(testList),"Object is null");
    }

}
