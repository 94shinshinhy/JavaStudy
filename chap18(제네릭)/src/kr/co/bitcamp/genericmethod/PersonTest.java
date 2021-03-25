package kr.co.bitcamp.genericmethod;

public class PersonTest {

    public static void main(String[] args) {
        
        //Person<Integer> p1 = Util.<Integer>changing(300);        // 정상적인 클래스
        Person<Integer> p1 = Util.changing(300);                  // auto boxing
        int value = p1.getT();
        System.out.println(value);
        
        Person<String> p2 = Util.changing("이순신");
        String str = p2.getT();
        System.out.println(str);
                

    }

}



















