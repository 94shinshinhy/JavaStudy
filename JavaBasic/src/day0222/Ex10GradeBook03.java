package day0222;
// 사용자로부터
// 번호, 이름, 국어, 영어, 수학 점수 순으로 입력 받아서
// 다음과 같은 양식대로 출력되게 프로그램을 작성하세요

import java.util.Scanner;

// 번호 : 003번 이름 : 김땡땡
// 국어 : 080점 영어 : 079점 수학 : 080점
// 총점 : 239점 평균 079.67점
public class Ex10GradeBook03 {
    // static이란 해당 코드를
    // java의 메소드 영역에 등록하라는 의미이다.
    // static이 붙어있는 메소드가 다른 메소드 혹은 상수를 호출할 때에는
    // 그 다른 메소드나 상수에도 반듯 static이 붙어있어야만한다.
    static final int SUBJECT_SIZE = 3;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("번호 : ");
        int id = scan.nextInt();
        
        System.out.print("이름 : ");
        scan.nextLine();
        String name = scan.nextLine();
        
        System.out.print("국어 : ");
        int kor = scan.nextInt();
        
        System.out.print("영어 : ");
        int eng = scan.nextInt();
        
        System.out.print("수학 : ");
        int mat = scan.nextInt();
        
        int tot = kor + eng + mat;
        double avr = tot / (double)SUBJECT_SIZE;
        
        System.out.printf("번호 : %03d번 이름 : %s\n", id, name);
        System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점\n", kor, eng, mat);
        System.out.printf("총점 : %03d점 평균 : %06.2f점\n", tot, avr);
        
        scan.close();
    }
}