package kr.co.bitcamp.interfacee;

public class CreatureTest {

    public static void main(String[] args) {
        
        Member mem = new Member();
        mem.method();
        mem.method1();
        System.out.println();
        
        // 인터페이스도 일종의 조상이다. 그래서 당연히 다형성 개념이 적용된다.
        Creature cre = new Member();                // 인터페이스 필드의 다형성
        cre.method();
        System.out.println();
        // 원래 타입을 벗어나지 못하므로 Member클래스의 멤버메서드는 호출불가
        // cre.method1();
        
        Person per = new Person();
        per.method();
        per.method2();
        System.out.println();
        
        cre = new Person();
        cre.method();        
        System.out.println(cre.MAX);
        
    }

}
