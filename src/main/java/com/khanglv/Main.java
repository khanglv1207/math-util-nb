package com.khanglv;

import com.khanglv.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArg0RunsWell();
        testFactorialGivenRightArg1RunsWell();
        testFactorialGivenWrongArgMinus2ThrowException();

    }

    public static void testFactorialGivenWrongArgMinus2ThrowException(){
        {
            //MathUtility.getFactorial();

        }
    }

    //CODE CÁC TEST CASE ĐỂ TEST HÀM CHẠY ĐÚNG SAI - THỰC HÀNH TDDp
    //HÀM NÀY ỨNG VỚI 1 TEST CASE, TEST CASE VỚI N - 0 HÀM TEAR VỀ NGON
    //TÊN HÀM MANG Ý NGHĨA TEST CASE LUÔN, ĐỂ GIÚP DÂN DEV KIỂM TRA TÍNH THIẾU ĐỦ CÁC TEST CASE > TRÁNH NGHỊCH LÍ THUỐC TRỪ SÂU
    public static void testFactorialGivenRightArg0RunsWell(){
        int n = 0; // cho/given n = 0
        long expectedResult = 1; //hy vọng 0! ở trên sẽ là 1
        long actualValue = MathUtility.getFactorial(n); // thực tế là máy đoán xem
        // so sánh giữa expectedValue và actual
        System.out.println("Expected: " + expectedResult + ",Actual: " + actualValue);
        System.out.println("Satus: "+(expectedResult == actualValue));
    }



    public static void testFactorialGivenRightArg1RunsWell(){
        int n = 5; // cho/given n = 5
        long expectedResult = 120; //hy vọng 5! ở trên sẽ là 120
        long actualValue = MathUtility.getFactorial(n); // thực tế là máy đoán xem
        // so sánh giữa expectedValue và actual
        System.out.println("Expected: " + expectedResult + ",Actual: " + actualValue);
        System.out.println("Satus: "+(expectedResult == actualValue));
    }



}