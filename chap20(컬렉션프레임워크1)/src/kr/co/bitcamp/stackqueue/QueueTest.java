package kr.co.bitcamp.stackqueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {
        
        Queue<Message> messages = new LinkedList<Message>();
        
        messages.offer(new Message("sendMail", "최지만"));
        messages.offer(new Message("sendSMS", "류현진"));
        messages.offer(new Message("sendKakaotalk", "추신수"));
        messages.offer(new Message("sendFaceBook", "박찬호"));
        
        while(!messages.isEmpty()) {
            Message message = messages.poll();
            System.out.println(messages.size());
//            System.out.println("꺼내온 메세지 : " + message.getCommand() + ", " + message.getTo());
            
            switch(message.getCommand()) {
            case "sendMail":
                System.out.println(message.getTo() + "에게 메일을 보냅니다.");
                break;
            case "sendSMS":
                System.out.println(message.getTo() + "에게 SMS를 보냅니다.");
                break;
            case "sendKakaotalk":
                System.out.println(message.getTo() + "에게 카카오톡을 보냅니다.");
                break;
            case "sendFacebook":
                System.out.println(message.getTo() + "에게 페이스북 메시지를 보냅니다.");
                break;
                
            }
        }

    }

}
