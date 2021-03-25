package kr.co.bitcamp.inheritance01;

/*
 *  [1] 상속(inheritance)이란?
 *   부모 클래스가 가지고 있는 속성(변수)들과 기능(메서드)들을 그대로 물려받아서
 *   새로운 클래스를 만드는 것
 *   이때 물려받게되는 원본 클래스를 부모클래스(Parent class), 슈퍼클래스(Super class)라고 부른다. 기초/기반 클래스(Base class)
 *   
 *   상속받아 새롭게 만들어진 클래스를 자식클래스(Child class), 서브/하위클래스(Sub class)라고 부른다. 파생 클래스(Derived class)
 *   
 *  [2] 상속의 장점
 *   가장 큰 장점 --> 재활용성
 *   부모에 정의되어져있는 멤버필드(변수)나 메서드들을 그대로 상속받아 사용하면된다.
 *   상속받은 메서드라고해도 필요에 따라서 자식 클래스에서 용도를 변경해서 사용하는 것도 가능
 *   
 *  [3] 상속의 사용
 *   생성자는 상속이 안된다.
 *   부모 클래스는 접근제한자 private인 경우에는 아무리 자식클래스가 상속을 받았다 하더라고 접근 불가능
 *   
 */

public class Bicycle {

    int id;
    String brand;
    String owner;
    
}
