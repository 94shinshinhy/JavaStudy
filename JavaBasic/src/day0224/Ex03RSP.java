package day0224;

// 가위바위보 게임

// 1. 플레이어가
//    사용자로부터 가위바위보를 int로 입력받는다.
//    가위 : 1
//    바위 : 2
//    보 : 3
//    컴퓨터의 선택과 비교해서
//    승리, 무승부, 패배를 기록해준다.

// 2. 기록보기
//    사용자의 현재 전적을 보여준다.
//    ###전 ###승 ###패 (승률 ##.##%)

// 단 무한루프를 사용해서 사용자가 원하는만큼 할 수 있도록 만들어보세요

import java.util.Scanner;
import java.util.Random;

public class Ex03RSP {
    
    static final int SCI = 1;
    static final int ROK = 2;
    static final int PAP = 3;
    static final int OPTION_MAX = 3;

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        
        int win = 0;
        int lose = 0;
        int draw = 0;
        
        while(true) {
            
            System.out.println("가위 바위 보 게임");
            System.out.println("1. 플레이 2. 기록보기 3. 종료");
            System.out.print("> ");
            
            int userChoice = scan.nextInt();
            
            if(userChoice == 1) {
                // 플레이
                
                // 1. 컴퓨터가 가위 바위 보 중에 하나를 선택하도록 한다.
                int comsrp = ran.nextInt(OPTION_MAX) + 1;
                
                // 2. 사용자가 가위 바위 보 중에 하나를 선택하도록 한다.
                System.out.println("1. 가위 2. 바위 3. 보");
                System.out.print("> ");
                int userInput = scan.nextInt();
                                
                System.out.println("Computer 값 : " + comsrp);
                System.out.println("입력 값 : " + userInput);
                
                // 3. 사용자의 값과 컴퓨터의 값을 비교한다.
                //    승리, 패배 , 무승부 셋 중에 해당하는 값을 1 증가 시킨다.
                // 4. 결과를 출력한다.
                if(userInput == SCI && comsrp == SCI || userInput == ROK && comsrp == ROK || userInput == PAP && comsrp == PAP  ) {
                    System.out.println("비김");
                    draw++;
                } else if(userInput == SCI && comsrp == ROK || userInput == ROK && comsrp == PAP || userInput == PAP && comsrp == SCI) {
                    System.out.println("짐");
                    lose++;
                } else if(userInput == SCI && comsrp == PAP || userInput == ROK && comsrp == SCI || userInput == PAP && comsrp == ROK) {
                    System.out.println("이김");
                    win++;
                } else {
                    System.out.println("잘못입력");
                }
                
                // if(userChoice == 1) 마지막 줄
            } else if(userChoice == 2) {
                // 기록보기
                int total = win + lose + draw;                
                
                System.out.printf("%d전 %d승 %d무 %d패\n", total, win, draw, lose);
                
                // else if(userChoice == 2) 마지막 줄
            } else if (userChoice == 3) {
                // 종료
                System.out.println("감사합니다.");
                break;
                
                // else if(userChoice == 3) 마지막 줄
            }
            // while(true) 마지막 줄
        }
        
        scan.close();
    }
}
