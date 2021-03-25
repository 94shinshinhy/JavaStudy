package kr.co.bitcamp.anonymous;

public class ChildTest {

    public static void main(String[] args) {
        
        // 익명자손객체(이름없음) -- UI 이벤트처리나 스레드 객체 간편하게 생성시 사용
        Parent parent = new Parent() {                // 원래 타입이 클래스
            
            int b = 20;
            
            public void method1() {
                System.out.println("익명자손객체의 메서드");
            }
            
            @Override
            public void method() {                
                int a = 10;
                System.out.println("a : " + a);
                System.out.println(this.b);
                this.method1();
            }
        };
        
        parent.method();
//        parent.b;                // 부모 타입 멤버가 아님
//        parent.method1();
        
    }
    
}
