package day0224;

// 반복문 02 = for 반복문

// while 반복문은 특정 조건을 만족하는 동안 계속 반복이었다면
// for 반복문은 제어변수를 직접 만들어서 그 변수를 조건식에 활용해서
// 좀 더 횟수가 명확하다.

public class Ex04For1 {

    public static void main(String[] args) {
        
        // for 반복문은 기본적으로 다음과 같은 구조를 가진다.
        for (int i = 1; i <= 3; i++) {
            System.out.println("i의 현재 값 : " + i);
        }
        
        // for 반복문의 코드 순서를 알아보자
        // 1. int i = 1;
        //    이 int 변수 i는 for 반복문의 반복 여부를 결정하는
        //    조건식에서 사용될 변수이다.
        //    변수의 이름은 마음대로 적어도 되지만
        //    전통적으로 i, 그 안의 for문은 j, 그 안의 for 문은 k...
        //    이렇게 i, j, k 순으로 이름 지어지는 게 전통이다!
        //    그리고 해당 i의 유효범위는 for문 전체가 된다.
        
        // 2. i <= 3;
        //    해당 조건식이 true가 나오면 for문의 코드 블락을 실행한다.        
        
        // 3. i++
        //    for문의 코드블락이 모두 실행되고 나면
        //    변수 i의 값을 변화시키는 코드이다.
        //    ++ 뿐만이 아니라, 변수의 값을 변경할 수 있는 할당연산자라면
        //    뭐든 사용 가능하다.
        //    값이 변경되고 나면 조건식을 다시 체크한다.
        
        // for문에 관한 여러가지 팁
        // 1. for문의 제어변수의 초기화나 조건식에는 다른 변수를 사용해서
        //    초기화식 혹은 조건식을 만들어 줄 수도 있다.
        System.out.println("----------1번----------");
        int start = 1;
        int end = 3;
        for(int i = start; i <= end; i++) {
            System.out.println(i);
        }
        
        // 제어변수의 이름은 중요하지않다.
        System.out.println("----------2번----------");
        for(int myNumber = 1; myNumber <= 4; myNumber++) {
            System.out.println(myNumber);
        }
        
        // 3. i가 증가할때에는 <, <=을 사용하지만
        //    i가 감소할때에는 >, >=을 주로 사용한다.
        System.out.println("----------3번----------");
        for(int i = 4; i >= 1; i--) {
            System.out.println(i);
        }
        
    }

}



















