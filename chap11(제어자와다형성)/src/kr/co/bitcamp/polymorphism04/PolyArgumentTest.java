package kr.co.bitcamp.polymorphism04;

public class PolyArgumentTest {

    public static void main(String[] args) {
        
        Buyer buyer = new Buyer();
        buyer.buy(new TV());
        
        System.out.println("현재 남은 돈 : " + buyer.money + "만원입니다.");
        System.out.println("현재 보너스포인트 : " + buyer.bonusPoint + "점입니다.");
        
        buyer.buy(new Audio());
        buyer.buy(new Computer());
        
        System.out.println("현재 남은 돈 : " + buyer.money + "만원입니다.");
        System.out.println("현재 보너스포인트 : " + buyer.bonusPoint + "점입니다.");
        
        // Apple클래스는 Product클래스의 자손이 아니기 때문에 컴파일 에러가 발생함
        // buyer.buy(new Apple());        
        
        // 필드의 다형성
        Product product1 = new TV();
        Product product2 = new Computer();
        Product product3 = new Audio();
        Product[] pArr = new Product[10];

    }

}
