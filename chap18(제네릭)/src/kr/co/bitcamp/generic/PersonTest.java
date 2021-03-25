package kr.co.bitcamp.generic;

public class PersonTest {

    public static void main(String[] args) {
        
        // Person 제네릭클래스에 T를 String만 들어오게끔 무조건 생성함.
        Person<String> person = new Person<>();
        person.setT("이성계");
        String str = person.getT();
        System.out.println(str);
        
        // 데이터의 통일화, 타입 변환 제거, 컴파일 예외를 발생(타입 체크)
        Person<Integer> person2 = new Person<>();
        person2.setT(100);        // 자동 박싱
        int value = person2.getT();        // 자동 언박싱
        System.out.println(value);
        
        Person<Apple> person3 = new Person<>();
        person3.setT(new Apple());
        Apple apple = person3.getT();
        System.out.println(apple);
        
    }

}



















