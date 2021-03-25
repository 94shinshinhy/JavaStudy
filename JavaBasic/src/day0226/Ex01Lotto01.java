package day0226;

import java.util.Random;

// 로또 번호 제작기 ver 1.0
// 1~45까지의 랜덤한 숫자 6개를 저장하는 프로그램을
// 작성하시오

public class Ex01Lotto01 {
    
    static final int SIZE = 6;
    static final int NUMBER_MAX = 45;
    
    public static void main(String[] args) {
        
        Random ran = new Random();
        int[] lottoNum = new int[SIZE];
        
        // for문을 사용해서 lottoNum의 각 엘리먼트를
        // random.nextInt(NUMBER_MAX) + 1로 초기화해준다.
        
        for(int i = 1; i < lottoNum.length; i++) {

            lottoNum[i] = ran.nextInt(NUMBER_MAX) + 1;
            
        }
        
        for(int i = 1; i < lottoNum.length; i++) {
            
            System.out.printf("%d번째 숫자 : [%d]\n", i, lottoNum[i]);
            
        }
        
        // 현재 1.0의 문제점
        // 1. 중복 제거 안됨
        // 2. 정렬이 안됨

    }

}
