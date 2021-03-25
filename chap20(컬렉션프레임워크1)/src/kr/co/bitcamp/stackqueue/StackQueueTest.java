package kr.co.bitcamp.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTest {

    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<>();
        // Queue 인터페이스를 구현한 LinkedList클래스 생성 후 대입하고있다.
        Queue<String> queue = new LinkedList<String>();
        
        // 후입선출(LIFO) -> 복사기 용지, 택시기사 동전통
        stack.push("0");
        stack.push("1");
        stack.push("2");
        
        // 선입선출(FIFO) --> 파이프, 수도호스
        queue.offer("0");
        queue.offer("1");
        queue.offer("2");
        
        System.out.println("=스택=");
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        
        System.out.println("=큐=");
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        

    }

}



















