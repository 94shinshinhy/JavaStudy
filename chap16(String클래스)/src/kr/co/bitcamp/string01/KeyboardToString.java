package kr.co.bitcamp.string01;

import java.io.IOException;

public class KeyboardToString {

    public static void main(String[] args) {
        
        byte[] bytes = new byte[100];
        
        System.out.print("입력 : ");
        int readByteNo = 0;
        
        try {
            
            /*
             *  키보드(표준입역)로부터 입력을 받고 그 내용을 bytes에 저장을 하고
             *  입력받은 바이트수를 리턴함 
             */
            readByteNo = System.in.read(bytes);
            
            // 문자셋 UTF-8으로 디코딩
            String str = new String(bytes, 0, readByteNo-2, "UTF-8");
            System.out.println(str);
            
            System.out.println("입력받은 바이트 수 : " + readByteNo);
            
            // euc-kr : 한글 2byte, utf-8 : 한글 3byte
            byte[] b = str.getBytes("UTF-8");
            System.out.println(b.length);
            
            /*
             *  인코딩과 디코딩 과정에서 반드시 문자셋은 동일하게 가져가야 글자가
             *  깨지거나 하는 오류를 방지할 수 있다.
             */
            byte[] b2 = "안녕하세요".getBytes();
            String str1 = new String(b2, 0, b2.length, "UTF-8");
            System.out.println(str1);
            System.out.println(b2.length);
            
        } catch (IOException e) {
            
            // e.printStackTrace();
            
        }
        
    }
    
}



















