package day0225;

import java.util.Scanner;

public class StarPrint06 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        for(int i = 1; i <= num; i++) {
            
            String stars = new String();
            
            // 공백을 담당하는 부분
            int spaceWidth = i - 1;
            for(int j = 1; j <= spaceWidth; j++) {
                
                stars += " ";
                
            }
            
            // 별을 담당하는 부분
            int starWidth = 2 * (num - i) + 1;
            for(int j = 1; j <= starWidth; j++) {
                
                stars += "*";
                
            }
            
            System.out.println(stars);
            
        }
        
        sc.close();

    }

}
