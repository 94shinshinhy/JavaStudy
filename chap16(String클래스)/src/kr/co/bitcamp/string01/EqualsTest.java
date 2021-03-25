package kr.co.bitcamp.string01;

public class EqualsTest {
    
    public static void main(String[] args) {
        
        String str1 = new String("이순신");
        String str2 = "이순신";        // 리터럴타입으로 대입
        String str3 = "이순신";
        
        if(str1 == str2) {
            System.out.println("같은 번지의 인스턴스");
        } else {
            System.out.println("다른 번지의 인스턴스");
        }
        
        // 같은 리터럴의 경우 : 같은 번지를 참조함.
        if(str2 == str3) {
            System.out.println("같은 번지의 인스턴스");
        } else {
            System.out.println("다른 번지의 인스턴스");
        }
        
        // String의 equals() : 값비교 (Object클래스의 equals() 오버라이딩)
        if(str1.equals(str2)) {            
            System.out.println("같은 문자열입니다.");            
        } else {
            System.out.println("다른 문자열입니다.");
        }
        
        if(str2.equals(str3)) {            
            System.out.println("같은 문자열입니다.");            
        } else {
            System.out.println("다른 문자열입니다.");
        }
        
    }

}
