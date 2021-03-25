package kr.co.bitcamp.overriding01;

public class UsbMemory extends HddDisk {
    
    int capacity;
    int rpm;
    
    public UsbMemory() {
        this(100, 720);
    }
    
    // 매개변수가 있는 생성자
    public UsbMemory(int capacity, int rpm) {
        this.capacity = capacity;
        this.rpm = rpm;
    }
    
    // 조상클래스의 메서드를 오버라이딩함
    @Override
    public String status() {
        String str = "USB 용량 : " + this.capacity + "\n" + 
                "USB 속도 : " + this.rpm + "(rpm)";
        return str;
    }
    
    // status() 오버로딩
    public String status(int i) {
        String str = "USB 용량2 : " + i + "\n" + 
                "USB 속도2 : " + this.rpm + "(rpm)";
        return str;
    }

}
