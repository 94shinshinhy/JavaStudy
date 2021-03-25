package kr.co.bitcamp.unsynchronized;

public class UserB extends Thread {
    
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
        this.setName("UserB");
    }
    
    @Override
    public void run() {
        // 공유객체의 필드인 memory값에 50을 변경
        this.calculator.setMemory(50);
        System.out.println("UserB스레드가 출력한 값 : " + this.calculator.getMemory());
    }

}
