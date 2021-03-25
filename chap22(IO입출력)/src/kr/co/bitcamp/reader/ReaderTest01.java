package kr.co.bitcamp.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderTest01 {

    public static void main(String[] args) throws Exception {
        
        // Reader클래스는 문자특화 클래스로써 하위클래스인 FileReader를 생성해서 대입
        Reader reader = new FileReader("C:\\Users\\bitcamp\\eclipse-workspace\\test5.txt");
        int readData;
        
        // readData는 int값으로 끝 2바이트에 저장
        while((readData = reader.read()) != -1) {
            System.out.println("읽은 문자 : " + (char)readData);
            //기본적으로 영문자는 아스키 코드가 출력되고, 한글은 유니코드가 출력
            // (char) 문자출력(바이트정보를 강제 캐스팅)
        }
        
        reader.close();

    }

}
