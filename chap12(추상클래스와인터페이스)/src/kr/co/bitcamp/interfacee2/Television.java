package kr.co.bitcamp.interfacee2;

public class Television implements RemoteControl {
    
    private int volume;

    @Override
    public void turnON() {
        
        System.out.println("Television의 turnOn()");
        
    }

    @Override
    public void turnOff() {
        
        System.out.println("Television의 turnOff()");
        
    }

    @Override
    public void setVolume(int volume) {
        
        if(volume > RemoteControl.MAX_VOLUME) {
            System.out.println("최대 볼륨은 : " + RemoteControl.MAX_VOLUME);
            this.volume = RemoteControl.MAX_VOLUME;            
        }
        else if(volume < RemoteControl.MIN_VOLUME){
            System.out.println("최소 볼륨은 : " + RemoteControl.MIN_VOLUME);
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else {
            this.volume = volume;
        }
        System.out.println("현재 볼륨은 : " + this.volume);
        
    }

    
    
}
