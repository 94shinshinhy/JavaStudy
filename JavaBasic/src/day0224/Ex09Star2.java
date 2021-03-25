package day0224;

import java.util.Scanner;

public class Ex09Star2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        for(int i = 1; i <= num; i++) {
            
            String stars = new String();
                        
            for(int j = i; j <= num; j++) {
                
                stars += "*";
                
            }
            
            System.out.println(stars);
            
        }
        
        scan.close();        
        
    }

}
