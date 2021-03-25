package kr.co.bitcamp.abstractt;

public abstract class KakaoSender02 extends ContentSender {
    
    private String content;

    public KakaoSender02(String title, String name, String content) {
        super(title, name);
        this.content = content;
    }

    @Override
    public void sendMessage(String content) {
        
    }
    
    

}
