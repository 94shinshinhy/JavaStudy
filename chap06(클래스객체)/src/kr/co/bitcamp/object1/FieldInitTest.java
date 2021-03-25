package kr.co.bitcamp.object1;

public class FieldInitTest {

    public static void main(String[] args) {
        
        // 붕어빵을 찍고있다.
        // 제품을 생산하고있다.
        
        /*
         *  new 연산자 : 클래스에 있는 멤버들의 바이트 크기만큼
         *             heap(힙)에다가 메모리를 할당하며 동시에 초기화를 시켜주는 역할을 함.
         *             
         *  this : 객체 자기자신의 주소
         *  super : 조상 객체의 주소
         */
        
        FieldInit fInit = new FieldInit();
        System.out.println(fInit.byteField);
        System.out.println(fInit.shortField);
        System.out.println(fInit.intField);
        System.out.println(fInit.longField);
        System.out.println(fInit.booleanField);
        System.out.println(fInit.charField);
        System.out.println(fInit.floatField);
        System.out.println(fInit.douleField);
        System.out.println(fInit.arrField);
        System.out.println(fInit.strField);
        
        System.out.println(fInit);
        System.out.println(fInit.toString());            // Object의 toString() 호출함.

    }

}



















