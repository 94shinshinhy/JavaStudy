package kr.co.bitcamp.interfacee;

// 인터페이스의 본질은 추상메서드임
public interface Creature {
    
    int MAX = 10;                        // static final int MAX = 10;과 같음. 컴파일러가 add해줌. 부수적 멤버개념
    public void method();                // abstract 생략가능. 컴파일시에 컴파일러가 add해줌.
    
}
