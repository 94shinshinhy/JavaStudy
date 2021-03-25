package kr.co.bitcamp.interfacee2;

public class RemoteTest {

    public static void main(String[] args) {
        
        // 인터페이스도 일종의 조상 => 필드의 다형성이 허용됨
        RemoteControl rControl = new Television();
        rControl.turnON();
        rControl.setVolume(15);
        rControl.setVolume(-100);
        rControl.turnOff();
        System.out.println();
        
        rControl = new Audio();
        rControl.turnON();
        rControl.setVolume(15);
        rControl.setVolume(-100);
        rControl.turnOff();

    }

}
