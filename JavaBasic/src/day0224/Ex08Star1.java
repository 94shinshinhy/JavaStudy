package day0224;

import java.util.Scanner;

public class Ex08Star1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        // 별찍기에서
        // i for문은 세로 줄을 담당하고
        // j for문은 i번 줄의 출력내용을 담당하게된다.
        
        for(int i = 1; i <= num; i++) {
            
            String stars = new String();
            
            for(int j = 1; j <= i; j++) {
                
                stars += "*";               
                
            }
            
            System.out.println(stars);
        }
        
        scan.close();

    }

}
