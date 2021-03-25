package day0226;

import java.util.*;

public class NightLotto {
    
    static final int LOTTO_LEN = 6;
    static final int LOTTO_MAX = 45;

    public static void main(String[] args) {
        Random ran = new Random();
        
        // 6개의 난수 숫자 생성
        int[] lotto = new int[LOTTO_LEN];
        
        for(int i = 0; i < lotto.length; i++) {
            lotto[i] = ran.nextInt(LOTTO_MAX)+1;
        }
        System.out.println("-----중복제거전-----");
        for(int i = 0; i < lotto.length; i++) {
            System.out.printf("%d번 숫자 : %d\n", i+1, lotto[i]);
        }
        
        // 중복제거
        for(int i = 0; i < lotto.length; i++) {
            for(int j = 0; j < lotto.length; j++) {
                if(!(i != j && lotto[i] == lotto[j])) {
                    lotto[i] = ran.nextInt(LOTTO_MAX)+1;                    
                }
            }
        }
        
        // 중복제거 후 출력
        System.out.println("-----중복제거후-----");
        for(int i = 0; i < lotto.length; i++) {
            System.out.printf("%d번 숫자 : %d\n", i+1, lotto[i]);
        }
        
        // 정렬
        for(int i = 0; i < lotto.length -1; i++) {
            if(lotto[i] > lotto[i+1]) {
                int temp = lotto[i];
                lotto[i] = lotto[i+1];
                lotto[i+1] = temp;
                i = -1;
                
            }
        }
        
        // 정렬 후 출력
        System.out.println("-----정렬후-----");
        for(int i = 0; i < lotto.length; i++) {
            System.out.printf("%d번 숫자 : %d\n", i+1, lotto[i]);
        }
        
    }
    
}














