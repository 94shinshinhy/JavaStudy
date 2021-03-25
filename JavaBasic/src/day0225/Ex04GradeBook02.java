package day0225;
// 메뉴를 사용해서
// 입력을 누르면 비어있는 학새으이 정보 칸에 정보를 입력하고
// 출력하면 입력한 학생들만 출력이 되는 프로그램

import java.util.Scanner;

public class Ex04GradeBook02 {
    
    static final int ID_MIN = 1;
    static final int ID_MAX = 10;
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;
    static final int SUBJECT_SIZE = 3;
    static final int STUDENT_SIZE = 5;
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] numArr = new int[STUDENT_SIZE];
        String[] nameArr = new String[STUDENT_SIZE];
        int [] korArr = new int[STUDENT_SIZE];
        int [] engArr = new int[STUDENT_SIZE];
        int [] matArr = new int[STUDENT_SIZE];
        // 현재 정보를 저장할 index를 가진 int 변수 idx
        int idx = 0;
        
        while(true) {
            
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            int userCho = sc.nextInt();
            
            if(userCho == 1) {
                
                if(idx < STUDENT_SIZE) {
                    
                    // 아직 우리가 입력할 칸이 남아있다 라는 의미이므로
                    // idx번 칸에 입력을 시작한다.
                    System.out.println("=====" + (idx+1) + "번째 학생 정보 입력=====");
                    
                    // idx번째 학생의 번호 입력하기
                    System.out.print("번호 : ");
                    numArr[idx] = sc.nextInt();
                    
                    while(!(numArr[idx] >= ID_MIN && numArr[idx] <= ID_MAX)) {
                        System.out.println("잘못입력하셨습니다.");
                        System.out.print("번호 : ");
                        numArr[idx] = sc.nextInt();
                        
                    }
                    
                    // idx번째 학생의 이름 입력하기
                    System.out.print("이름 : ");
                    sc.nextLine();
                    nameArr[idx] = sc.nextLine();
                    
                    // idx 번째 학생의 국어 점수 입력하기
                    System.out.print("국어 : ");
                    korArr[idx] = sc.nextInt();
                    
                    while(!(korArr[idx] >= SCORE_MIN && korArr[idx] <= SCORE_MAX)) {
                        
                        System.out.println("잘못입력하셨습니다.");
                        System.out.print("국어 : ");
                        korArr[idx] = sc.nextInt();
                        
                    }
                    
                    // idx번째 학생의 영어 점수 입력하기
                    System.out.print("영어 : ");
                    engArr[idx] = sc.nextInt();
                    
                    while(!(engArr[idx] >= SCORE_MIN && engArr[idx] <= SCORE_MAX)) {
                        
                        System.out.println("잘못입력하셨습니다.");
                        System.out.print("영어 : ");
                        engArr[idx] = sc.nextInt();
                        
                    }
                    
                    // idx번째 학생의 수학 점수 입력하기
                    System.out.print("수학 : ");
                    matArr[idx] = sc.nextInt();
                    
                    while(!(matArr[idx] >= SCORE_MIN && matArr[idx] <= SCORE_MAX)) {
                        
                        System.out.println("잘못입력하셨습니다.");
                        System.out.print("수학 : ");
                        matArr[idx] = sc.nextInt();
                        
                    }
                    
                    idx++;
                    
                    System.out.println("=======================================");
                    
                } else {
                    // 이미 STUDENT_SIZE만큼의 학생을 다 입력했으므로
                    // 더이상 입력할 수 없다 라는 경고메시지만 출력해준다.
                    
                    System.out.println();
                    System.out.println("더이상 입력하실 수 없습니다.");
                    System.out.println();
                    
                }
                
            } else if (userCho == 2) {
                
                if(idx == 0) {
                    
                    // 아직 한명도 입력되지 않았음
                    System.out.println();
                    System.out.println("아직 입력된 정보가 없습니다.");
                    System.out.println();
                    
                } else {
                    
                    // 적어도 한명이상이 입력됨
                    for(int i = 0; i < idx; i++) {
                        System.out.println("----------------" + (i+1) + "번째 학생의 정보-----------------");
                        System.out.printf("번호 : %03d번 이름 : %s\n", numArr[i], nameArr[i]);
                        System.out.printf("국어 : %03d 영어 : %03d 수학 : %03d\n",
                                korArr[i], engArr[i], matArr[i]);
                        int sum = korArr[i] + engArr[i] + matArr[i];
                        double avr = sum / (double)SUBJECT_SIZE;
                        System.out.printf("총점 : %03d 평균 : %06.2f\n", sum, avr);
                        
                        System.out.println("---------------------------------------------");
                    }
                    
                }
                                
            } else if (userCho == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
            
        }
        
        sc.close();
        
    }
    
}



















