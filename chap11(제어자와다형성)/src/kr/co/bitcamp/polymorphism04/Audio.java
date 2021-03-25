package kr.co.bitcamp.polymorphism04;

public class Audio extends Product {
    
    public Audio() {
        // 조상클래스의 매개변수가 있는 생성자 Product(int price){}를 호출
        super(100);
    }
    
    @Override
    public String toString() {
        return "Audio";
    }

}
