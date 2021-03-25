package kr.co.bitcamp.array;

import java.util.Arrays;

public class StringArray {

    public static void main(String[] args) {
        
        // String 배열
        String str = new String("자바");
        System.out.println(str);
        System.out.println(str.toString());
        System.out.println();
        
        // 객체 배열 => 2차원 배열임
        String[] str2 = new String[] {
                "안녕", "이순신", "류성룡"        // 1차원 배열임
        };
        
        for(int i=0; i<str2.length; i++) {
            System.out.print(str2[i] + " ");
        }
        System.out.println();
        
        // 주소가 나옴
        System.out.println("String 배열의 주소 : " + str2);
        System.out.println("String 배열의 주소 : " + str2.toString());
        
        // Object 클래스는 모든 클래스의 최고 조상
        // String 클래스는 Object클래스의 toString을 오버라이딩(재정의)했기때문에 값이 출력됨.
        
        System.out.println("String 배열의 주소 : " + str2[1].toString());
        
        str2[0] = "정철";
        System.out.println(Arrays.toString(str2));
        System.out.println();
        
        // 향상된 for문
        for(String str0 : str2) {
            System.out.println(str0);
        }
        
    }
    
}



















