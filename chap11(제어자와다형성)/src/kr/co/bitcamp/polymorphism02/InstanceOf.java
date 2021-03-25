package kr.co.bitcamp.polymorphism02;

public class InstanceOf {

    public static void main(String[] args) {

        // ctrl + t : 상속계층도를 볼 수 있는 단축키
        SportCar sportCar = new SportCar();
        
        if(sportCar instanceof SportCar) {
            System.out.println("SportCar로 타입 변환이 가능합니다.");
        }
        
        if(sportCar instanceof Car) {
            System.out.println("Car로 타입 변환이 가능합니다.");
        }
        
        if(sportCar instanceof Object) {
            System.out.println("Object로 타입 변환이 가능합니다.");
        }
        
    }

}
