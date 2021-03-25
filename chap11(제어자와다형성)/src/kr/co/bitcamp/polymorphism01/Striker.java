package kr.co.bitcamp.polymorphism01;

public class Striker extends Player {
    
    private int shoot;

    public Striker(String name, int age, int backNumber, int speed, int shoot) {
        super(name, age, backNumber, speed);
        this.shoot = shoot;
    }
    
    public int getShoot() {
        return this.shoot;
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("유효슈팅 : " + this.shoot);
    }
    
    

}
