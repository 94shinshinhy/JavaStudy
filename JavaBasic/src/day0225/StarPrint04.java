package day0225;

import java.util.Scanner;

public class StarPrint04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        int num = sc.nextInt();      
        
        for (int i = 1; i <= num; i++) {
            
            String stars = new String();
            
            // 공백을 담당하는 for 문
            for(int j = 1; j <= i - 1; j++) {
                
                stars += " ";
                
            }
            
            // 별을 담당하는 for 문
            for(int j = i; j <= num; j++) {
                
                stars += "*";
                
            }
            
            System.out.println(stars);
            
        }
        
        sc.close();

    }

}
