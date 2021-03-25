package kr.co.bitcamp.carddeck;

public class Deck {

    final int CARD_NUM = 52;                        // 카드의 개수(13 * 4)
    // 객체배열(2차원 배열 타입)
    Card[] card = new Card[CARD_NUM];
    
    int i = 0;
    
    // 인스턴스 초기화 블럭
    {
        // 52번 실행하면서 카드를 초기화
        for(int k=Card.KIND_MAX; k>0; k--) {        // 4 3 2 1 : 무늬
            for(int n=1; n<Card.NUM_MAX+1; n++) {   // 13(카드번호는 1부터이므로 +1)
                card[(i++)] = new Card(k, n);
            }
        }
        
        // 제대로 초기화가 이루어졌는지 내용을 출력해봄
        for(int j=0; j<card.length; j++) {
            System.out.printf("Card[%d]의 무늬 : %d, Card[%d]의 숫자 : %d\n", j, card[j].kind, j, card[j].number);
        }
        
    }
    
    public Deck() {
        // super();
        System.out.println("Deck 기본 생성자 호출");
    }
    
    // 저장된 위치(index)에 있는 카드 하나를 선택
    public Card pick(int index) {
        if(0 <= index && index < CARD_NUM) {            // 예외상황처리
            return card[index];
        }
        else {
            return pick();                              // 위사이의 숫자가 아니라면 
        }
    }
    
    // Deck에서 카드 하나를 임의로 선택(오버로딩)
    public Card pick() {
        int index = (int)(Math.random()*CARD_NUM);
        System.out.print("임의로 뽑은 카드 => ");
        System.out.printf("%d번은 ", index);
        
        return pick(index);
    }
    
    // 카드를 단순히 섞는 기능
    public void shuffle() {
        for(int n=0; n<1000; n++) {
            // 카드를 무작위로 섞는다.
            int i = (int)(Math.random()*CARD_NUM);
            Card temp = card[0];
            card[0] = card[i];
            card[i] = temp;
        }
        
        System.out.println();
        System.out.println("카드 섞은 후 결과");
        // 제대로 초기화가 이루어졌는지 내용을 출력해봄
        for(int j=0; j<card.length; j++) {
            System.out.printf("Card[%d]의 무늬 : %d, Card[%d]의 숫자 : %d\n", j, card[j].kind, j, card[j].number);
        }
    }
    
}



















