package kr.co.bitcamp.string01;

import java.io.UnsupportedEncodingException;

public class GetBytesTest {
    
    public static void main(String[] args) throws Exception {
        
        String str = "안녕하세요";
        
        // 인코딩(기계가 알아보기 편하게 변환하는 과정)
        byte[] byte1 = str.getBytes("UTF-8");
        System.out.println("byte1(UTF-8)의 길이 : " + byte1.length);
        
        byte[] byte2 = str.getBytes("euc-kr");
        System.out.println("byte1(UTF-8)의 길이 : " + byte2.length);
        
        // 디코딩(인간이 알아보기 편하게 변환하는 과정)
        String str1 = new String(byte1, "utf-8");
        System.out.println("utf-8로 디코딩한 문자열 : " + str1);
        
        String str2 = new String(byte2, "euc-kr");
        System.out.println("euc-kr로 디코딩한 문자열 : " + str2);
        
    }

}
