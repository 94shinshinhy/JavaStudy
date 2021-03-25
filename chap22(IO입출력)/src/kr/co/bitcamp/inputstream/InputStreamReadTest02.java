package kr.co.bitcamp.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamReadTest02 {

    public static void main(String[] args) throws Exception {
        
        InputStream iStream = new FileInputStream("C:\\Users\\bitcamp\\eclipse-workspace\\test2.txt");
        int readByteNo;
        byte[] bytes = new byte[3];
        
        while((readByteNo = iStream.read(bytes)) != -1) {
            System.out.println("읽은 바이트 수 : " + readByteNo);
            // String클래스로 디코딩해서 한글이 출력됨.
            String str = new String(bytes);
            System.out.println("읽은 문자열 : " + str);    // 문자열 출력
            
        }
        
        iStream.close();

    }

}
