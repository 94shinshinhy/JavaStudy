package kr.co.bitcamp.typeparameter;

public class CompareTest {

    public static void main(String[] args) {
        
        int res =  Compare.compare(300, 200);
        System.out.println(res);
        
        // String 클래스는 Number클래스와 아무런 관게가 없음.
        // Compare.compare("이순신", "김순신");        // 에러남
        
        // Number 클래스가 Object클래스의 자손이기때문에 매개변수 타입으로 적절하지않음.
        // Compare.compare(new Object, new Object);        // 에러남
        
        res = Compare.compare(new Integer(100), new Double(75.11));        // auto boxing
        System.out.println(res);
        
        // Number은 추상클래스이므로 인스턴스를 생성하지못한다.
        // Compare.compare(new Number(), new Number());        // 에러남
        
    }

}
