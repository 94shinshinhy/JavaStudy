package kr.co.bitcamp.equals;

public class StudentTest {

    public static void main(String[] args) {
        
//        Student student1 = new Student(20);
//        Student student2 = new Student(20);
//        
//        System.out.println(student1.equals(student2));
        
//        Student student1 = new Student(30, "류현진");
//        Student student2 = new Student(30, "류현진");
//        
//        System.out.println(student1.equals(student2));
//        
//        Student student3 = new Student(30, "류현진");
//        Student student4 = new Student(30, "최지만");
//        
//        System.out.println(student3.equals(student4));
        
        Student student1 = new Student(30, "류현진", new int[] {100, 90});
        Student student2 = new Student(30, "류현진", new int[] {100, 90});
        
        System.out.println(student1.equals(student2));
        
        Student student3 = new Student(30, "류현진", new int[] {100, 90});
        Student student4 = new Student(30, "류현진", new int[] {100, 50});
        
        System.out.println(student3.equals(student4));

    }

}
