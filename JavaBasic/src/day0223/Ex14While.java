package day0223;
// 반복문
// 반복문이란 특정 조건을 만족하는 동안 코드를 반복시키게 하는 명령문이다.
// 반복문에는 크게
// while 반복문과 for 반복문 2가지가 있다.
// for 반복문의 경우, 비교적 명확하게 반복할 횟수가 지정된다.
// while 반복문의 경우, 조건식이 true인 동안 계속 반복이 된다.

// while 반복문은 다음과 같은 구조를 가진다.
// while(조건식){
//     조건식이 참인 동안 실행할 코드
//
// }

public class Ex14While {

    public static void main(String[] args) {
        
        int number = -3;
        
        while(number >= 0) {
            System.out.println("while 반복문 반복중");
            System.out.println("number의 현재 값 : " + number);
            number--;
        }
        
        System.out.println("프로그램 종료");

    }

}
