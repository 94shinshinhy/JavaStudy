package day0219;
// 주석(comment)
// 주석이란 설명글을 뜻한다.
// 우리가 java 파일에 코드를 적게 된다면
// 해당 java 파일은
// 컴파일이라는 과정을 거쳐서
// JVM에서 실행 가능한 자바 실행파일인
// class 파일이 된다.

// 클래스파일을 실행하면
// 우리가 적은 코드가 JVM의 실행영역에 등록이 되면서
// 차례대로 코드가 실행되면서 프로그램이 작동하게 된다.

// 컴파일의 경우 우리가 적은 코드에서 문법적 오류가 발생할 경우
// 컴파일 자체가 되지 않는다.
// 따라서 우리가 설명을 그냥 적게 된다면
// 코드 파일은 그 설명을 코드라고 생각하고
// 문법적으로 맞지 않기 때문에
// 에러가 발생하게 된다.

// 따라서 우리가 코드에 대한 설명을 적기 위해서는
// 이 글자들이 진짜 코드가 아니라 설명이라는 것을
// 자바에게 알려주어야한다.

// 이렇게 자바에게 "설명글이니 컴파일 할 때 무시해라"라고 등록하는
// 설명글들을 우리가 "주석"이라고 부른다.

// 주석에는 한줄 주석과 여려줄 주석 두가지가 있다.

// 한줄 주석은 //로 시작하며
// 그 줄이 끝날 때 까지의 모든 글자들을 주석으로 등록한다.

// 여러줄 주석은 /*로 시작하며
// */가 나올 때 까지의 모든 줄을 주석으로 등록한다.
public class Ex03Comment {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        /*System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        */
    }
}




