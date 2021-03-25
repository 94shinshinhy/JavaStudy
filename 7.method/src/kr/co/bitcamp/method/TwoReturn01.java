package kr.co.bitcamp.method;

import java.util.Arrays;

/*
 *  2개의 정수형 값을 리턴하는 메서드를 구현하시오.
 *  
 */

public class TwoReturn01 {
    
    public static void main(String[] args) {
    
        int[] res = testMethod();            // 배열 변수 선언
        System.out.println(res);
        System.out.println(res[0] + ", " + res[1]);
        System.out.println(res[0] + res[1]);
        System.out.println(Arrays.toString(res));            // 반복문 사용없이 모든 요소를 출력
        
    }
    
    public static int[] testMethod() {
        
        int num1 = 100;
        int num2 = 200;
        int num3 = 300;
        
        return new int[] {num1, num2, num3};
        
    }
    
}
