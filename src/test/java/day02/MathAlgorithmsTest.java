package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    void getHighestCommonDivisors(){
        MathAlgorithms mathAlgorithms = new MathAlgorithms();

        assertEquals(6,mathAlgorithms.getHighestCommonDivisors(12,18));
        assertEquals(1, mathAlgorithms.getHighestCommonDivisors(25,9));
    }

    @Test
    void getHighestCommonDivisorsWhile(){
        MathAlgorithms mathAlgorithms = new MathAlgorithms();

        assertEquals(6,mathAlgorithms.getHighestCommonDivisors(12,18));
        assertEquals(1, mathAlgorithms.getHighestCommonDivisors(25,9));
    }

}