package kr.co.bitcamp.finalconstant;

/*
 *  final 초기화 방법
 *  1) 선언과 동시에 초기화
 *  2) 생성자에서 단 한번 초기화
 */

public class Person {

    final String nation = "KOREA";            // 상수선언
    final int age;
    /*
     *  불변의 정적 상수
     *  무조건 선언과 동시에 초기화가 반드시 되어야함.
     *  공용데이터로써 사용되어짐.
     *  클래스별로 관리가 되어짐(인스턴스별 x)
     */
    static final int MAX_NUMBER = 1000;       // 불변의 정적 상수
    
    
    public Person(int age) {
        this.age = age;
    }
    
//    @Override
//    public String toString() {
//        
//        return "nation : " + this.nation + 
//                ", age : " + this.age;
//    }
    
}



















