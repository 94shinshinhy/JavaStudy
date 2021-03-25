package kr.co.bitcamp.exception03;

public class ThrowsTest {
    
    // 아래 main에서 throws Exception 구문 추가시엔 JVM에게 예외를 던진다.
    public static void main(String[] args) /* throws Exception */ {
        
        try {
            method1();
        } catch (Exception e) {
            System.out.println("예외발생 : 0으로 나눌 수 없습니다.");
            // e.printStackTrace();
        }
        
    }
    
    /*
     *  throws는 메서드 선언부 끝에 작성을 하며,
     *  호출한 곳으로 예외를 되던지며, 호출한 곳에서 반드시 예외를 처리해야 함    
     */
    public static void method1() throws Exception {
        method2();        
    }
    
    public static void method2() throws Exception {
        System.out.println(10/0);        // 산술예외(실행예외)
    }

}
