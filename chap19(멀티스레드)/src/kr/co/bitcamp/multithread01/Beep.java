package kr.co.bitcamp.multithread01;

import java.awt.Toolkit;

// Runnable 인터페이스를 직접 구현
public class Beep implements Runnable {

    @Override
    public void run() {
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i < 5; i++) {
            System.out.println("비프음 실행하는 스레드명 : " + Thread.currentThread().getName());
            
            toolkit.beep();
            
            try {
                Thread.sleep(900);
            } catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
            
        }
        
    }   
    
}
