package day0222;
// 연산자01
// 산술연산자
// 산술연산자는 우리가 실생활에서도 주로 쓰는
// 사칙연산에 나누기 연산자까지 합하여 총 5가지가 있다.

// 산술연산자의 경우
// 서로 다른 데이터타입을 연산할 때에는
// 결과는 크기가 더 큰 데이터타입으로 나온다.
// 예시 : byte와 int형 산술연산하면 결과는 int가 된다.
// 또는 정수와 실수를 산수연산하게 된다면
// 결과는 실수가 되게 된다.
public class Ex01Operator01 {
    public static void main(String[] args) {
        // 1. 정수와 정수의 산술연산
        int number = 5;
        int number2 = 8;
        
        System.out.println("number + number2 = " + (number + number2));
        System.out.println("number + number2 = " + (number - number2));
        System.out.println("number + number2 = " + (number * number2));
        System.out.println("number + number2 = " + (number / number2));
        System.out.println("number + number2 = " + (number % number2));
        
        // 2. 실수와 실수의 산술연산
        double d1 = 5.0;
        double d2 = 8.0;
        
        System.out.println("d1 + d2 = " + (d1 + d2));
        System.out.println("d1 + d2 = " + (d1 - d2));
        System.out.println("d1 + d2 = " + (d1 * d2));
        System.out.println("d1 + d2 = " + (d1 / d2));
        System.out.println("d1 + d2 = " + (d1 % d2));
        
        // 3. 정수와 실수의 산술연산
        System.out.println("number + d2 = " + (number + d2));
        System.out.println("number + d2 = " + (number - d2));
        System.out.println("number + d2 = " + (number * d2));
        System.out.println("number + d2 = " + (number / d2));
        System.out.println("number + d2 = " + (number % d2));
        
        // 4. String의 경우
        //    + 산술연산자를 사용하여
        //    2개의 "글자들"로 합쳐서
        //    하나의 커다란 String을 만들어 줄 수 있다.
        //    이때는 String + String 또는
        //    String + 다른 데이터타입 혹은
        //    다른 데이터타입 + String을 하여
        //    커다란 1개의 String을 만들어 줄 수 있다.
        
        // int + int
        // String + int
        // int + String을 통해 알아보자
        
        System.out.println(3+5);
        // 아래는 +의 의미가
        // 두개의 숫자를 더하라는 의미가 아닌
        // 앞의 String 뒤에 String을 이어서
        // 한개의 String으로 붙여라 라는 의미가 된다.
        System.out.println("3"+"5");
        
        // 아래의 경우
        // 뒤의 int값 5를 String "5"로 바꾸어
        // 앞의 "3" 뒤에 이어붙여서 "35"라는
        // String으로 만들라는 의미가 있다.
        System.out.println("3"+5);
        
        // 아래의 경우
        // 앞의 int 값 3을 String "3"으로 바꾸어
        // 앞의 "3" 뒤에 위의 String "s"를 이어붙여서
        // "35"라는 String으로 만들라는 의미가 있다.
        System.out.println(3+"5");
    }
}



















