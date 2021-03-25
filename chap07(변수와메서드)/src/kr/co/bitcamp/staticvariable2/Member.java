package kr.co.bitcamp.staticvariable2;

public class Member {

    int iv = 100;            // 인스턴스 멤버변수
    static int cv = 300;     // static 멤버변수
    
    // 인스턴스 메서드
    public void iMethod() {
        System.out.println("iv : " + this.iv);
        System.out.println("cv : " + Member.cv);            // 클래스명.정적변수명
    }
    
    // static 메서드
    public static void sMethod() {
        // 언제 인스턴스가 만들어질지는 아무도 모르기때문에
        //System.out.println("iv : " + this.iv);            // 호출안됨
        
        /*
         *  cv는 static 변수이기때문에 인스턴스 생성없이 접근가능해야함
         *  static메서드내에서는 얼마든지 접근 가능함
         */
        System.out.println("cv : " + Member.cv);
    }
    
}
