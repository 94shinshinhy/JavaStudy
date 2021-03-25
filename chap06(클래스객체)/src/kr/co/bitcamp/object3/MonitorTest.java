package kr.co.bitcamp.object3;

public class MonitorTest {

    public static void main(String[] args) {
        
        // monitor 참조변수는 리모컨과 같은 것임.
        Monitor monitor = new Monitor();
        
        //System.out.println(monitor);
        
        monitor.power();
        monitor.power();
        monitor.power();
        
        monitor.channel = 5;
        monitor.channelUp();
        monitor.channelUp();
        monitor.channelDown();
        monitor.channelDown();
        
        monitor.volume = 10;
        monitor.volumeUp();
        monitor.volumeUp();
        monitor.volumeDown();
        monitor.volumeDown();
        
        System.out.println(monitor);
        
        monitor.power();        

    }

}
