package kr.co.bitcamp.classs;

public class ClassTest {

    public static void main(String[] args) {
        
        // 1) 객체로부터 클래스 정보를 얻는 방법(getClass())
        Person person = new Person();
        Class class1 = person.getClass();
        System.out.println(class1.getName());    // 패키지명 포함한 클래스명을 리턴함
        System.out.println(class1.getSimpleName());    // 클래스명만 리턴함
        System.out.println();
        
        // 2) 문자열로부터 객체의 정보를 얻는 방법(Class.forName(""))
        try {
            Class class2 = Class.forName("kr.co.bitcamp.classs.Person");
            System.out.println(class2.getName());    // 패키지명 포함한 클래스명을 리턴함
            System.out.println(class2.getSimpleName());    // 클래스명만 리턴함
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
}
