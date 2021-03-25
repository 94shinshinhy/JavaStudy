package kr.co.bitcamp.object4;

public class TimeTest {
    
    public static void main(String[] args) {
        
        Time time = new Time();
        // time.hour = 10; (private으로 불가)
        
        System.out.println(time.getHour());
        System.out.println(time);
        
        // 시를 설정
        time.setHour(11);
        time.setMinute(11);
        time.setSecond(11);
        System.out.println(time);
        
    }
    
}
