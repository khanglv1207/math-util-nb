package com.khanglv.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    //Test case voi 5 giai thua
    @Test
    public void testFactorialGivenRightArg5RunsWell(){
        int n = 5; // cho/given n = 5
        long expectedResult = 120; //hy vọng 5! ở trên sẽ là 120
        long actualValue = MathUtility.getFactorial(n); // thực tế là máy đoán xem

        assertEquals(expectedResult,actualValue);
    }

    @Test
    public void testFactorialGivenRightArg4RunsWell(){
        assertEquals(24,MathUtility.getFactorial(4));
    }

    //Test case boi 0
    @Test
    public void testFactorialGivenRightArg0RunsWell(){
        assertEquals(6,MathUtility.getFactorial(3));
    }





}