package kr.co.bitcamp.staticvariable;

public class Card {

    // 인스턴스 변수 --> 반드시 new로 인스턴스를 해야 접근 가능
    private String color;        // 카드 색상
    private String company;      // 카드 회사명
    
    // static 변수(= 정적변수, 클래스변수, 공유변수) --> 인스턴스 생성없이도 클래스명.static변수명으로 접근가능
    static int width = 100;      // 카드 폭
    static int height = 50;      // 카드 높이
    
    // getter(), setter() --> 인스턴스 메서드
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    
    public String toString() {
        /*
         *  정적변수(static)는 방법이 반드시 클래스명.static변수명으로 접근해야 올바른 방법이다.
         */
        
        return "card의 색상 : " + this.getColor() + 
                ", 카드의 회사 : " + this.company + 
                ", 크기 : (" + Card.height +
                ", " + Card.width + ")";
        
    }
    
}



















