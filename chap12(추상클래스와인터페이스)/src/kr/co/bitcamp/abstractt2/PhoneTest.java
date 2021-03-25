package kr.co.bitcamp.abstractt2;

public class PhoneTest {

    public static void main(String[] args) {
        
        // 추상클래스는 인스턴스를 생성할 수 없다.
        // Phone phone = new Phone(111, "홍길동", "갤럭시21");
        
        SmartPhone s = new SmartPhone(202103, "삼성", "이순신");
        s.showInfo();
        s.turnOn();        
        s.internetSearch();
        s.turnOff();
        System.out.println("--------------------");
        
        TripleCameraPhone t = new TripleCameraPhone(201112, "애플", "이방원");
        t.showInfo();
        t.turnOn();
        t.cameraOn();
        t.cameraOff();
        t.turnOff();
        System.out.println("--------------------");
        
        Phone[] phone = new Phone[10];
        phone[0] = new SmartPhone(201106, "샤오미", "이성계");
        phone[1] = new TripleCameraPhone(201112, "엘지", "박지성");
        
        phone[0].turnOn();
        phone[0].turnOff();
        phone[1].turnOn();
        phone[1].showInfo();
        phone[1].turnOff();

    }

}



















