package kr.co.bitcamp.array;

import java.util.Arrays;

/*
 *  1. 2차원 배열의 생성 및 출력을 다양하게 구현해보시오.
 */

public class ArrayBasic08 {

    public static void main(String[] args) {
        
        // String 1차원 배열 생성
        String[] province = new String[3];
        System.out.println(Arrays.toString(province));    // null 출력
        
        // String 배열 초기화 --> 배열 선언 및 생성시 {}로 동시에 초기화
        String[] nation = new String[] {"한국", "미국", "중국"};
        System.out.println(nation[0]);
        
        String[] flower = {"무궁화", "해바라기", "개나리"};
        System.out.println(flower[1]);
        
        for(int i=0; i<flower.length; i++)
            System.out.println(flower[i]);
        System.out.println();
        
        // 향상된 for문으로 배열의 요소를 출력
        for(String iFlower : flower)
            System.out.print(iFlower + " ");
        System.out.println();
        
        // String 2차원 배열 만들기 --> 2 * 3
        // 아시아 --> 동북아시아(한국, 중국, 일본), 동남아시아(태국, 베트남, 필리핀)
        // String[][] asiaNations = {{"", "", ""},{"", "", ""}};
        
        String[][] asiaNations = {
                {"한국", "중국", "일본"},
                {"태국", "베트남", "필리핀"}
        };
        
        System.out.println(asiaNations[0]);    // 동북아시아의 국가를 저장하고 있는 1차원 배열의 주소
        System.out.println(asiaNations[1]);
        
        System.out.println(asiaNations[0][0]);    // 실제 요소의 값 출력
        
        System.out.println(Arrays.toString(asiaNations[0]));
        System.out.println(Arrays.toString(asiaNations[1]));
        
        System.out.println(asiaNations.length);
        System.out.println(asiaNations[0].length);
        System.out.println(asiaNations[1].length);
        
        // 반복문을 사용한 String 2차원 배열의 값 출력
        for(int i=0; i<asiaNations.length; i++) {
            for(int j=0; j<asiaNations[i].length; j++){
                System.out.print(asiaNations[i][j] + " ");
            }
            System.out.println();
        }
        
        // charAt(int index) 메서드를 사용 --> 해당 인덱스에 있는 값을 반환 --> 단어를 char 배열에 한글자씩 저장할 수 있음.
        String[] strArr = {"hong", "kim", "park"};
        System.out.println(strArr[0]);
        System.out.println(strArr[0].charAt(2));
        System.out.println(strArr[1].charAt(2));
        System.out.println(strArr[2].charAt(2));
        
        System.out.println(strArr.length);
        System.out.println(strArr[0].length());
        
        // 반복문에서 charAt() 메서드 사용
        for(int i=0; i<strArr.length; i++) {
            for(int j=0; j<strArr[i].length(); j++) {
                System.out.print(strArr[i].charAt(j));
            }
        }
        
        System.out.println();
        
        //  length VS length()
        int[] test = new int[10];
        System.out.println(test.length);
        
        String test2 = "Welcome to Bitcamp";
        System.out.println(test2.length());
        
    }

}



















