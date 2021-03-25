package kr.co.bitcamp.method;

/*
 *  call by value 메서드 호출을 call by reference 방식으로 바꿔서 코드를 구현하시오.
 *  a값이 같은 결과가 나오도록 코드를 수정해보시오.
 */

class CallbyReference{
    int num;
    
    public CallbyReference(int num) {
        
        this.num = num;
        
    }
}

public class MethodCall03 {

    public static void main(String[] args) {
        
        CallbyReference a = new CallbyReference(100);            // 객체 변수 선언
        sum(a);
                
        System.out.println("main() 메서드안에서의 a 값 : " + a);            // a값을 출력해보면 주소가 들어있음
        System.out.println("main() 메서드안에서의 a.num 값 : " + a.num);            // 
        
    }
    
    public static void sum(CallbyReference a) {
        
        a.num += 400;
        System.out.println("sum() 메서드안에서의 a 값 : " + a);            // a값을 출력해보면 주소가 들어있음
        System.out.println("sum() 메서드안에서의 a.num 값 : " + a.num);            //
        
    }
        
}
