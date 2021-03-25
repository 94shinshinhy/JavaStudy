package kr.co.bitcamp.staticvariable2;

public class Calculator {

    // 인스턴스 메서드
    // 특징 : new 연산자로 인스턴스를 생성해야지만, 참조변수명.인스턴스메서드() 접근가능
    public int add(int x, int y) {
        double dRes = Calculator.divide(10.5, 11.7);
        System.out.println("인스턴스 메서드내에서 static 메서드를 호출 : " + dRes);
        return x + y;
    }
    
    // 인스턴스 메서드
    public int substract(int x, int y) {
        return x - y;
    }
    
    // static(정적) 메서드
    // 특징 : 인스턴스 생성없이 클래스명.정적메서드명으로 바로 접근 가능
    /*
     * static 메서드는 이미 메모리 상단에 할당이 올라가있고 인스턴스 생성없이 접근이 가능해야되는데
     * 아래에 코드는 인스턴스가 생성되어야지만 사용이 가능한 add()가 호출하기때문에 예외가 발생한다.
     * 즉, 인스턴스가 언제 생성될지 아무도 모르기때문에 static메서드 안에는 인스턴스 메서드가 절대 오면 안됨
     */
    public static long multiply(long x, long y) {
        // this.add(10, 5); 사용불가
        return x * y;
    }
    
    public static double divide(double x, double y) {
        return x / y;
    }
    
}
