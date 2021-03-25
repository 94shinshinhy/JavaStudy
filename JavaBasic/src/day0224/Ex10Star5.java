package day0224;

import java.util.Scanner;

public class Ex10Star5 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        for(int i = 1; i <= num; i++) {
            
            String stars = new String();
            
            // 공백을 담당하는 j for 문
            for (int j = 1; j <= num - i; j++) {
                
                stars += " ";
                
            }
            
            // 별을 담당하는 j for 문
            for (int j = 1; j <= i ; j++) {
                stars += "*";
                if(j<i) {
                    stars += "*";
                }
            }
            
            System.out.println(stars);
        }
        
        scan.close();
    }

}
