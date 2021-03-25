package kr.co.bitcamp.finalconstant;

public class PersonTest {

    public static void main(String[] args) {
        
        Person per = new Person(25);
        // per.nation = "china";            // 불가함 확인
        // per.age = 60;                    // 불가함 확인
        
        System.out.println(per);
        
        System.out.println(Person.MAX_NUMBER);
        
        Person per2 = new Person(50);
        Person per3 = new Person(150);
        Person per4 = new Person(250);
        
        System.out.println(per2);
        System.out.println(per3);
        System.out.println(per4);
        
        System.out.println();
        System.out.println(per2.age);
        System.out.println(per3.age);
        System.out.println(per4.age);
    }

}
