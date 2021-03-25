package kr.co.bitcamp.operator;

/*
 *  수치연산에 대해 설명해보시오.
 *  수치연산자를 연산에서 소수점 결과가 예상과 다른게 나오는 것에 대해서 설명해보시오.
 */

public class ArithmeticOperators {
    
    public static void main(String[] args) {
        
        // 수치연산자 --> +, -, *, /(몫), %(나머지)
        
        // 연산의 결과 --> 정수끼리라도 나누기의 경우 소수점 형태가 나올 수 있음.
        int a = 60, b = 8;
        int result1;
        double result2, result3, result4;
        
        result1 = a / b;
        
        System.out.println(result1);     // 7.5가 아니라 7이 출력 --> 타입이 정수형이므로 --> 실수형으로 변환하면 될것임.
        System.out.println((double)result1);     // 이러면 7.5가 아니라 7.0 --> 리턴받는 변수를 실수형으로 하더라도 원하는 결과 얻지 못함.
        
        result2 = (double)a / b;     // 7.5
        System.out.println(result2);     // 어느 한쪽의 값을 double 타입으로 변환 (더 큰 타입으로 변환)
        
        result3 = 100 / (double)3;
        System.out.println(result3);
        
        result4 = 250 / 3.0;
        System.out.println(result4);
        System.out.printf("%.1f %n", result4);
        
    }

}
