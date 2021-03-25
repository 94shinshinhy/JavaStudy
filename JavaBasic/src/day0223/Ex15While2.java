package day0223;
// 사용자로부터 숫자를 입력받아서
// 해당 숫자가 음의 정수가 아닐 경우
// 음의 정수를 입력할 때까지 다시 입력을 받는 프로그램

import java.util.Scanner;

public class Ex15While2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("음의 정수를 입력해주세요 : ");
        int number = sc.nextInt();
        
        while(number >= 0) {
            
            System.out.println("잘못입력하셨습니다.");
            System.out.print("음의 정수를 입력해주세요 : ");
            number = sc.nextInt();
            
        }
        
        System.out.println("사용자가 입력한 음의 정수 : " + number);
        
        sc.close();
        
    }
    
}
