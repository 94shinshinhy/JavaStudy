package kr.co.bitcamp.array;

import java.util.Arrays;

/*
 *  버블 정렬 : 서로 이웃한 데이터를 비교하여 정렬하는 방법이다.
 *            거품정렬이라고도 한다. 데이터의 이동 모양이 거품모양으로 수면 위로 올라오는듯한
 *            모습을 보이기때문에 지어진 이름이다.
 */

public class BubbleSort {

    public static void main(String[] args) {
        
        int[] ball = new int[5];
        
        for(int i=0; i<ball.length; i++) {
            ball[i] = (int)(Math.random() * 45 + 1);
        }
        
        System.out.println("정렬 전");
        for(int i=0; i<ball.length; i++) {
            System.out.print(ball[i] + " ");
        }
        System.out.println();
        
        
        Arrays.sort(ball);
        
        System.out.println("정렬 후");

        System.out.println(Arrays.toString(ball));
        System.out.println();

    }

}



















