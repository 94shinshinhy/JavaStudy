package kr.co.bitcamp.array;

import java.util.Arrays;

/*
 *  배열을 복사하는 메서드 사용법을 구현하시오.
 */

/*
 *  배열 복사하기
 *  arraycopy() 메서드 사용 --> System.arraycopy(원본배열명, srcPos, 복사배열명, destPos, 길이);
 */

public class ArrayBasic07 {

    public static void main(String[] args) {
        
        // 배열 선언
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // 배열 복사하기
        System.arraycopy(arr1, 2, arr2, 4, 3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }

}



















