package kr.co.bitcamp.polymorphism03;

public class Child extends Parent {
    
    int x = 200;
    
    @Override
    public void methot() {
        System.out.println("자손메서드 호출");
    }

}
