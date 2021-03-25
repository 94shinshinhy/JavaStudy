package kr.co.bitcamp.array;

import java.util.Scanner;

/*
 *  사용자의 입력을 받아서 2차원 배열을 생성하고 값을 입력하는 코드를 구현하시오.
 *  이때 중첩 반복문을 사용하여 출력도 같이 해보시오.
 */

public class TwoArrayUserInput {

    public static void main(String[] args) {
        
        // 사용자 입력을 위한 객체선언
        Scanner scan = new Scanner(System.in);
        
        // 2차원 배열의 행과 열 선언 --> 사용자 입력으로 처리
        System.out.print("행의 갯수를 입력하고 [enter] 치세요 = ");
        int row = scan.nextInt();
        
        System.out.print("열의 갯수를 입력하고 [enter] 치세요 = ");
        int column = scan.nextInt();
        
        // char 2차원 배열 선언 --> 사용자로부터 row, column 입력받아 --> gameMap[row][column] 생성
        char[][] gameMap = new char[row][column];
        
        // 사용자로부터 입력을 받아서 저장할 String 배열 선언 --> 이때 크기를 [row]로 해주도록 한다.
        String[] strArr = new String[row];
        
        // 2차원 배열 요소 --> 사용자가 입력하는 값으로 셋팅
        for(int i=0; i<row; i++) {
            System.out.print((i+1) + "행에 입력할 문자 " + column + "개를 차례대로 입력하고 [enter] 치세요 = ");
            strArr[i] = scan.next();
            for(int j=0; j<column; j++) {
                gameMap[i][j] = strArr[i].charAt(j);        // 사용자가 입력하는 값은 2차원 배열애 입력
            }
        }
        
        // 2차원 배열의 들어있는 값 출력하기
        System.out.println(strArr[0]);
        
        System.out.println("--------------------");
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                System.out.print(gameMap[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }
    
}



















