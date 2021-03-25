package kr.co.bitcamp.constructor;

public class StudentTest {

    public static void main(String[] args) {
        
        // 기본생성자 호출
        Student stu = new Student();
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu);
        
        // 매개변수가 있는 생성자 호출
        Student stu2 = new Student("이순신", 50);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
        System.out.println(stu2);
        
        // 매개변수가 있는 생성자 호출
        Student stu3 = new Student("이순신");
        System.out.println(stu3);
        
        Student stu4 = new Student(50);
        System.out.println(stu4);

    }

}
