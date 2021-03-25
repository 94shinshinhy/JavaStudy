package kr.co.bitcamp.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FilecopyTest {

    public static void main(String[] args) throws Exception {
        // write3.txt ==> write3_복사본.txt
        InputStream iStream = new FileInputStream("C:\\Users\\bitcamp\\eclipse-workspace\\write3.txt");
        OutputStream oStream = new FileOutputStream("C:\\Users\\bitcamp\\eclipse-workspace\\write3_복사본.txt");
        
//        int data = 0;
//        while((data = iStream.read()) != -1) {
//            oStream.write(data);
//        }
//        oStream.flush();
//        System.out.println("C드라이브에 write3_복사본.txt파일이 생성되었습니다.");
//        
//        oStream.close();
//        iStream.close();
        
        int readBytes;
        byte[] bytes = new byte[100];
      
        while((readBytes = iStream.read(bytes)) != -1) {
            
            oStream.write(bytes);
          
        }
        
        oStream.flush();
      
        iStream.close();
        oStream.close();

    }

}

