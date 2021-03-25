package kr.co.bitcamp.equals;

public class ObjectEqualsTest {

    public static void main(String[] args) {
        
        // 아래 코드는 서로 주소가 다르다.
        Object obj1 = new Object();
        Object obj2 = new Object();
        
        boolean res1 = obj1.equals(obj2);
        boolean res2 = (obj1 == obj2);
        System.out.println("equals() : " + res1);
        System.out.println("== : " + res2);
        System.out.println(obj1);
        System.out.println(obj2);
        
    }

}
