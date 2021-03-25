package kr.co.bitcamp.priority;

public class PriorityTest {

    public static void main(String[] args) {
        
        // 메인스레드의 우선순위
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " : " + thread.getPriority());
        
        for(int i = 1; i <= 20; i++) {
            
            Thread thread2 = new CalcThread("Thread : " + i);
            
            // Thread1, 2, 3, 4는 우선순위가 가장 낮다.
            if(i != 20) {
                
                thread2.setPriority(Thread.MIN_PRIORITY);    // thread2.setPriority(1)
            
            } else {    // Thread5는 우선순위가 10으로 가장 높다
                
                thread2.setPriority(Thread.MAX_PRIORITY);    // thread2.setPriority(10)
                
            }
            
            thread2.start();
            
        }
        
        /*
         *  아무리 우선순위가 10으로 주었다하나, 작업을 마치는 빈도가 높을 뿐이지
         *  무조건 100프로 먼저 끝낸다는 보장이 없다.
         *  소결론으로 자바는 순환할당(Round-Robin)방식을 사용하고 있기때문에
         *  CPU스케쥴러의 상태에 따라 달라진다.
         */

    }

}



















