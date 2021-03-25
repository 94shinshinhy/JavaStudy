package day0226;
// 2차원 배열을 이용해서
// 국어 점수 배열, 영어 점수 배열, 수학 점수 배열을 한개의 2차원 배열로 관리해보자
// 단, while을 사용해서
// 1은 입력만, 2는 출력만, 3은 종료
// 출력시에는 현재까지 입력된 학생들만 출력되도록
// 프로그램을 작성해보시오

import java.util.Scanner;
public class Ex07GradeBook {
    static final int SC_MIN = 0;
    static final int SC_MAX = 100;
    
    static final int ID_MIN = 1;
    static final int ID_MAX = 10;
    
    static final int STU_SIZE = 5;
    static final int SUB_SIZE = 3;
    
    static final int POS_KOR = 0;
    static final int POS_ENG = 1;
    static final int POS_MAT = 2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 번호용 배열
        int[] idArr = new int[STU_SIZE];
        
        // 이름용 배열
        String[] nameArr = new String[STU_SIZE];
        
        // 점수용 배열
        int[][] scoreArr = new int[STU_SIZE][SUB_SIZE];
        
        // 각 배열에 입력할 위치
        int idx = 0;
        
        while (true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            int userCho = scan.nextInt();
            
            if(userCho == 1) {
                
                if(idx < STU_SIZE) {
                    
                    int tempInput = 0;
                    
                    System.out.print("번호 : ");
                    tempInput = scan.nextInt();
                    
                    while(!(tempInput >= ID_MIN && tempInput <= ID_MAX)) {
                        
                        System.out.println("잘못입력하셨습니다");
                        System.out.print("번호 : ");
                        tempInput = scan.nextInt();
                        
                    }
                    
                    idArr[idx] = tempInput;                    
                    
                    System.out.print("이름 : ");
                    scan.nextLine();
                    nameArr[idx] = scan.nextLine();
                    
                    System.out.print("국어 : ");
                    tempInput = scan.nextInt();
                    
                    while(!(tempInput >= SC_MIN && tempInput <= SC_MAX)) {
                        
                        System.out.println("잘못입력하셨습니다");
                        System.out.print("국어 : ");
                        tempInput = scan.nextInt();
                    }
                    
                    scoreArr[idx][POS_KOR] = tempInput;
                        
                    System.out.print("영어 : ");
                    tempInput = scan.nextInt();
                    
                    while(!(tempInput >= SC_MIN && tempInput <= SC_MAX)) {
                        
                        System.out.println("잘못입력하셨습니다");
                        System.out.print("영어 : ");
                        tempInput = scan.nextInt();
                    }
                    
                    scoreArr[idx][POS_ENG] = tempInput;                    
                    
                    System.out.print("수학 : ");
                    tempInput = scan.nextInt();
                    
                    while(!(tempInput >= SC_MIN && tempInput <= SC_MAX)) {
                        
                        System.out.println("잘못입력하셨습니다");
                        System.out.print("수학 : ");
                        tempInput = scan.nextInt();
                    }
                    
                    scoreArr[idx][POS_MAT] = tempInput;
                    
                    idx++;
                    
                } else {
                    
                    System.out.println("더이상 입력하실 수 없습니다.");
                    
                }
                
            } else if(userCho == 2) {                
                
                if(idx == 0) {
                    System.out.println("아직 입력된 정보가 없습니다.");
                } else {
                    System.out.println();
                    System.out.println("--------------------");
                    
                    for(int i = 0; i < idx; i++) {
                        int id = idArr[i];
                        String name = nameArr[i];
                        int kor = scoreArr[i][POS_KOR];
                        int eng = scoreArr[i][POS_ENG];
                        int mat = scoreArr[i][POS_MAT];
                        int sum = kor + eng + mat;
                        double avr = (double)sum / SUB_SIZE;
                        
                        System.out.println("-----"+(i+1)+"번 학생의 정보-----");
                        System.out.printf("번호 : %03d번 이름 : %s\n", id, name);
                        System.out.printf("국어 : %3d점 영어 : %3d점 수학 : %3d점\n", kor, eng, mat);
                        System.out.printf("총점 : %3d점 평균 : %06.2f점\n", sum, avr);
                    }
                    
                    System.out.println("--------------------");
                    System.out.println();
                }
                
            } else if(userCho == 3) {
                System.out.println("종료");
                break;
            }
        }
        
        scan.close();

    }

}
