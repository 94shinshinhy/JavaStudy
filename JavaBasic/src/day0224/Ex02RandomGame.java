package day0224;

// 숫자 맞추기 게임
// 메뉴를 만들어서
// 1. 플레이 2. 기록보기 3. 종료
// 1번을 누를 경우
// 컴퓨터가 만든 난수를 사용자가 몇번안에 맞추는지
// 기록해서 최고기록과 비교해서
// 더 낮은 횟수가 최고기록이 되게 만들기
// 2번을 누를 경우
// 현재 최고기록을 보기
// 3번을 누를 경우
// 종료

import java.util.*;

public class Ex02RandomGame {
    static final int COMP_NUM_MAX = 100;
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        
        int bestScore = 0;
        
        while(true) {
            
            System.out.println();
            System.out.println(" 1. 플레이 2. 기록보기 3. 종료");
            System.out.print("> ");
            
            int choiceNum = scan.nextInt();

            
            if(choiceNum == 1) {
                // 플레이
                
                // 1. 컴퓨터의 난수 생성
                // 2. 사용자로부터 숫자 입력 후
                //    컴퓨터 난수와 비교해서
                //    같을 때까지 사용자로부터 숫자를 입력 받는다.
                //    입력 받을때마다 현재 점수는 1씩 올라간다.
                // 3. 최고기록과 비교해서
                //    필요하다면 현재점수를 최고기록에 저장
                int computerNumber = ran.nextInt(COMP_NUM_MAX) + 1;
                int currentScore = 1;
                System.out.print("숫자를 입력하세요 : ");
                int userNumber = scan.nextInt();
                
                // 사용자가 입력한 숫자와 비교해서
                // 만약 컴퓨터 숫자가 더 크면 "UP"
                // 만약 컴퓨터 숫자가 더 작으면 "DOWN"
                // 을 출력시켜서 사용자가 좀 더 쉽게 맞출 수 있게 바꿔보자
                
                while(computerNumber != userNumber) {
                    System.out.println("숫자를 다시 입력하세요 : ");
                    if(computerNumber < userNumber) {
                        System.out.println("DOWN");
                    } else if(computerNumber > userNumber) {
                        System.out.println("UP");
                    }
                    userNumber = scan.nextInt();
                   
                    currentScore++;
                    
                }
                
                // 3. 최고기록과 비교해서
                //    필요하다면 현재점수를 최고기록에 저장
                //    최고기록을 갱신하는 2가지 경우
                //    1. 현재 스코어가 최고기록보다 작으면
                //    2. 최고기록이 0일 때
                System.out.printf("사용자의 이번 라운드 스코어 : [%3d]\n", currentScore);
                System.out.printf("기존 최고 스코어 : [%3d]\n", bestScore);
                
                if(bestScore == 0 || currentScore < bestScore) {
                    bestScore = currentScore;
                    System.out.println("짝짝짝 현재 스코어가 새로운 최고기록입니다 짝짝짝");
                }
                
            } else if(choiceNum == 2) {
                // 기록보기
                // 만약 최고 점수가 0이다 -> 아직 플레이 기록이 없다.
                // 그 외다 -> 최고기록을 보여준다.
                if(bestScore == 0) {
                    System.out.println();
                    System.out.println("아직 플레이 기록이 없습니다.");
                    System.out.println();
                } else {
                    System.out.printf("최고기록은 : [%d]", bestScore);
                }
                
            } else if(choiceNum == 3) {
                // 종료
                System.out.println("사용해주셔서감사합니다.");
                break;                
            }
            
        }
        
        scan.close();
        
    }

}
