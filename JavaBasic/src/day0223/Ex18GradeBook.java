package day0223;
// 사용자로부터 번호, 이름, 국어, 영어, 수학 점수를 차례대로 입력받아
// 형식에 맞추어 출력하는 프로그램

import java.util.Scanner;

// 단 번호는 1~10 사이이다.
// 국어, 영어, 수학, 점수 모두 0~100 사이이다.
// 만약 사용자가 잘못된 번호 혹은 점수를 입력하면
// 올바른 값이 입력될 때 까지 다시 입력을 받도록
// 프로그램을 작성하시오

public class Ex18GradeBook {
    static final int ID_MIN = 1;
    static final int ID_MAX = 10;
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;
    static final int SUBJECT_SIZE = 3;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("번호를 입력하세요 : ");
        int id = sc.nextInt();
        
        while(!(id >= ID_MIN && id <= ID_MAX)) {
            System.out.println("잘못입력하셨습니다.");
            System.out.print("번호를 입력하세요 : ");
            id = sc.nextInt();
        }
        
        System.out.print("이름을 입력하세요 : ");
        sc.nextLine();
        String name = sc.nextLine();
        
        System.out.print("국어점수를 입력하세요 : ");
        int kor = sc.nextInt();
        
        while(!(kor >= SCORE_MIN && kor <= SCORE_MAX)) {
            System.out.println("잘못입력하셨습니다.");
            System.out.print("국어점수를 입력하세요 : ");
            kor = sc.nextInt();
        }
        
        System.out.print("영어점수를 입력하세요 : ");
        int eng = sc.nextInt();
        
        while(!(eng >= SCORE_MIN && eng <= SCORE_MAX)) {
            System.out.println("잘못입력하셨습니다.");
            System.out.print("영어점수를 입력하세요 : ");
            eng = sc.nextInt();
        }
        
        System.out.print("수학점수를 입력하세요 : ");
        int mat = sc.nextInt();
        
        while(!(mat >= SCORE_MIN && mat <= SCORE_MAX)) {
            System.out.println("잘못입력하셨습니다.");
            System.out.print("수학점수를 입력하세요 : ");
            mat = sc.nextInt();
        }
        
        int tot = kor + eng + mat;
        double avr = tot / (double)SUBJECT_SIZE;
        
        System.out.printf("번호 : %03d번 이름 : %s\n", id, name);
        System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점\n", kor, eng, mat);
        System.out.printf("총점 : %03d점 평균 : %06.2f점\n", tot, avr);
        
        sc.close();

    }

}
