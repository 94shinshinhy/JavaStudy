package day0222;

import java.util.Scanner;
// if 숙제
// 1. number에 값을 설정하고 해당 값이 0보다 크면 출력하세요
// 2. 사용자로부터 숫자를 입력 받아서 해당 값이 0보다 작으면 출력하세요
// 3. 사용자로부터 숫자를 입력 받아서 해당 값이 짝수이면 출력하세요
// 4. 사용자로부터 나이를 입력 받아서 미성년자일 결우 "미성년자입니다."가 출력되게 코드를 작성하세요
// 5. 사용자로부터 숫자를 입력 받아서 해당 숫자가 한자리 자연수일 경우 "한자리 자연수입니다."가 출력되게 코드를 작성하세요
public class Ex13If02 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("숫자를 입력하세요 : ");
        int num = scan.nextInt();
        
        if(num >= 0 && num < 10 ) {
            System.out.println("힌자리 자연수입니다.");
        }
        System.out.println("프로그램 종료");
        
        scan.close();
    }
    
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("나이를 입력하세요 : ");
        int age = scan.nextInt();
        
        if(age < 19) {
            System.out.println("미성년자입니다.");
        }
        System.out.println("프로그램 종료");
        
        scan.close();
    }*/
    
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("숫자를 입력하세요 : ");
        int num = scan.nextInt();
        
        if(num % 2 == 0) {
            System.out.println("입력 받은 숫자 : " + num);
            System.out.println("짝수입니다.");
        }
        System.out.println("프로그램 종료");
        
        scan.close();
    }*/
    
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("숫자를 입력하세요 : ");
        int num = scan.nextInt();
        
        if(num < 0) {
            System.out.println(num);
        }
        System.out.println("프로그램 종료");
        
        scan.close();
    }*/
    
    /*public static void main(String[] args) {
        int number = 1;
        if(number > 0) {
            System.out.println(number);
        }
        System.out.println("프로그램 종료");
    }*/
}
