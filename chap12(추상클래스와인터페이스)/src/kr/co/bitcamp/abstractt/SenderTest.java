package kr.co.bitcamp.abstractt;

public class SenderTest {

    public static void main(String[] args) {
        
        // 추상클래스이니 절대 인스턴스를 생성할 수가 없음
        // ContentSender con = new ContentSender("안녕", "안녕하세요");
        
        // 추상클래스도 조상이니까 필드의 다형성 적용됨
        ContentSender con = new KakaoSender("카카오", "김원효", "안녕 해피바이러스!");
        con.sendMessage("박지선");
        System.out.println();
        
        ContentSender con2 = new SmsSender("SMS", "박성광", "네 귀하고 씩씩했던 삶!");
        con2.sendMessage("박지선");
     
    }

}
