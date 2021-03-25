package day0219;
// 기본형 데이터타입 04
// 논리형 데이터타입

// boolean은 논리형 데이터타입으로써
// 정확히 2개의 값만 존재한다.
// 참을 뜻하는 true와 거짓을 뜻하는 false

// boolean의 경우 우리가 나중에 배우게 될 연산자
// 혹은 메소드의 결과를 그대로 쓰는 편이 대부분이다.
// 즉 변수를 만들어서 쓰는 경우는 드물다.

// 하지만 boolean 값 자체는 프로그램에 필수적으로 사용이 된다.
// 왜냐하면 어떠한 조건식이 참일 때 실행 혹은 반복이 되는
// 제어문이라는 개념에서 boolean 값에 따라서 실행 혹은 반복이 되기 때문이다.
public class Ex11Boolean {
    public static void main(String[] args) {
        // boolean 값은 true / false라는 키워드로 지정이 되어있고
        // 우리가 boolean 변수의 초기화에서는 해당 키워드를 사용하면 된다.
        boolean b = true;
        System.out.println("boolean 변수 b에 현재 값 : ");
        System.out.println(b);
        
        b = false;
        System.out.println("boolean 변수 b에 현재 값 : ");
        System.out.println(b);
    }
}




