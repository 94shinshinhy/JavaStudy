package day0223;

import java.util.Scanner;

// 사용자로부터 나이를 입력받아서
// 성인인지 미성년자인지를 출력하는 프로그램을 작성하시오
public class Ex02IfElse02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("나이를 입력하세요 : ");
        
        int age = scan.nextInt();
        
        if(age < 19) {
            System.out.println("미성년자입니다.");
        } else {
            System.out.println("성인입니다.");
        }
        
        scan.close();
    }
}
