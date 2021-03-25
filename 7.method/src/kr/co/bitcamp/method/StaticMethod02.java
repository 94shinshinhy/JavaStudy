package kr.co.bitcamp.method;

/*
 *  static 선언이 안되어있는 메서드 사용하는 방법에 대해서 코드로 구현해보시오.
 */

public class StaticMethod02 {
    
    public static void main(String[] args) {
        // helloWorld();            // main 메서드는 static 메서드만 호출할 수 있기때문에 에러
        StaticMethod02 sMethod = new StaticMethod02();
        sMethod.hellowWorld();            // 객체 생성 후 메서드 호출
    }
    
    public void hellowWorld() {
        System.out.println("Hello World!");
    }

}
