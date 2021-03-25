package day0223;

import java.util.Scanner;

// 검증(validation)
// 검증이란, 사용자가 입력한 데이터가 올바른 값인지를 체크하여
// 올바른 값일 경우에만 프로그램을 실행시키는 것을 검증이라고 한다.
// 데이터 검증에는 여러가지 방법이 있는데
// 우리는 그 중에서 정확한 값의 범위를 사용하는 방법과
// 먼저 값이 올바른 범위에 속하는지부터 체크 후에 진행하는 방법
// 두 가지 방법을 해볼 것이다.
public class Ex10Validation {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");
        int score = sc.nextInt();
        
        System.out.println("=====값 검증 안한 버전=====");
        
        if(score >= 90) {
            System.out.println("A");
        } else if(score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }        
        
        System.out.println("=====정확한 값 범위=====");
        
        // 정확한 겂 범위를 사용하겠다는 것은
        // if문과 else if문의 조건식에
        // 해당 코드를 실행시킬 조건을 정확하게 적겠다라는 의미가 있다.
        // 이 방법은 올바른 값의 범위가 연속적이지 않고 띄엄띄엄 있을 때 사용하면 좋다.
        if(score >= 90 && score <= 100) {
            System.out.println("A");
        } else if(score >= 80 && score < 90) {
            System.out.println("B");
        } else if(score >= 70 && score < 80) {
            System.out.println("C");
        } else if(score >= 60 && score < 70) {
            System.out.println("D");
        } else if(score >= 0 && score < 60) {
            System.out.println("F");
        } else {
            System.out.println("잘못입력하셨습니다.");
        }
        
        System.out.println("=====입력한 범위 확인=====");
        
        // 입력값이 범위를 확인한다는 의미는
        // 먼저 사용자가 입력한 값이 올바른 값에 속하는지 확인하고
        // 올바른 값의 범위에 속할 때에만 코드를 진행시키겠다라는 의미가 된다.
        // 즉 중첩 if문을 사용하면 된다.
        // 이때는 올바른 값의 범위가 연속적일 경우에 쓰면 좋다.
        
        if(score >= 0 && score <= 100) {            
            // 올바른 값의 범위이므로
            // 출력을 담당하는 if - else 구현
            
            if(score >= 90) {
                System.out.println("A");
            } else if(score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            
        } else {
            // 올바르지 않은 값이므로 경고메시지만 출력
            System.out.println("잘못입력하셨습니다.");
        }
        
        sc.close();
        
    }
    
}



















