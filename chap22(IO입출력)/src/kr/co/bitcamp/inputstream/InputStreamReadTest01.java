package kr.co.bitcamp.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputStreamReadTest01 {

    // 일반 예외가 발생하는데 그 예외를 JVM에 던지고 있음.
    public static void main(String[] args) throws Exception {
        
        InputStream iStream = new FileInputStream("C:\\Users\\bitcamp\\eclipse-workspace\\test.txt");
        int readByte;    // 읽은 바이트 수를 리턴받는 변수 용도로 사용.
        
        /*
         *  InputStream의 read()는 더이상 읽을 게 없다면 -1값을 리턴함.
         */
//        while((readByte = iStream.read()) != -1) {
//            
//            System.out.println("읽은 데이터(1바이트) : " + readByte);    // 아스키코드값을 출력
//            System.out.println("읽은 문자 : " + (char)readByte);    // 강제타입캐스팅 후 문자로 출력
//            
//        }
        
        while(true) {
            readByte = iStream.read();
            if(readByte == -1)
                break;
            System.out.println("읽은 문자 : " + (char)readByte);
        }
        
        // 이클립스의 디폴트 캐릭터셋
        System.out.println(Charset.defaultCharset());
        
        // 리소스 반납
        iStream.close();

    }

}



















