package io.javabrains;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
        MathUtils mathUtils  = new MathUtils();
        //assertThrows(ArithmeticException.class,()->mathUtils.divide(2,0),"Divide");
        assertThrows(NullPointerException.class,()->mathUtils.divide(2,0),"Divide");
    }

    @Test
    void add() {
        //fail("Not yet implemented");
        //System.out.println("Your Test Run");
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1,1);

        assertEquals(expected,actual, "add method");
    }

    @Test
    void computeCircleArea() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(314.1592653589793,mathUtils.computeCircleArea(10));
    }

}