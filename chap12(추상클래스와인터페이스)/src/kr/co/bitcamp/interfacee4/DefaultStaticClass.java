package kr.co.bitcamp.interfacee4;

public class DefaultStaticClass implements MyInterface {

    @Override
    public void method() {
        
        System.out.println(DefaultStaticClass.MAX_NUM);
        System.out.println("MyInterface의 추상메서드를 재정의한 메서드 호출");
        
    }
    
    @Override
    public void dMethod() {
        System.out.println("MyInterface의 디폴트 메서드 오버라이딩한 메서드 호출");
    }
    
    

}
