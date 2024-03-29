package io.javabrains;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@TestInstance(TestInstance.Lifecycle.PER_METHOD) // default
class MathUtilsTest {

    MathUtils mathUtils;
    TestInfo testInfo;
    TestReporter testReporter;

    @BeforeAll
    static void beforeAllInit(){
        System.out.println("This need to run before all  ... ");
    }

    @AfterAll
    static void AfterAll(){
        System.out.println("This need to run after all  ... ");
    }

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter){
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        mathUtils = new MathUtils();
        testReporter.publishEntry("display Name: " + testInfo.getDisplayName());
    }

    @AfterEach
    void cleanUp(){
        System.out.println("Cleaning up...");
    }

    @Test
    void subtract() {
    }

    @Test
    @DisplayName("Test assert all")
    void multiply() {
        System.out.println("display Name: " + testInfo.getDisplayName());
        assertAll(
                () -> assertEquals(4,mathUtils.multiply(2,2)),
                () -> assertEquals(0,mathUtils.multiply(2,0)),
                () -> assertEquals(-2,mathUtils.multiply(2,-1))
        );
    }

    @RepeatedTest(3)
    void testRepetition(RepetitionInfo repetitionInfo){
        assertEquals(4,mathUtils.add(2,2));
    }

    @Nested
    class nestedAddTest{
        @Test
        void testAddPositive(){
           assertEquals(4,mathUtils.add(2,2));
        }
        @Test
        void testAddNegative(){
            assertEquals(-4,mathUtils.add(-2,-2));
        }
    }

    @Test
    void divide() {
        assertThrows(ArithmeticException.class,()->mathUtils.divide(2,0),"Divide");
        //assertThrows(NullPointerException.class,()->mathUtils.divide(2,0),"Divide");
    }

    @Test
    void add() {
        //fail("Not yet implemented");
        //System.out.println("Your Test Run");
        int expected = 2;
        int actual = mathUtils.add(1,1);

        assertEquals(expected,actual, "add method");
    }

    @Test
    void computeCircleArea() {
        assertEquals(314.1592653589793,mathUtils.computeCircleArea(10));
    }

    @Test
    @DisplayName("Disabled  Test")
    @Disabled
    void testDisabled(){
        fail("This should fail");
    }


}