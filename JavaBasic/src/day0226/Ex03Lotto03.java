package day0226;

import java.util.Random;

// 로또 번호 제작기 ver 3.0

public class Ex03Lotto03 {
    
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
            
            System.out.printf("%d번의 숫자 : [%d]\n", i, lottoNum[i]);
            
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
        
        // 정렬을 위한 for 문
        
        // 중복제거와 정렬은 비슷하지만
        // 중첩 for문 대신 i for문 하나만 사용한다.
        
        // 만약 lottoNum[i]가 lottoNum[i+1] 보다 크면?
        // 두개의 위치를 바꾸고 다시 i를 처음부터 검사해주면 된다.
        
        for(int i = 0; i < lottoNum.length - 1; i++) {
            
            if(lottoNum[i] > lottoNum[i+1]) {
                
                // 앞에 숫자가 더 크다라는 의미이므로 두개의 위치를 바꿔주어야한다.
                // 단 컴퓨터에서 두개의 변수의 값을 바꿀 때에는
                // 반드시 임시저장소에 한 곳의 값을 저장하고
                // 그곳의 값은 다른 변수의 값을 저장
                // 다른 변수는 임시저장소의 값을 저장
                // 하는 식으로 변경해야한다.
                
                int temp = lottoNum[i];
                
                lottoNum[i] = lottoNum[i+1];
                lottoNum[i+1] = temp;
                
                i = -1;
                
            }
            
        }
        
     // 중복제거 후에 lottoNum에 들어있는 번호
        
        System.out.println("==========중복제거후==========");
        for(int i = 0; i < lottoNum.length; i++) {
            
            System.out.printf("%d번의 숫자 : [%d]\n", i, lottoNum[i]);
        }
        
        System.out.println("===========================");

    }

}
