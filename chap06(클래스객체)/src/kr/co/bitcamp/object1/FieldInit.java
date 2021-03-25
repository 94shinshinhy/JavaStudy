package kr.co.bitcamp.object1;

/*
 *  설계도, 붕어빵틀
 */

public class FieldInit {
    
    // 기본형 변수
    byte byteField;              // 1
    short shortField;            // 2
    int intField;                // 4(디폴트 타입)
    long longField;              // 8
    
    boolean booleanField;        // 1
    char charField;              // 2(유니코드)
    
    float floatField;            // 4
    double douleField;           // 8
    
    // 참조형 변수
    int[] arrField;              // 4
    String strField;             // 4
    
    /*
     *  toString() : 클래스의 멤버변수(필드)의 값들을 수시로 확인하고자 할 때나,
     *               워나는 포맷으로 멤버변수들을 출력하고자 할 때 많이 사용함.    
     */
    public String toString() {
        
        String str = "byteField : " + byteField + 
                ", shortField : " + shortField +
                ", intField : " + intField + 
                ", booleanField : " + booleanField + 
                ", strField : " + strField;
        
        return str;
        
    }

}
