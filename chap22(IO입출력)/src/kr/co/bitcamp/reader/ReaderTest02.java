package kr.co.bitcamp.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderTest02 {

    public static void main(String[] args) throws Exception {
        
        Reader reader = new FileReader("C:\\Users\\bitcamp\\eclipse-workspace\\test5.txt");
        int readData;        
        char[] cArr = new char[2];
        String str = "";
        
        while((readData = reader.read(cArr))!= -1) {
            str += new String(cArr, 0, readData);    // 읽은 문자를 문자열로 생성
            System.out.println("읽은 문자 수 : " + readData);
        }
        
        // 문자열 출력
        System.out.println(str);
        
        reader.close();

    }

}
