package day0223;
// 사용자로부터 정수를 입력받아서
// A, B, C, D, F를 출력하는 프로그램
// 단 사용자가 잘못된 점수를 입력하는 경우
// 올바른 형태의 점수를 입력할 때까지 다시 입력을 받고록 하세요.

import java.util.Scanner;

public class Ex16GradeCheck2 {
    
    public static void main(String[] arg) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("점수를 입력하세요 : ");
        int score = sc.nextInt();
        
        
        while( !(score >= 0 && score <= 100)) {
            
            System.out.println("잘못입력하셨습니다.");
            System.out.print("점수를 입력하세요 : ");
            score = sc.nextInt();
            
        }
        
        if(score >= 90) {
            System.out.println("A");
        } else if(score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        
        sc.close();
        
    }
    
}
