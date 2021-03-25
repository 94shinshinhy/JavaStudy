package day0226;

// 사용자가 로또번호를 고를 수 있게 입력을 받는 프로그램
// 조건 1. 1~4까지의 값만 입력 가능
// 조건 2. 중복숫자 안됨

import java.util.Scanner;

public class Ex04Lotto04 {
    
    static final int SIZE = 6;
    static final int NUMBER_MIN = 1;
    static final int NUMBER_MAX = 45;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] userNum = new int[SIZE];
        
        // 현재 입력 인덱스를 저장한 int 변수 idx
        int idx = 0;
        
        while(idx < SIZE) {
            
            System.out.print("1~45 사이의 숫자 : ");
            int number = sc.nextInt();
            
            // 1. 해당 숫자가 범위를 지켰는지 확인하여 
            //    true/false 값을 저장하는 boolean 변수 rangeCheck
            boolean rangeCheck = false;
            
            if(number >= NUMBER_MIN && number <= NUMBER_MAX) {
                
                // 올바른 값이므로 rangeCheck을 true로 바꿔준다.
                rangeCheck = true;
                
            } else {
                
                // 올바른 값이 아니므로 rangeCheck을 false로 바꿔준다.
                rangeCheck = false;
                
            }
            
            // 2. 해당 숫자가 중복인지 아닌지를 확인하여
            //    true/false 값을 저장하는 boolean 변수 existCheck
            boolean existCheck = true;
            
            for(int i = 0; i < SIZE; i++) {
                
                if(number == userNum[i]) {
                    
                    // 사용자가 입력한 숫자는 중복이라는 의미가 된다.
                    existCheck = false;
                    
                }
                
            }
            
            // 만약 올바른 범위일 경우
            // rangeCheck은 true가 된다.
            
            // 만약 중복된 숫자가 아닐 경우
            // existCheck = true가 된다.
            
            // 즉 두 변수의 값이 모두 true이면
            // 배열의 idx번 칸에 number을 넣고
            // idx의 값을 1 증가시킨다.
            
            if(existCheck && rangeCheck) {
                
                userNum[idx] = number;
                idx++;
                
            } else {
                
                System.out.println("잘못입력하셨습니다.");
                
            }
            
            
        }
        
        for (int i = 0; i < SIZE; i++) {
            
            System.out.printf("userNum[%d] : [%2d]\n", i, userNum[i]);
            
        }
        
        sc.close();

    }

}



















