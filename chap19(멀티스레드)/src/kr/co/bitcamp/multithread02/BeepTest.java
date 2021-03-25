package kr.co.bitcamp.multithread02;

public class BeepTest {

    public static void main(String[] args) {
        
        Thread thread = new Beep();    // 필드의 다형성
        thread.start();
        
        for(int i = 0; i < 5; i++) {
            
            System.out.println("따땅");
            
            try {
                Thread.sleep(900);
            } catch(InterruptedException e) {
                
                System.out.println(e.getMessage());
                
            }
            
        }

    }

}
