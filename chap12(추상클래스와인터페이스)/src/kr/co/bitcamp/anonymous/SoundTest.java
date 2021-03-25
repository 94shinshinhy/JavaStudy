package kr.co.bitcamp.anonymous;

public class SoundTest {

    public static void main(String[] args) {
        
        // 익명구현객체(이름 없음) -- UI 이벤트처리나 스레드 객체 간편하게 생성시 사용
        Soundable soundable = new Soundable() {        // 원래 타입이 인터페이스임
                                                       // 익명구현객체안에 있는 생성자를 호출함
            
            // 내부적으로 클래스니까 멤버들을 선언할 수 있음
            // 대신 외부에서 접근이 불가
            int a = 10;
            
            public void method() {
                System.out.println("익명구현객체의 메서드");
            }
            
            @Override
            public void sound() {
                String str = "냄비";
                System.out.println("첫번째 익명구현객체 : " + str);
                System.out.println(str + "에 물을 담습니다.");
                System.out.println(str + "에 숟가락으로 소리를 냅니다.");
                
                this.method();
                System.out.println(this.a);
            }
        };
        
        soundable.sound();
    }
    
}
