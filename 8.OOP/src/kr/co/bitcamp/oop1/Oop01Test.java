package kr.co.bitcamp.oop1;

public class Oop01Test {

    public static void main(String[] args) {
        
        FarmMachine farm = new FarmMachine();
        
        System.out.println(farm);
        
        // 생성된 객체 속성 값 입력하기
        farm.price = 1000000;
        farm.year = 2021;
        farm.color = "black";
        
        // 속성 값 출력
        System.out.println(String.format("%,d", farm.price));
        System.out.println(farm.year);
        System.out.println(farm.color);
        
        //동작 수행
        farm.move();
        farm.dig();
        farm.grind();
        
    }
    
}
