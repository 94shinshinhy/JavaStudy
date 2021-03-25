package kr.co.bitcamp.variable;


/*
 *  출력시 많이 사용되는 print(), println(), printf() 형식 등에 대해 설명해보시오.
 */

public class VariableDataType {

    public static void main(String[] args) {
        
        // 변수 선언
        int a;
        int b = 33; int c = 90;      // 지역변수는 선언 후 초기화해야함.
        double d;
        char e;
        
        // 선언된 변수에 값을 대입
        a = 10;
        d = 3.14;
        e = 'A';
        
        // 출력
        System.out.println(b);
        
        // 같은 값으로 초기화
        String str1, str2, str3;
        str1 = str2 = str3 = "Korea";
        System.out.println("여러 문자열 변수 한꺼번에 초기화 : " + str1 + ", " + str2 + ", " + str3);
        
        int i, j, k;
        i = j = k = 100;
        System.out.println("여러 정수형 변수 한꺼번에 초기화 : " + i + ", " + j + ", " + k);
        
        float f = 9.81f;
        double dd = 3.1415;
        boolean bl = true;
        byte by = 10;
        
        // printf() --> 지시자를 사용
        // %d(정수), %f(소수점 형식), %c(문자), %s(문자열), %b(부울), %n(줄바꿈), %e(지수), %o(8진수), %x(16진수)
        System.out.printf("나는 %d살의 대학생입니다. 소수점 형식 --> %.1f, %.2f, 문자 --> %c, %b %n", b, f, dd, e, bl);
        System.out.printf("10진수 10은 8진수로는 %o이고, 16진수로는 %x이다.", by, by);
        
    }
    
}



















