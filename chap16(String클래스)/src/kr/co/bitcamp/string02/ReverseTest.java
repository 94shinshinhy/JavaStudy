package kr.co.bitcamp.string02;

public class ReverseTest {

    public static void main(String[] args) {
        
       String str = "안녕하세요";
       String reverse = "";
       int count = 0;
       
       count = str.length();
       System.out.println("문자열 길이 : " + count);
       
       // 역순으로 출력(charAt())
       for(int i=0; i<count; i++) {
           
           reverse += str.charAt(count-(i+1));
           System.out.println(reverse);
           System.out.println(reverse.hashCode());        // 매번 새로운 문자열을 생성하고 있음.
           
       }
       
       System.out.println("역순 출력 : " + reverse);
       
       System.out.println();
       
       String rev = reverseString(str);
       System.out.println("reverseString() 호출 후 : " + rev);
        
    }
    
    public static String reverseString(String str) {
        
        return new StringBuilder(str).reverse().toString();
        
    }
    
}



















