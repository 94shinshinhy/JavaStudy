package kr.co.bitcamp.genericextend;

public class StudentTest {

    public static void main(String[] args) {
        
        // 필드의 다형성(원래 타입에 영향)
        Person<String, String> person = new Student<String, String, Integer>();
        person.setKind("아시아계");
        person.setMode("묻지마살상피해");
        
        System.out.println(person.getKind() + " : " + person.getMode());
        
        Student<String, String, Integer> personStudent = new Student<>();
        personStudent.setKind("미국백인족");
        personStudent.setMode("살상공격");
        personStudent.setC(100);
        
        System.out.println(personStudent.getKind() + " : " + personStudent.getMode() + " : " + personStudent.getC());

    }

}



















