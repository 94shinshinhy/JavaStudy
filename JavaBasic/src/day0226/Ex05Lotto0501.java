package day0226;

// 컴퓨터로 로또 번호를 생성해서
// 사용자가 입력한 로또 번호와 비교
// 2개의 배열을 다 출력하고
// 사용자가 몇등인지 출력하는 프로그램

// 1등 : 6개
// 2등 : 5개
// 3등 : 4개
// 4등 : 3개
// 5등 : 2개

import java.util.*;

public class Ex05Lotto0501 {
    
    static final int SIZE = 6;
    static final int NUM_MIN = 1;
    static final int NUM_MAX = 45;

    public static void main(String[] args) {
        
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        
        // 컴퓨터의 배열을 저장하는 배열
        
        int [] comNum = new int[SIZE];
        
        // 사용자의 번호를 저장하는 배열
        
        int [] userNum = new int[SIZE];
        
        // 1. 컴퓨터의 로또 숫자를 뽑는 코드
        //    A. 숫자를 6개 뽑는다.
        
        for(int i = 0; i < SIZE; i++) {
            
            comNum[i] = ran.nextInt(NUM_MAX) + 1;
            
        }
        
        //    B. 6개중에 중복들을 제거하고 새로 뽑아준다.
        
        for(int i = 0; i < SIZE; i++) {
            
            for(int j = 0; j < SIZE; j++) {
                
                if(i != j && comNum[i] == comNum[j]) {
                    
                    comNum[i] = ran.nextInt(NUM_MAX) + 1;
                    j = -1;
                    
                }
                
            }
            
        }
        
        //    C. 6개의 숫자를 오름차순 정렬한다.
        
        for(int i = 0; i < SIZE - 1; i++) {
            
            if(comNum[i] > comNum[i+1]) {
                
                int temp = comNum[i];
                comNum[i] = comNum[i+1];
                comNum[i+1] = temp;
                i = -1;                
                
            }
            
        }
        
        for(int i = 0; i < SIZE; i++) {
            
            System.out.printf("comNum[%d] : [%2d]\n", i, comNum[i]);
            
        }
        
        // 2. 사용자의 로또 숫자를 뽑는 코드
        //    A. 사용자로부터 중복되지 않고 유효한 범위 안의 숫자 6개를 입력받는다.
        
        int idx = 0;
        while (idx < SIZE) {
            
            System.out.printf("%d번 숫자 : ", idx+1);
            int number = scan.nextInt();
            
            boolean valNum = true;
            
            if(!(number >= NUM_MIN && number <= NUM_MAX)) {
                
                valNum = false;
                
            }
            
            for(int i = 0; i < SIZE; i++) {
                
                if(number == userNum[i]) {
                    
                    valNum = false;
                    
                }
                
            }
            
            if(!valNum) {
                
                System.out.println("잘못입력하셨습니다.");
                
            } else {
                
                userNum[idx] = number;
                idx++;
                
            }
            
        }
        
        //    B. 6개의 숫자를 오름차순 정렬한다.
        
        for(int i = 0; i <SIZE - 1; i++) {
            
            if(userNum[i] > userNum[i+1]) {
                
                int temp = userNum[i];
                userNum[i] = userNum[i+1];
                userNum[i+1] = temp;                
                i = -1;
                
            }
            
        }
        
        // 3. 두개를 비교하여 등수를 결정하는 코드
        //    A. 두개의 배열을 비교하여 똑같은 숫자가 몇개 있는지 확인
        
        // 똑같은 숫자의 갯수를 지정할 int 변수 score
        int score = 0;
        for (int i = 0; i < SIZE; i++) {
            
            for (int j = 0; j < SIZE; j++) {
                
                if(userNum[i] == comNum[j]) {
                    
                    score++;
                    
                }
                
            }
            
        }
        //    B. 컴퓨터의 숫자들과 사용자의 숫자들 그리고 똑같은 숫자의 갯수를 출력해준다.
        
        System.out.println("====================");
        System.out.println("사용자 숫자\t\t컴퓨터 숫자");
        System.out.println("====================");
        for(int i = 0; i < SIZE; i++) {
            
            System.out.printf("%8d\t\t%8d\n", userNum[i], comNum[i]);
            
        }
        
        System.out.println("총 맞춘 숫자의 갯수 : " + score);
        
        //    C. 똑같은 숫자의 갯수에 따라서 등수 결정
        
        if(score > 1) {
            
            System.out.println("등수 : " + (7-score) + "등");
            
        }
        
        scan.close();

    }

}



















