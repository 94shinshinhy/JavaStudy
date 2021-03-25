package day0225;

import java.util.Scanner;

public class StarPirnt07 {

    public static void main(String[] args) {
        
Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        for(int i = 1; i <= num; i++) {
            
            String stars = new String();
            
            for(int j = 1; j <= i; j++) {
                
                stars += "*";
                
            }
       
            System.out.println(stars);
        }
        
        for(int i = num-1; i >= 1; i--) {
            
            String stars = new String();
            
            for(int j = 1; j <= i; j++) {
                
                stars += "*";
                
            }
            
            System.out.println(stars);
        }

        
        scan.close();


    }

}
