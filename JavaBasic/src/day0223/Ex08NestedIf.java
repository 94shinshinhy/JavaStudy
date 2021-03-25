package day0223;
// 중첩 if문
// 중첩 if문이란, 하나의 if 코드 블락 안에
// 또다른 if문이 있는 것을 중첩 if문이라고 한다.

// 만약 특전 조건에 따라서 코드 실행 여부를 결정하고 싶다면
// 중첩 if문을 사용하여 코드를 구성해야 한다.
public class Ex08NestedIf {
    public static void main(String[] args) {
        
        int number = 15;
        
        if(number >= 0) {
            
            System.out.println("자연수입니다.");
            
            if(number < 10) {                
                System.out.println("한자리 숫자입니다.");                
            } else if (number < 100) {                
                System.out.println("두자리 숫자입니다.");                
            } else {                
                System.out.println("세자리 이상의 숫자입니다.");                
            }
            
        } else {
            
            System.out.println("음의 정수입니다.");
            
        }
        
    }
}
