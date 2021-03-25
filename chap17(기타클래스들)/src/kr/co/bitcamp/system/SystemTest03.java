package kr.co.bitcamp.system;

import java.util.Properties;
import java.util.Set;

public class SystemTest03 {

    public static void main(String[] args) {
        
        String osName = System.getProperty("os.name");
        System.out.println("현재 운영체제 : " + osName);
        
        String userName = System.getProperty("user.name");
        System.out.println("현재 사용자계정 : " + userName);
        
        /*
         * Properties클래스는 Map계열의 컬렉션이다. 키값도 String, 값도 String이다.
         */
        Properties properties = System.getProperties();
        
        // Map컬렉션에서 키값만 Set계열로 가져오는 메서드 : keyset()
        Set set = properties.keySet();
        
        System.out.println("Key                                             value");
        System.out.println("--------------------------------------------------");
        for(Object objKey : set) {
            String key = (String) objKey;
            String value = System.getProperty(key);
            System.out.println(key + "                                " + value);
        }
        
    }
    
}



















