package kr.co.bitcamp.exception01;

class A {}
class B extends A {}
class C extends A {}

interface I {}
class D implements I {}
class E implements I {}

public class ClassCastTest {
    
    public static void main(String[] args) {
        
        A a = new B();        // 업캐스팅
        B b = (B)a;           // 다운캐스팅
        System.out.println("실행완료");
        
        A a1 = new C();
        C c = (C)a1;
        System.out.println("실행완료");
        
        I i = new D();
        D d = (D)i;
        System.out.println("실행완료");
        
        I i2 = new E();
        E e = (E)i2;
        System.out.println("실행완료"); 
        
    }

}



















