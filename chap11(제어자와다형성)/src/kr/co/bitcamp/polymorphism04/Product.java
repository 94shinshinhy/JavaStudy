package kr.co.bitcamp.polymorphism04;

public class Product {

    int price;                // 제품의 가격
    int bonusPoint;           // 제품 구매 시 제공하는 보너스 점수
    
    public Product(int price) {
        super();
        this.price = price;
        this.bonusPoint = (int)(price/10.0);    // 보너스 점수는 제품 가격의 10% 적립
    }
    
}
