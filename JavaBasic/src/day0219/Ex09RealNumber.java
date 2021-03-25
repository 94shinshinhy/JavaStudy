package day0219;
// 기본형 데이터타입 02

// 실수형 데이터타입

// 실수란?
// 소숫점이 있는 숫자

// 자바에서는 실수형 데이터타입에
// float과 double 2가지가 있다.
// float : 32비트
// double : 64비트
// 자바에서는 코드상의 실수를 기본적으로 double로 인식한다.
// 따라서 우리도 실수 변수를 만들어야 할 때는
// double로 만들어주면 된다.

// 비록 float은 int와, double은 long와 크기가 같지만
// 데이터손실이라는 관점 때문에
// 실수형 공간에 정수형 값을 담을 때에는
// 암시적 형변환이 일어나고
// 반대의 경우에는
// 우리가 명시적 형변환을 해주어야 한다.
public class Ex09RealNumber {
    public static void main(String[] args) {
        // double 변수 d를 만들고 3.33을 넣어보자
        
        double d = 3.33;
        System.out.println("double 변수 d의 현재 값 : ");
        System.out.println(d);
        
        // 만약 우리가 float 변수를 만들어야 하고
        // 그 안에 실수 값을 초기화 해야한다면 어떻게 해야할까?
        
        // 자바에서의 실수는 기본적으로 double로 인식되고
        // double이 float보다 큰 데이터타입이기 때문에
        // float 변수에 실수값을 곧장 초기화 할 수 없다.
        
        float f;
        
        // 1. float을 명시적 형변환한 실수 값을 넣는다.
        f = (float)3.3;
        System.out.println("float 변수 f에 현재 값 : ");
        System.out.println(f);
        
        // 코드에 적혀있는 실수와 데이터타입이 float인 것을
        // 명시해준다.
        // 실수값 뒤에 f를 붙여주면 float형 실수가 만들어지게 된다.
        f = 4.4f;
        System.out.println("float 변수 f에 현재 값 : ");
        System.out.println(f);
        
        // 정수형 값을 실수형 공간에 넣어보기
        d = 5;
        System.out.println("double 변수 d에 현재 값 : ");
        System.out.println(d);
        
        // int 변수에 상수 값 넣어보기
        int number = (int)3.141;
        System.out.println("int 변수 number에 현재 값 : ");
        System.out.println(number);        
    }
}




