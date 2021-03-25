package kr.co.bitcamp.exception01;

public class AritmeticTest {
    
    public static void main(String[] args) {
        // 산술적 예외발생
        int a = 10;
        int b = 0;
        
        // 모든 수는 0으로 나눌 수 없다.
        int c = a/b;
        System.out.println(c);
    }

}
