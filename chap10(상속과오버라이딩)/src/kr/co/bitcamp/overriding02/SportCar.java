package kr.co.bitcamp.overriding02;

public class SportCar extends Car {
    
    public SportCar(int speed) {
        this.speed = speed;
    }
    
    @Override
    public void stop() {
        System.out.println("스포츠 차가 멈춥니다.");
    }

}
