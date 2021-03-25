package day0226;

// 다섯번어치 로또 자동 추첨을 만들어보세요 + 등수 판정까지

import java.util.*;

public class Ex08Lotto06 {
    
    static final int SIZE = 6;
    static final int MIN = 1;
    static final int MAX = 45;
    static final int GAME_SIZE = 5;

    public static void main(String[] args) {
        
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        
        int[] comNum = new int[SIZE];
        int[][] userNum = new int[GAME_SIZE][SIZE];
        
        int idx = 0;
        
        // 컴퓨터의 숫자 추첨 후 중복제거 그리고 오름차순 정렬
        while(idx < SIZE) {
            
            int num = ran.nextInt(MAX)+1;
            
            boolean valNum = true;
            
            for(int i = 0; i < SIZE; i++) {
                
                if(comNum[i] == num) {
                    valNum = false;
                }
                
            }
            
            if(valNum) {
                
                comNum[idx] = num;
                idx++;
                
            }
            
        }
        
        for(int i = 0; i < SIZE - 1; i++) {
            
            if(comNum[i] > comNum[i+1]) {
                
                int temp = comNum[i];
                comNum[i] = comNum[i+1];
                comNum[i+1] = temp;
                i = -1;
                
            }
            
        }
        
        // 사용자의 숫자 추첨 후 중복제거 그리고 오름차순 정렬
        for(int i = 0; i < userNum.length; i++) {
            
            int useridx = 0;
            while(useridx < userNum[i].length) {
                
                int ranNum = ran.nextInt(MAX)+1;
                
                boolean valNum = true;
                
                for(int j = 0; j < userNum[i].length; j++) {
                    
                    if(userNum[i][j] == ranNum) {
                        
                        valNum = false;
                        
                    }
                    
                }
                
                if(valNum) {
                    
                    userNum[i][useridx] = ranNum;
                    useridx++;
                    
                }
                
            }
            
            for(int j = 0; j < userNum[i].length -1; j++) {
                
                if(userNum[i][j] > userNum[i][j+1]) {
                    
                    int temp = userNum[i][j];
                    userNum[i][j] = userNum[i][j+1];
                    userNum[i][j+1] = temp;
                    j = -1;
                 }
                
            }
            
        }
        
        // 사용자의 각 게임에 대한 결과 확인
        System.out.println("--------------------");
        System.out.printf("%2d %2d %2d %2d %2d %2d\n",
                comNum[0],
                comNum[1],
                comNum[2],
                comNum[3],
                comNum[4],
                comNum[5]);
        System.out.println("--------------------");
        for(int i = 0; i < userNum.length; i++) {
            System.out.printf("%2d %2d %2d %2d %2d %2d\n",
                    userNum[i][0],
                    userNum[i][1],
                    userNum[i][2],
                    userNum[i][3],
                    userNum[i][4],
                    userNum[i][5]);
            System.out.println("--------------------");
        }
        
        scan.close();

    }

}

/*for(int i=0; i<SIZE; i++) {

comNum[i] = ran.nextInt(45)+1;

}

for(int i=0; i<SIZE; i++) {
for(int j=0; j<SIZE; j++) {
    if(i!=j && comNum[i] == comNum[j]) {
        comNum[i] = ran.nextInt(45)+1;
        j=-1;
    }
}
}

for(int i=0; i<SIZE-1; i++) {
if(comNum[i] > comNum[i+1]) {
    int temp = comNum[i];
    comNum[i] = comNum[i+1];
    comNum[i+1] = temp;
    i=-1;
}
}

for(int i=0; i<SIZE; i++) {
System.out.println(comNum[i]);
}

for(int i=0; i<userNum.length; i++) {
for(int j = 0; j < userNum.length; j++) {
    userNum[i][j] = ran.nextInt(45)+1;
}
}*/



















