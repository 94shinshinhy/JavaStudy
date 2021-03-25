package day0223;

import java.util.Scanner;

// 사용자로부터 월을 입력받아서
// 해당 월의 마지막 날짜를 보여주는 프로그램
public class Ex13Switch2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("월 : ");
        int month = sc.nextInt();
        
        switch(month) {
        case 2:
            System.out.println("28알까지입니다.");
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("30일까지입니다.");
            break;
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("31일까지입니다.");
            break;
        }
        
        sc.close();
                
    }
    
}
