package kr.co.bitcamp.string02;

public class LenghtTest {

    public static void main(String[] args) {
        
        String phoneNum = "01045671234";
        System.out.println("문자열의 길이 : " + phoneNum.length());
        
        // lenght() : 문자열의 길이 리턴
        int lenght = phoneNum.length();
        if(lenght == 11) {
            System.out.println("폰 번호 자릿수가 맞습니다.");
        } else {
            System.out.println("다시 입력해 주세요.");
        }
        
    }
    
}
