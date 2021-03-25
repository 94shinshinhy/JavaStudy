package day0223;
// 조건문 03 - if - else if 구조
// 기존의 if else 구조는
// 우리가 if에 관한 조건식이 false가 나올때에 대해서만
// 실행할 코드를 정의해 주었었다.
// 하지만 실제 프로그래밍에서는 if의 조건식이 false가 낭ㄴ다고
// 무조건 특정 코드가 실행되는 것이 아니라
// 다시 다른 조건으로 체크를 해서, 그 조건이 true일 대
// false일 때에 따른 코드를 다시 만들어줄 때가 더 많다.

// 이때에는 우리가 if - else if 구조를 사용하게 된다.
// if else if 구조에서는 첫번째 조건식이 false가 나오면
// 그 다음 else if의 조건식을 체크, true가 나오면 실행 false가 나오면
// 그 다음 else if의 조건식을 체크...
// 이런식으로 계속 다음 else if로 넘어가는 구조가 된다.
// 만약 제일 마지막에 else를 만들 경우, 위의 모든 조건식이 false가 나오면
// 그 else가 실행된다.
public class Ex04IfElseIf {
    public static void main(String[] args) {
        int number = 1520;
        
        if(number < 0) {
            System.out.println("음의 정수입니다.");
        } else if (number < 10) {
            // 위의 if 조건식인 number < 0이 false가 나온 경우
            // 다시 else if의 조건식인 number < 10을 체크
            System.out.println("한자리 자연수입니다.");
        } else if (number < 100) {
            // 위의 if와 첫번째 else if의 조건식이 false가 나왔을 경우
            // 두번째 else if의 조건식인 number < 100을 체크
            System.out.println("두자리 자연수입니다.");
        } else if (number < 1000) {
            System.out.println("세자리 자연수입니다.");
        } else {
            System.out.println("네자리 이상의 자연수입니다.");
        }
        
        // if - else if 조건식에서 주의할 점
        // 1. 이것은 if나 else 혹은 다른 제어문에도 해당되는 사항이지만
        //    조건식을 넣는 () 뒤에 ;을 붙이면 의미가 달라진다.
        //    우리가 원한 것 : 조건식을 체크해서 true이면 실행(반복)해라
        //    실제 실행된 것 : 조건식을 체크해라.
        
        // 2. else 이후로는 아무것도 오지 못한다.
        //    왜냐면 else는 위의 모든 조건식이 false가 나왔을 때는 무조건
        //    else의 코드블락만이 실행되기때문에
        //    더 이상 다른 조건 체크 같은 것은 되지 않는다.
    }
}
