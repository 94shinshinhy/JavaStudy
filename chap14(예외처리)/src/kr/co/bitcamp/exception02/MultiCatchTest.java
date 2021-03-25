package kr.co.bitcamp.exception02;

import java.util.Arrays;

// 다중 catch
public class MultiCatchTest {

    public static void main(String[] args) {
        
        try {
            int[] arr = new int[3];
            System.out.println(Arrays.toString(arr));
            // arr[3] = 100;        // 예외 발생
            
            int result = 10/0;      // 예외 발생
            System.out.println(result);
            
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스를 초과했습니다.");
        } catch(ArithmeticException e) {
            System.out.println("0으로 나눌 수 없다.");
        } catch(Exception e) {
            System.out.println("예외 발생");
        } finally {
            System.out.println("종료");            
        }
        
    }
    
}
