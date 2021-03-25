package kr.co.bitcamp.staticvariable;

public class CardTest {

    public static void main(String[] args) {
        
        Card card = new Card();
        card.setColor("노랑");
        card.setCompany("국민은행");
        System.out.println(card);
        
        //card.width = 80;
        //card.height 150;
        
        /*
         *  static 변수는 반드시 클래스명.static변수명을 접근하여야함
         *  공유변수는 분석하는 단계에서 바꾸지 않는 것이 바람직함
         */
        Card.width = 80;
        Card.height = 150;
        
        Card card2 = new Card();
        card2.setColor("파랑");
        card2.setCompany("농협");
        System.out.println(card2);

    }

}
