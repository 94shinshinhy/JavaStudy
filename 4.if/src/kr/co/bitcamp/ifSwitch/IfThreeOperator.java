package kr.co.bitcamp.ifSwitch;

/*
 *  삼항연산자 이용하여 12시보다 작으면 오전, 크면 오후를 출력하도록 구현해보시오.
 */

public class IfThreeOperator {

    public static void main(String[] args) {
        
        // 변수 선언
        int hour = 9;
        
        // 삼항연산자 테스트
        String ampm = hour < 12 ? "오전" : "오후";
        System.out.println(ampm);
        
        // 10보다 작거나 같으면 100을 곱하시오.
        int result = hour <= 10 ? hour*100 : hour;
        System.out.println(result);
    }
    
}
