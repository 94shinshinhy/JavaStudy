package kr.co.bitcamp.properties;

import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) throws Exception {
        
        // Properties 객체는 키와 값을 String로 제한한 Map컬렉션임.
        Properties properties = new Properties();
        // PropertiesTest와 동일한 곳에 지금 프로퍼티 파일이 존재하므로 아래처첨 패스를 알아오는 것임.
        String path = PropertiesTest.class.getResource("database.properties").getPath();
        // 파일경로 출력
        System.out.println(path);
        
        // 한글로 파일경로가 출력되도록 디코딩한다.
        path = URLDecoder.decode(path, "UTF-8");    // 한글이 3바이트
        // path = URLDecoder.decode(path, "EUC-KR");    // 한글깨짐, 한글이 2바이트
        System.out.println(path);
        
        // database.properties 파일을 읽어들임
        properties.load(new FileReader(path));
        
        // 키를 주고 값을 읽어옴
        String driver = properties.getProperty("driver");
        System.out.println("driver : " + driver);
        
        String url = properties.getProperty("url");
        System.out.println("url : " + url);
        
        String username = properties.getProperty("username");
        System.out.println("username : " + username);
        
        String password = properties.getProperty("password");
        System.out.println("password : " + password);

    }

}



















