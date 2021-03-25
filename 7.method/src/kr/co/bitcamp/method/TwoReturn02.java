package kr.co.bitcamp.method;

import java.util.Arrays;

/*
 *  반환값이 2개 있는 메서드를 구현해보시오.
 *  메서드는 {"software", "HAREDWARE"} 입력시 소문자는 대문자로 대문자는 소문자로 출력되도록 구현한다.
 */

public class TwoReturn02 {
    
    public static void main(String[] args) {
        
        String[] ware = smallLarge("software", "HARDWARE");
        
        System.out.println(Arrays.toString(ware));
        
    }
    
    public static String[] smallLarge(String l, String s) {
        
        String l2 = l.toUpperCase();
        String s2 = s.toLowerCase();
        
        return new String[] {l2, s2};
        
    }
    
}





