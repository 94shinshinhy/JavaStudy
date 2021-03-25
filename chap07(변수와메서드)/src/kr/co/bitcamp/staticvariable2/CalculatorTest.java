package kr.co.bitcamp.staticvariable2;

public class CalculatorTest {

    public static void main(String[] args) {
        
        Calculator cal = new Calculator();
        
        // 인스턴스 메소드 호출
        int addRes = cal.add(100, 200);
        System.out.println("인스턴스 메서드 add() 호출 결과 : " + addRes);
        
        long mulRes = Calculator.multiply(5, 5);
        System.out.println("static 메서드 multiply() 호출 결과 : " + mulRes);
        
        double divRes = Calculator.divide(20.2, 5.2);
        System.out.println("static 메서드 divide() 호출 결과 : " + divRes);
        
        Integer.parseInt("100");
        Math.random();

    }

}
