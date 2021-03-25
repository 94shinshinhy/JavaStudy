package kr.co.bitcamp.nested02;

public class A {
    
    public A() {
        
        System.out.println("-------------------------");
        System.out.println("외부클래스 A의 생성자 호출");
        
        B b = new B();        // 객체생성 ==> 인스턴스 멤버클래스는 외부클래스 A의 멤버이다.
        System.out.println(b.a);
        b.method1();
        
        C c = new C();
        System.out.println(c.a);
        System.out.println(C.c);
        c.method1();
        C.method2();
        
//        D d = new D();        // 메서드 내부에 선언되어 있기 때문에 안보임
        this.method();
        System.out.println("-------------------------");
                        
    }
    
    // 인스턴스 멤버클래스 B
    class B {
        int a = 10;
//        static int cv = 20;
        
        public B() {
            System.out.println("중첩클래스 B의 생성자 호출");
        }
        
        public void method1() {
            System.out.println("B클래스 멤버메서드 호출");
        }
        
//        static void method2() {}
        
    }
    
    // 정적멤버 멤버클래스 C
    static class C {
        int a = 10;
        static int c = 20;
        
        public C() {
            System.out.println("정적멤버클래스 C의 생성자 호출");
        }
        
        public void method1() {
            System.out.println("정적멤버클래스 C의 method1 호출");
        }
        
        public static void method2() {
            System.out.println("정적멤버클래스 C의 정적메서드 method2 호출");
        }
        
    }
    
    public void method() {
        class D {
            int a = 1000;
            public D() {
                System.out.println("로컬클래스 D의 생성자 호출");
            }
            public void lmethod() {
                System.out.println("로컬클래스 D의 멤버 메서드 lmethod 호출");
            }
        }
        
        // 로컬클래스는 메서드 내부에서만 생성 및 사용이 가능하다
        D d = new D();
        d.lmethod();
        
    }

}



















