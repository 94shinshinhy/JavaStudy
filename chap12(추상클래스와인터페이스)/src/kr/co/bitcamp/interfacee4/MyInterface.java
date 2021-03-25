package kr.co.bitcamp.interfacee4;

/*
 *  abstract
 *  static final
 *  default
 *  static
 */

public interface MyInterface {

    int MAX_NUM = 100;                // static final 상수
    
    public void method();             // 추상메서드 선언(본질)
    
    // JDK1.8부터 추가된 멤버
    default void dMethod() {
        System.out.println("MyIntetface의 디폴트 메서드 호출");
    }
    
    /*
     *  구현클래스들에게 전혀 영향을 끼치지 않고, 디폴트메서드가 필요한 구현클래스에서만
     *  오버라이딩을 해서 사용하면 된다.
     */
    static void sMethod() {
        System.out.println("MyInterface의 정적 메서드 호출");
    }
    
}



















