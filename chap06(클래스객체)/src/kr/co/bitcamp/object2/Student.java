package kr.co.bitcamp.object2;

public class Student {

    // 멤버필드(변수)
    String name;
    int age;
    
    // Object 클래스의 toString() 오버라이딩(재정의)
    @Override
    public String toString() {
        
        String str = "이름 : " + this.name +         // this : 클래스의 주소(new라는 연산자가 인스턴스를 생성하면 비로소 활성화됨)
                ", 나이 : " + this.age;              // this는 static메서드나 클래스 앞에 사용할 수는 없다.
        
        return str;
    }
    
//    public static String getName() {
//        return this.name;
//    }
    
}



















