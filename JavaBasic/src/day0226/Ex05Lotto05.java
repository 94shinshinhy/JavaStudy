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

public class Ex05Lotto05 {
    
    static final int SIZE = 6;
    static final int NUM_MIN = 1;
    static final int NUM_MAX = 45;

    public static void main(String[] args) {
        
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        
        int[] comNum = new int[SIZE];
        int[] userNum = new int[SIZE];
        
        // 컴퓨터 숫자 생성
        
        for(int i = 0; i < SIZE; i++) {
            
            comNum[i] = ran.nextInt(NUM_MAX) + 1;
            
        }
        
        // 중복 제거
        
        for(int i = 0; i < comNum.length; i++) {
            
            for(int j = 0; j < comNum.length; j++) {
                
                if(i != j && comNum[i] == comNum[j]) {
                    
                    comNum[i] = ran.nextInt(NUM_MAX) + 1;
                    j = -1;
                    
                }
                
            }
            
        }
        
        // 정렬
        
        for(int i = 0; i < comNum.length - 1; i++) {
            
            if(comNum[i] > comNum[i+1]) {
                
                int temp = comNum[i];
                comNum[i] = comNum[i+1];
                comNum[i+1] = temp;
                
                i = -1;
                
            }
                                    
        }
        
        // 컴퓨터 숫자 출력
        
        for(int i = 0; i < comNum.length; i++) {
            
            System.out.println(comNum[i]);
            
        }
        
        // 사용자 숫자 생성
        
        int idx = 0;
        
        while (idx < SIZE) {
            
            for(int i = 0; i < userNum.length; i++) {
            
                System.out.print("번호 입력(1~45) : ");            
                userNum[i] = scan.nextInt();
                
            }
            
        }
        
        // 중복 제거        
        // 정렬
        // 2개의 배열 출력
        // 몇등인지 출력
        
        scan.close();

    }

}



















