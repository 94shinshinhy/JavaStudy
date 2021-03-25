package kr.co.bitcamp.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderTest03 {

    public static void main(String[] args) throws Exception {
        
        Reader reader = new FileReader("C:\\Users\\bitcamp\\eclipse-workspace\\test5.txt");
        
        char[] cArr = new char[10];
        
        // cArr배열에 1번째 인덱스부터 test5.txt파일에 있는 3자를 읽어서 저장하라.
        int readData = reader.read(cArr, 0, 10);
        System.out.println("읽은 문자 수 : " + readData);
        
        for (int i = 0; i < cArr.length; i++) {
            System.out.println(i + "번째 문자 : " + cArr[i]);
        }
        
        reader.close();

    }

}
