package kr.co.bitcamp.genericmethod;

public class MemberTest {
    
    /* MemberTest클래스의 인스턴스 메서드.
     *  제네릭 클래스인 Member를 리턴함.
     */
    public <T> Member<T> boxing(T t){
        
        Member<T> member = new Member<>();
        member.setT(t);
        
        return member;
        
    }
    
    // MemberTest의 정적 메서드
    public static<T> Member<T> wrapping(T t){
        
        Member<T> member = new Member<>();
        member.setT(t);
        
        return member;
        
    }

    public static void main(String[] args) {
        
        MemberTest memberTest = new MemberTest();
        Member<Integer> member = memberTest.<Integer>boxing(100);        // auto boxing
        System.out.println("Member클래스의 값 : " + member.getT());
        
        // Member<String> member2 = MemberTest.<String>wrapping("이순신");
        Member<String> member2 = wrapping("이순신");
        System.out.println("Member클래스의 값 : " + member2.getT());
        
    }
    
}




















