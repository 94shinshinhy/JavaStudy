package kr.co.bitcamp.nested01;

public class NestedTest {
    
    // 인스턴스 멤버 클래스
    class A {
        int iv = 100;
        // static int cv = 200;        // static 멤버변수는 사용 불가. NestedTest.A.cv 이렇게 접근 안됨
        
        public A() {
            System.out.println("A 생성자 호출");
        }
        
        public void methot1() {
            System.out.println("A 클래스의 method1() 호출");
        }
        
        // public static void method2(){}        // NestedTest.A.method2() 이렇게 접근 안됨
    }
    
    // 정적 멤버 클래스
    static class B {
        int iv = 100;
        static int cv = 500;        // Nested.B.cv 접근 가능하기때문에 선언됨
        
        public B() {
            System.out.println("B생성자 호출");
        }
        
        public void method1() {
            System.out.println("B클래스의 methot1() 호출");
        }
        
        public static void method2() {
            System.out.println("B클래스의 method2() 호출");
        }
    }
    
    public void method1() {
        // 로컬클래스 선언과 사용(메서드내에 선언하여, 잠깐 사용할 용도)
        class C {
            int iv = 200;
//            static int cv = 700;        // static 멤버선언이 불가능
            public C() {
                System.out.println("로컬클래스 C 생성자 호출");
            }
            public void lmethod() {
                System.out.println("로컬클래스 C의 메서드 호출");
            }
//            public static void lmethod2() {        // static 선언불가
//            }
        }
        // 로컬클래스는 해당 메서드내에서만 사용이 가능하다는 것에 주목하자
        C c = new C();
        System.out.println(c.iv);
        c.lmethod();
    }
    
    public void method2() {
        // 로컬클래스 선언과 사용(메서드내에 선언하여, 잠깐 사용할 용도)
        class D {
            int iv = 200;
//            static int cv = 700;        // static 멤버선언이 불가능
            public D() {
                System.out.println("로컬클래스 D 생성자 호출");
            }
            public void lmethod() {
                System.out.println("로컬클래스 D의 메서드 호출");
            }
//            public static void lmethod2() {        // static 선언불가
//            }
        }
        // 로컬클래스는 해당 메서드내에서만 사용이 가능하다는 것에 주목하자
        D d = new D();
        System.out.println(d.iv);
        d.lmethod();
    }

    public static void main(String[] args) {
        
        NestedTest nestedTest = new NestedTest();
        NestedTest.A a = nestedTest.new A();        // 인스턴스 멤버 클래스는 외부 클래스의 인스턴스가 반드시 있어야 생성가능
        System.out.println(a.iv);
        a.methot1();
        
        System.out.println("-------------------------");
        
        // 정적 클래스 static 멤버호출 --- 외부 클래스의 인스턴스가 없이도 접근 가능 
        System.out.println(NestedTest.B.cv);
        NestedTest.B.method2();
        
        System.out.println("-------------------------");
        
        NestedTest.B b = new B();
        System.out.println(b.iv);
        b.method1();
        
        System.out.println("-------------------------");
        
        nestedTest.method1();
        
        System.out.println("-------------------------");
        
        nestedTest.method2();
        
        /*
         *  멤버클래스와 로컬클래스를 구분짓는 기준
         *  => 로컬클래스는 순번이 붙음 
         */

    }

}



















