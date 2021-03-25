package day0226;

import java.util.Random;

// 로또 번호 제작기 ver 2.0
// 중복 제거가 되는 버전

// 배열에서의 중복이란?
// 인덱스가 서로 다르지만
// 엘리먼트의 값이 같을 경우를 중복이라고한다.

// 우리가 배열에서 중복 제거를 하려면
// 중첩 for문을 사용해서
// 인덱스는 다르지만 엘리먼트는 같은 곳에
// 새로운 값을 넣어주고
// 다시 처음부터 중복검사를 반복해주면된다.

public class Ex02Lotto02 {
    
    static final int SIZE = 6;
    static final int NUMBER_MAX = 45;
    
    
    public static void main(String[] args) {
        
        Random ran = new Random();
        
        int[] lottoNum = new int[SIZE];
        
        // for문을 사용해서
        // lottoNum에 차례대로
        // 난수를 집어넣는다.
        
        for(int i = 0 ; i < lottoNum.length ; i++) {
            
            lottoNum[i] = ran.nextInt(NUMBER_MAX) + 1;
            
        }
        
        // 중복제거 전에 lottoNum에 들어있는 번호
        
        System.out.println("==========중복제거전==========");
        for(int i = 0; i < lottoNum.length; i++) {
            
            System.out.printf("%d번의 숫자 : [%d]\n", i+1, lottoNum[i]);
            
        }
        
        System.out.println("===========================");
        
        // 중복제거를 위한 중첩 for문
        
        for(int i = 0; i < lottoNum.length; i++) {
            
            for(int j = 0; j < lottoNum.length; j++) {
                
                if(i != j && lottoNum[i] == lottoNum[j]) {
                    
                    // index는 다르지만 엘리먼트는 같다라는 의미이므로
                    // lottoNum[i]에 대호운 값을 넣어준다.
                    
                    System.out.printf("%d와 %d의 index가 중복이므로 교체\n", i, j);
                    lottoNum[i] = ran.nextInt(NUMBER_MAX) + 1;
                    
                    j = -1;
                    
                }
                
            }
            
        }
        
     // 중복제거 후에 lottoNum에 들어있는 번호
        
        System.out.println("==========중복제거후==========");
        for(int i = 0; i < lottoNum.length; i++) {
            
            System.out.printf("%d번의 숫자 : [%d]\n", i+1, lottoNum[i]);
        }
        
        System.out.println("===========================");

    }

}
