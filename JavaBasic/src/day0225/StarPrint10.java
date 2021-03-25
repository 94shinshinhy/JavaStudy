package day0225;

import java.util.Scanner;

public class StarPrint10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int maxHeight = 2 * num - 1;
        
        for(int i = 1; i <= maxHeight; i++) {
            
            String stars = new String();
            
            // 첫번째 줄 + 마지막줄
            // 그리고 그 외의 경우로 나눠준다.
            if(i == 1 || i == maxHeight) {
                // 첫번째 혹은 마지막 줄일 때
                
                // 2 * num - 1개의 별을 넣어준다.
                for(int j = 1; j <= maxHeight; j++) {
                    stars += "*";
                }
            
        } else {
            // 그 외일때
            
            // 별의 갯수를 지정할 int 변수 starWidth
            int starWidth = 0;
            
            // 공백의 갯수를 저장할 int 변수 spaceWidth
            int spaceWidth = 0;
            
            if(i < num) {
                // 첫줄을 제외한 윗부분
                
                // 1로 시작하는 앞부분의 i를 만들어주자
                int upperI = i - 1;
                starWidth = num - upperI;
                spaceWidth = 2* upperI -1;
                
            } else {
                // 마지막줄을 제외한 아랫부분
                
                // 1로 시작하는 아랫부분의 i를 만들어주자
                int lowerI = i - num + 1;
                starWidth = lowerI;
                spaceWidth = maxHeight - 2* starWidth;
                
            }
            
            // 왼쪽 별을 담당하는 부분
            for(int j =1; j <= starWidth; j++) {
                stars += "*";
            }
            
            // 가운데 공백을 담당하는 부분
            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }
            
            // 오른쪽 별을 담당하는 부분
            for(int j = 1; j <= starWidth; j++) {
                stars += "*";
            }
            
        }
            
            System.out.println(stars);
            
        }
        
        sc.close();
        

    }

}
