package day0226;

import java.util.*;

public class NightLotto02 {
    
    static final int SIZE = 6;
    static final int MAX = 45;
    static final int MIN = 1;
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] userNum = new int[SIZE];
        
        int idx = 0;
        
        while(idx < SIZE) {
            System.out.print("숫자 : ");
            int num = scan.nextInt();
            
            boolean rangeNum = false;
            
            if(num >= MIN && num <= MAX) {
                rangeNum = true;
            } else {
                rangeNum = false;
            }
            
            boolean existNum = true;           
           
            for(int i = 0; i < userNum.length; i++) {
                if (num == userNum[i]) {
                    existNum = false;
                }
            }
            
            if(rangeNum && existNum) {
            
                    userNum[idx] = num;
                    idx++;
            } else {
                System.out.println("잘못입력하셨습니다.");
            }
        }
        
        for(int i = 0; i < userNum.length; i++) {
            System.out.println(userNum[i]);
        }
    }
}



















