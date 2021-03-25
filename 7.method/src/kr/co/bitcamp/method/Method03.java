package kr.co.bitcamp.method;

/*
 *  반환값이 있고 받는 인자값이 없는 메서드를 구현해보시오.
 */

public class Method03 {
    public static void main(String[] args) {
        
        int result;
        result = returnMethod();            // 반환값이 있다는 것은 메서드 호출에 따른 리턴값이 있는 것
                                            // 3) 반환값 --> o            받는 인자값 --> x
        System.out.println("메소드 호출에 따른 리턴 된 값 : " + result);
    }
    
    public static int returnMethod() {
        
        int rValue = 100;
        rValue *= 100;        
        return rValue;
        
    }
    
}
