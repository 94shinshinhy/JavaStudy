package day0225;

import java.util.Scanner;

// 5명의 번호, 이름, 국어점수, 영어점수, 수학점수를
// 각각 배열에 입력해서 차례대로 출력하는 프로그램을 작성해보세요

// 잘못된 값은 올바른 값이 입력될 때까지 다시 입력 받아야합니다!

public class Ex03GradeBook {
    
    static final int ID_MIN = 1;
    static final int ID_MAX = 10;
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;
    static final int SUBJECT_SIZE = 3;
    static final int STUDENT_SIZE = 2;
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] numArray = new int[STUDENT_SIZE];
        String[] nameArray = new String[STUDENT_SIZE];
        int [] korArray = new int[STUDENT_SIZE];
        int [] engArray = new int[STUDENT_SIZE];
        int [] matArray = new int[STUDENT_SIZE];
        
        for(int i = 0; i < STUDENT_SIZE; i++) {
            
            // 번호
            System.out.print("번호 : ");
            numArray[i] = sc.nextInt();
                        
            while (!(numArray[i] >= ID_MIN && numArray[i] <= ID_MAX)) {
                System.out.println("잘못입력하셨습니다.");
                System.out.print("번호 : ");
                numArray[i] = sc.nextInt();
            }
            
            // 이름
            System.out.print("이름 : ");
            sc.nextLine();
            nameArray[i] = sc.nextLine();
            
            // 국어
            System.out.print("국어 : ");
            korArray[i] = sc.nextInt();
            
            while (!(korArray[i] >= SCORE_MIN && korArray[i] <= SCORE_MAX)) {
                System.out.println("잘못입력하셨습니다.");
                System.out.print("국어 : ");
                korArray[i] = sc.nextInt();
            }
            System.out.print("영어 : ");
            engArray[i] = sc.nextInt();
            
            // 영어
            while (!(engArray[i] >= SCORE_MIN && engArray[i] <= SCORE_MAX)) {
                System.out.println("잘못입력하셨습니다.");
                System.out.print("영어 : ");
                engArray[i] = sc.nextInt();
            }
            
            // 수학
            System.out.print("수학 : ");
            matArray[i] = sc.nextInt();
            
            while (!(matArray[i] >= SCORE_MIN && matArray[i] <= SCORE_MAX)) {
                System.out.println("잘못입력하셨습니다.");
                System.out.print("수학 : ");
                matArray[i] = sc.nextInt();
            }
            
            System.out.println("---------------------------------------------");
            
        }
        
        for(int i = 0; i < STUDENT_SIZE; i++) {
            System.out.println("----------------" + (i+1) + "번째 학생의 정보-----------------");
            System.out.printf("번호 : %03d번 이름 : %s\n", numArray[i], nameArray[i]);
            System.out.printf("국어 : %03d 영어 : %03d 수학 : %03d\n",
                    korArray[i], engArray[i], matArray[i]);
            int sum = korArray[i] + engArray[i] + matArray[i];
            double avr = sum / (double)SUBJECT_SIZE;
            System.out.printf("총점 : %03d 평균 : %06.2f\n", sum, avr);
            
            System.out.println("---------------------------------------------");
        }
        
        sc.close();        

    }

}
