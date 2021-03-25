package kr.co.bitcamp.multithread01;

import java.awt.Toolkit;

public class BeepSoundTest02 {

    public static void main(String[] args) {
        
        // 직접 스레드를 생성하는 방법 3가지
        // 방법 2 --> 익명구현객체
        Thread thread = new Thread(new Runnable() {
            
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
        });
        
        thread.start();
        
        for(int i = 0; i < 5; i++) {
            System.out.println("비프음 실행하는 스레드명 : " + Thread.currentThread().getName());
            
            System.out.println("삐융~~");
            
            try {
                Thread.sleep(900);
            } catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
