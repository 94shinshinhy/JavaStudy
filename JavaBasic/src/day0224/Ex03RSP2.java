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

public class Ex03RSP2 {
    
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
                
                while(!(userInput >= SCI && userInput <= PAP)) {
                    System.out.println("잘못입력하셨습니다.");
                    System.out.println("1. 가위 2. 바위 3. 보");
                    System.out.print("> ");
                    userInput = scan.nextInt();
                    
                    // while(!(userInput >= SCI && userInput <= PAP)) 마지막 줄
                }
                
                // 3. 사용자의 선택과 컴퓨터의 선택을 각각 출력해준다.
                String userMSG = new String("사용자의 선택 : ");
                switch(userInput) {
                case 1:
                    userMSG += "가위";
                    break;
                case 2:
                    userMSG += "바위";
                    break;
                case 3:
                    userMSG += "보";
                    break;
                }
                
                String comMSG = new String("컴퓨터의 선택 : ");
                switch(comsrp) {
                case 1:
                    comMSG += "가위";
                    break;
                case 2:
                    comMSG += "바위";
                    break;
                case 3:
                    comMSG += "보";
                    break;
                }
                
                System.out.println(userMSG);
                System.out.println(comMSG);
                
                // 4. 사용자의 값과 컴퓨터의 값을 비교한다.
                if(comsrp == userInput) {
                    // 무승부
                    System.out.println("무승부!!");
                    draw++;
                    
                } else {
                    // 승리 혹은 패배
                    if (userInput == SCI) {
                        // 사용자가 가위를 골랐을 경우
                        if(comsrp == ROK) {
                            // 컴퓨터가 바위를 골랐을 경우
                            System.out.println("패배!!");
                            lose++;
                        } else {
                            // 컴퓨터가 보를 골랐을 경우
                            System.out.println("승리!!");
                            win++;
                        }
                        
                    } else if(userInput == ROK) {
                        // 사용자가 주먹을 골랐을 경우
                        if(comsrp == SCI) {
                            // 컴퓨터가 가위를 골랐을 경우
                            System.out.println("승리!!");
                            win++;
                            
                        } else {
                            // 컴퓨터가 보를 골랐을 경우
                            System.out.println("패배!!");
                            lose++;
                        }
                    } else if(userInput == PAP) {
                        // 사용자가 보를 골랐을 경우
                        if(comsrp == ROK) {
                            // 컴퓨터가 가위를 골랐을 경우
                            System.out.println("승리!!");
                            win++;                        
                        } else {
                            // 컴퓨터가 가위를 골랐을 경우
                            System.out.println("패배!!");
                            lose++;
                        }
                    }
                    
                }
                
                //    승리, 패배 , 무승부 셋 중에 해당하는 값을 1 증가 시킨다.
                // 5. 결과를 출력한다.                
                
                // if(userChoice == 1) 마지막 줄
            } else if(userChoice == 2) {
                // 기록보기
                // 현재 결과를 출력한다.
                // 단, 총 전적(승, 무, 패의 합)이 0이면
                // "아직 플레이 기록이 없습니다."를 출력해준다.
                int total = win + lose + draw;  
                if(total == 0) {
                    // 아직 플레이 기록이 없으므로 경고메시지만 출력
                    System.out.println("아직 플레이한 기록이 없습니다.");
                } else {
                    // 플레이 기록이 있으므로 출력해준다.
                    System.out.printf("%03d전 %03d승 %03d무 %03d패 (%5.2f%%)\n", total, win, draw, lose, (double)win / total * 100);
                }
                
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
