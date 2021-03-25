package day0223;

import java.util.Scanner;

// 사용자로부터 나이를 입력받아서
// ~5 : 영아
// ~13 : 어린이
// ~18 : 청소년
// 그외 : 성인
// 이 출력되는 프로그램을 작성해보세요
public class Ex05AgeCheck {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("나이를 입력하세요 : ");
        int age = scan.nextInt();
        
        if(age <= 5) {            
            System.out.println("영아입니다.");            
        } else if (age <= 13) {            
            System.out.println("어린이입니다.");            
        } else if (age <= 18) {            
            System.out.println("청소년입니다.");            
        } else {            
            System.out.println("성인입니다.");            
        }
        
        scan.close();
        
    }
    
}
