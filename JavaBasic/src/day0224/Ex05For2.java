package day0224;

import java.util.Scanner;

// for 문 예제
public class Ex05For2 {

    public static void main(String[] args) {
        
        // 1. 1부터 10까지 차례대로 출력하세요.
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
        
        // 2. 4부터 -2까지 차례대로 출력하세요
//        for (int i = 4; i >= -2; i--) {
//            System.out.println(i);
//        }
        
        // 3. 1부터 10까지 홀수를 출력해보세요
//        for(int i = 1; i <= 10; i++) {
//            if(i % 2 ==1) {
//            System.out.println(i);
//            }
//        }
        
        // 4. 1부터 40까지 6의 배수만 출력하세요
//        for (int i = 1; i <= 40; i++) {
//            if(i % 6 == 0) {
//            System.out.println(i);
//            }
//        }
        
        // 5. 사용자로부터 숫자를 입력받아서 1부터 그 숫자까지를 출력하세요
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.print("숫자 : ");
//        
//        int num = sc.nextInt();
//        
//        for (int i = 1; i <= num; i++) {
//            System.out.println(i);
//        }
//        
//        sc.close();
        
        // 6. 사용자로부터 2개의 숫자를 입력받아서
        //    더 작은 수 부터 더 큰 수까지 차례대로 출력하세요
        
//        Scanner scan = new Scanner(System.in);
//        System.out.print("숫자 : ");
//        int num1 = scan.nextInt();
//        
//        System.out.print("숫자 : ");
//        int num2 = scan.nextInt();
//        
//        int start = 0;
//        int end = 0;
//        
//        if(num1 <= num2) {
//            start = num1;
//            end = num2;
//        } else {
//            start = num2;
//            end = num1;
//        }
//        
//        for (int i = start; i <= end; i++) {
//            System.out.println(i);
//        }
//        
//        scan.close();
        
        // 7. 사용자로부터 숫자를 입력 받아서
        //    1부터 그 숫자까지의 합을 구하시오
//        Scanner scan = new Scanner(System.in);
//        
//        int sum = 0;
//        
//        System.out.println("숫자 : ");
//        int num = scan.nextInt();
//        
//        for (int i = 1; i <= num; i++) {
//            sum += i;
//        }
//        System.out.printf("1부터 %d까지의 합 : %d\n", num, sum);
        
        // 8. 사용자로부터 숫자를 입력받아서 1부터 그 수 까지의 곱을 구하시오
        Scanner scan = new Scanner(System.in);
      
        int res = 1;
      
        System.out.print("숫자 : ");
        int num = scan.nextInt();
      
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        System.out.printf("1부터 %d까지의 곱 : %d\n", num, res);
          
    }
    
}



















