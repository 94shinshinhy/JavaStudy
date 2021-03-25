package kr.co.bitcamp.string02;

public class TrimTest {

    public static void main(String[] args) {
        
        String tel1 = "   02";
        String tel2 = "-3305   ";
        String tel3 = "   -1037   ";
        System.out.println(tel1.trim());
        System.out.println(tel1.trim() + tel2.trim() + tel3.trim());

    }

}
