package kr.co.bitcamp.object4;

public class Time {

    /*
     *  접근제어자 (Access Modifier)의 종류
     *  - private : 같은 클래스내에서만 접근 가능함
     *  - protected : 같은 패키지, 자손클래스에서만 접근 가능
     *  - (default) : 같은 패키지에서만 접근가능
     *  - public : 누구나 다 접근가능
     */
    
    private int hour;
    private int minute;
    private int second;
    
    // getter() : 멤버변수의 값을 읽어가는 메소드
    public int getHour() {
        
        return this.hour;
        
    }
    
    // setter() : 멤버변수의 값을 수정하는 메소드
    public void setHour(int hour) {
        
        // 시에 대한 예외처리 코드를 작성
        if(hour < 0 || hour > 23) {
            System.out.println("시를 잘못입력하셨습니다.");
            return;
        }
        
        this.hour = hour;
        
    }
    
    public int getMinute() {
        
        return this.minute;
        
    }
    
    public void setMinute(int minute) {
        
        if(minute < 0 || minute > 59) {
            System.out.println("분을 잘못입력하셨습니다.");
            return;
        }
        this.minute = minute;
        
    }
    
    public int getSecond() {
        
        return this.second;
        
    }
    
    public void setSecond(int second) {
        
        if(second < 0 || second > 59) {
            System.out.println("초를 잘못입력하셨습니다.");
            return;
        }
        this.second = second;
        
    }
    
    public String toString() {
        return this.getHour() + "시 " + this.getMinute() + "분 " + this.getSecond() + "초";
    }
    
}



















