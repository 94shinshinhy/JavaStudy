package kr.co.bitcamp.threadname;

public class ThreadNameTest {

    public static void main(String[] args) {
        
        /*
         *  스레드 이름을 얻는 방법
         *  1) 정적메서드 이용
         *  Thrrad.currentThread().getName()
         *  2) 인스턴스 메서드 이용
         *  this.getName()
         */
        Thread thread = Thread.currentThread();
        System.out.println("[프로그램 시작 메서드명] : " + thread.getName());
        
        Thread threadBitCamp = new ThreadBitcamp();
        threadBitCamp.start();
        System.out.println("[ThreadBitcamp를 생성한 스레드 이름] : " + Thread.currentThread().getName());
        System.out.println("[main스레드가 threadBitCamp의 이름을 가져온 것] : " + threadBitCamp.getName());
        
        System.out.println();
        
        Thread threadBit = new ThreadBit();
        threadBit.start();
        System.out.println("[ThreadBit를 생성한 스레드 이름] : " + Thread.currentThread().getName());
        System.out.println("[main스레드가 threadBitCamp의 이름을 가져온 것] : " + threadBitCamp.getName());
        
        /*
         *  위의 코드들은 메인스레드가 2개의 스레드를 생성해서 start() 시켜주는 것임.
         *  비로소 threadBitCamp threadBit가 독립적으로 실행이 이루어짐
         */

    }

}



















