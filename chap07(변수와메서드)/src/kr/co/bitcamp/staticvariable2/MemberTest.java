package kr.co.bitcamp.staticvariable2;

public class MemberTest {
    
    public static void study() {
        System.out.println("자바 개발자가 필요합니다.");
    }
    
    public void memberMethod() {
        System.out.println("인스턴스 메소드");
    }

    public static void main(String[] args) {
        
        /*
         *  static 멤버들이므로 인스턴스 생성없이 얼마든지 클래스명.정적멤버명으로
         *  접근이 가능하다라는 것을 보여주고 있음.
         *  static은 static만 호출이 가능함
         */
        Member.sMethod();
        Member.cv = 500;
        Member.sMethod();
        
        /*
         *  인스턴스 멤버들을 사용하기 위해서는 반드시 new라는 연산자가 힙에다가
         *  인스턴스를 만들어야 사용이 가능 
         */
        Member mem = new Member();
        mem.iMethod();
        mem.iv = 999;
        mem.iMethod();
        
        MemberTest.study();
        
        MemberTest memT = new MemberTest();
        memT.memberMethod();

    }

}



















