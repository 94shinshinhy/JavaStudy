package kr.co.bitcamp.constructor2;

public class CarTest {

    public static void main(String[] args) {
        
        Car car = new Car();                            // 기본형 차 주문
        System.out.println(car);
        
        Car car2 = new Car("흰색", "오토", 4);            // 직접 차 주문
        System.out.println(car2);
        
        Car car3 = new Car(car);
        System.out.println(car3);
        
        Car car4 = new Car(car2);
        System.out.println(car4);
        
        System.out.println();
        
        for(int i=0; i<10; i++) {
            Car car5 = new Car(car2);
            System.out.println((i+1) + "번째 차 : " + car5);
        }

    }

}