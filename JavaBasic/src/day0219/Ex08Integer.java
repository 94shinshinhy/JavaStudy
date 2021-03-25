package day0219;
// 기본형 데이터 타입 01
// 정수형 데이터타입

// 정수란?
// 소숫점(실수부)가 존재하지 않는 온전한 숫자

// 기본형 데이터타입 중
// 정수형 데이터타입은 다음과 같다.
// byte(8비트)
// byte는 총 2의 8승개의 숫자를 저장 가능하다.
// 범위는 -2의 7승 ~ 2의 7승 - 1까지이다.
// 10진법 기준 +- 128정도이다.

// short(16비트)
// short는 총 2의 16승개의 숫자를 저장 가능하다.
// 범위는 -2의 15승 ~ 2의 15승 - 1까지이다.
// 10진법 기준 +- 32000정도이다.

// int(32비트)
// int는 총 2의 32승개의 숫자를 저장 가능하다.
// 범위는 -2의 31승 ~ 2의 31승 - 1까지이다.
// 10진법 기준 +- 29억정도이다.

// long(64비트)
// long는 총 2의 64승개의 숫자를 저장 가능하다.
// 범위는 -2의 63승 ~ 2의 63승 - 1까지이다.
// 10진법 기준 +-900경정도이다.

// 비트란?
// 비트란 2진법 자릿수를 뜻한다.
// 즉 8비트는 2진법 8자리 숫자 한개를 뜻하게 된다.
// 비트는 컴퓨터의 저장 단위 중 가장 작은 단위이며
// 8비트는 1바이트가 된다.

// 자바에서는 코드에 적혀있는 10진법 숫자를
// int로 인식한다.

// 예전과는 다르게 컴퓨터의 자원(=리소스)가 넉너하기 때문에
// 우리가 값의 범위에 따른 데이터 타입을 까다롭게 고를 필요가 사라졌다.
// 대략적으로 +- 20의 안의 값일 경우엔 int를, 그거를 벗어날 경우에는
// long를 사용하면 된다.

// 오버플로우와 언더플로우
// 지정한 데이터타입의 최대값 혹은 최소값을 넘는 값이 들어오게 되면
// 오버플로우 혹은 언더플로우라는 버그가 발생하게 된다.
// 오버플로우란, 데이터타입의 가능한 최대 값보다 큰 값이 들어와서
// 음의 범위로 바뀌는 것을 오버플로우라고 한다.

// 언더플로우란, 데이터타입의 가능한 최소 값보다 작은 값이 들어와서
// 양의 범위로 바뀌는 것을 언더플로우라고 한다.

// 오버플로우와 언더플로우가 발생할 가능성이 있을 때에는 자바가 컴파일러에 체크해서
// 에러를 발생시킨다.
// 단, 우리가 명시적 형변환을 통해서 강제로 오버플로우 혹은 언더플로우를 발생시켜줄 수도 있다.
public class Ex08Integer {
    public static void main(String[] args) {
        // byte 변수를 선언해보자
        byte b;
        
        // byte 변수 b에 값을 초기화해보자
        b = 30;
        
        // byte 변수 b에 현재 저장된 값을
        // 화면에 출력해보자
        System.out.println("byte 변수 b에 현재 저장된 값 : ");
        System.out.println(b);
        
        // byte 변수 b에 새로운 값을
        // 할당해보자
        b = 20;
        
        // byte 변수 b에 저장된 값을
        // 화면에 출려해보자
        System.out.println("byte 변수 b에 현재 저장된 값 : ");
        System.out.println(b);
        
        // byte에 할당할 수 없는 값을 넣어보자
        //b = 200;
        
        // 상수를 선언해보자
        // 변수와 상수는 선언과 초기화를 한줄에 해줄 수 있다.
        final byte BYTE = 10;
        
        // byte 상수 BYTE에 현재 저장된 값을
        // 화면에 출력해보자
        System.out.println("byte 상수 BYTE에 현재 저장된 값 : ");
        System.out.println(BYTE);
        
        // 상수는 한번 값이 초기화가 되면 더 이상 변경이 되지 않기 때문에
        // 상수에 어떤 값을 할당하려고 하던간에 에러가 발생한다.
        //BYTE = 30;
        //BYTE = 10;
        
        // 오버플로우와 언더플로우 경험해보기
        // 1. 오버플로우
        
        // byte 변수 b에 byte가 타입 캐스팅된 140을 넣어보자
        b = (byte)140;
        
        // 140을 byte로 바꾸게 되면?
        // 140 = 128 + 12
        // 128은 byte를 기준으로 하면
        // 오버플로우가 발생하여 -128이 되는 값이다.
        // 즉 -128 + 12가 되어
        // -116이 되게 한다.
        
        System.out.println("byte 변수 b에 현재 저장된 값 : ");
        System.out.println(b);
        
        // 언더플로우 경험해보기
        
        // byte 변수 b에 -150을 넣어보자
        b = (byte)-150;
        System.out.println("byte 변수 b에 현재 저장된 값 : ");
        System.out.println(b);
    }
}



