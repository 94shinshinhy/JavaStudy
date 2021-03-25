package kr.co.bitcamp.singleton;

public class User {

    // 1) 해당 클래스에 자신의 타입으로 정적 멤버 선언과 동시에 생성함
    private static User singleton = new User();
    
    // 2) 해당 클래스를 외부에서 new 연산자로 인스턴스를 생성하지못하게 막음
    private User() {
    }
    
    // 3) 해당 클래스 멤버의 주소를 넘겨주기위해(공유) 외부에서 호출할 수 있는 getter()메서드를 제공
    public static User getInstance() {
        return User.singleton;
    }
    
}



















