package day0225;

import java.util.Scanner;

public class StarPrint05 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i = 1; i <= num; i++) {
            
            String stars = new String();
            
            // 공백을 담당하는 j for 문
            int spaceWidth = num - i;
            
            for(int j = 1; j <= spaceWidth; j++) {
                
                stars += " ";
                
            }
            
            // 별을 담당하는 j for 문
            int starWidth = 2 * i - 1;
            for(int j = 1; j <= starWidth; j++) {
                stars += "*";
            }
                        
            System.out.println(stars);
            
        }
        
        sc.close();
        
    }
    
}
/*for (int i = 1; i <= num; i++) {

String stars = new String();

// 공백을 담당하는 부분
for(int j = 1; j <= num - i; j++) {
    
    stars += " ";
    
}

//별을 담당하는 부분
for(int j = 1; j <= i; j++) {
    
    stars += "*";
    if(j < i) {
        stars += "*";
    }
}

System.out.println(stars);

}*/
