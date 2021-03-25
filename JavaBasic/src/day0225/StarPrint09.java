package day0225;

import java.util.Scanner;

public class StarPrint09 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        for(int i = 1; i <= 2*num; i++) {
            
            String stars = new String();
            
            int spaceWidth = 0;
            int starWidth = 0;
            
            if (i < num) {
                
                // 공백의 갯수를 저장할 int 변수 sapceWidth
                spaceWidth = num - i;
                
                // 별을 담당하는 j for 문
                // 별의 갯수를 저장할 int 변수 spaceWidth
                starWidth = 2 * i - 1;
                
            } else {
                int lowerI = 2 * num - i;
                
                // 공백의 갯수를 저장할 int 변수 spaceWidth
                spaceWidth = num - lowerI;
                
                // 별의 갯수를 저장할 int 변수 starWidth
                starWidth = 2 * lowerI - 1;
                
            }
            
         // 공백을 담당하는 j for 문
            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }
            
            // 별을 담당하는 j for 문
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }
            
            System.out.println(stars);
            
        }
        
        sc.close();
        

    }

}


/*int lowerI = i - num + 1;

int spaceWidth = lowerI - 1;
for(int j = 1; j <= spaceWidth; j++) {
    
    stars += " ";
    
}

// 별을 담당하는 부분
int starWidth = 2 * (num - lowerI) + 1;
for(int j = 1; j <= starWidth; j++) {
    
    stars += "*";
    
}*/
