package day0225;

import java.util.Scanner;

// 배열 예제
// 사용자로부터 숫자를 4개 입력받아서
// 배열에 차례대로 저장하고
// 다시 차례대로 출력하는 프로그램을 작성하시오
public class Ex02Array02 {
    static final int SIZE = 4;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] array = new int[SIZE];
        
        for(int i = 0; i < array.length; i++) {
            System.out.print((i+1)+"번째 값 : ");
            array[i] = sc.nextInt();
        }
        
        System.out.println("-----array의 값들-----");
        for(int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] : %d\n", i, array[i]);
        }
        
        sc.close();

    }

}
