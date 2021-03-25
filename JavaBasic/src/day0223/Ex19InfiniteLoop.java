package day0223;
// 무한 반복문(infinite Loop)
// 무한 반복문이란
// 반복을 결정하는 조건식을 체크할 때 마다
// true가 나와서 프로그램을 우리가 강제로 종료시키기전까지
// 영원히 반복되는 루프를 무한 반목문이라고 한다.

// 무한루프를 만드는 방법은 다양하게 있지만
// 우리는 그 중에서 while를 이용해서 만드는 3가지 방법을 알아볼 것이다.

public class Ex19InfiniteLoop {

    public static void main(String[] args) {
        // 무한루프 1번.
        // 만약 값의 변경이 없는 변수로 참이 나오는 조건식을
        // while의 ()안에 넣어주면?
        //int num = 3;
        //
        //while (num > 0) {
        //    System.out.println("반복문입니다.");
        //    System.out.println("num의 현재 값" + num);
        //    num--;
        //}
        
        // 무한루프 2번.
        // 만약 항상 참이 나오는 조건식을
        // while의 ()안에 넣어주면?
        
        //while(1 > 0) {
        //    System.out.println("무한루프 2번");
        //}
        
        // 무한루프 3번
        // 만약 true를
        // while의 ()안에 넣어주면?
        
        //while(true) {
        //    System.out.println("무한루프 3번");
        //}
        
        // 무한루프의 경우, 해당 프로그램은 영원히 무한루프의
        // 코드 블락 안에서 코드가 반복되기 때문에
        // 무한루프 이후의 코드는 "접근할 수 없는 코드(unreachable code)"라는 에러가 발생하게 된다.
        System.out.println("여기는 실행될까?");
        
    }

}



















