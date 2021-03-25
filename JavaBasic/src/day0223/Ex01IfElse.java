package day0223;
// 조건문 02 - if else 구조
// if else 구조란
// if의 조건식이 false이 나왔을 경우를 대비하여
// else 코드블락을 만들어
// if의 조건식이 false가 나왔을 때 실행될 코드를 만들어주는 것이다.

// if else 구조에서는 만약 if의 조건식이 true가 나오면 if의 코드 블락만 실행이 되고
// false가 나오면 else의 코드블락이 실행이 되는 구조이다.
public class Ex01IfElse {
    public static void main(String[] args) {
        int number = 5;
        
        if(number >= 0) {
            System.out.println("자연수입니다.");
        } else {
            System.out.println("음의 정수입니다.");
        }
    }
}
