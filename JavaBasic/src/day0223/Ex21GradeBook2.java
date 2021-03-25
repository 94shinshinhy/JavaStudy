package day0223;
// 사용자로부터 학생의 정보를 입력받고
// 출력하는 프로그램

// 단 학생의 정보(번호, 이름, 국어, 영어, 수학)은
// 사용자가 메뉴에서 입력을 선택해야 입력이 가능하다.

// 입력 시 잘못된 정보(1~10을 벗어나는 번호나 0~100을 벗어나는 점수)를
// 일력할 시에는 올바른 정보가 입력될 때 까지 다시 입력을 받아야한다.

// 학생 정보의 출력은
// 사용자가 메뉴에서 출력을 선택해야 출력이 가능하다.

// 고려해볼것 : 
// 변수의 선언위치

import java.util.Scanner;

public class Ex21GradeBook2 {
    static final int ID_MIN = 1, ID_MAX = 10;
    static final int SCORE_MIN = 0, SCORE_MAX = 100;
    static final int SUBJECT_SIZE = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int id = 0;
        String name = new String();
        int kor = 0;
        int eng = 0;
        int mat = 0;
        boolean inputSwitch = false;
        
        while(true) {
            System.out.println("--------------------");
            System.out.println(" 비트고등학교 성적관리 프로그램");
            System.out.println("--------------------");
            System.out.println(" 1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            
            int userChoice = sc.nextInt();
            
            if (userChoice == 1) {
                // 성적을 입력하는 코드를 여기 구현
                
                // 사용자가 입력을 한번이라도 했다는 의미이므로
                // inputSwitch 값을 true로 바꿔준다.
                inputSwitch = true;
                
                // 번호 입력
                System.out.print("번호를 입력하세요 : ");
                id = sc.nextInt();
                
                while (!(id >= ID_MIN && id <= ID_MAX)) {
                    System.out.println("잘못입력하셨습니다.");
                    System.out.print("번호를 다시 입력하세요 : ");
                    id = sc.nextInt();
                }
                
                // 이름 입력
                System.out.print("이름을 입력하세요 : ");
                sc.nextLine();
                name = sc.nextLine();
                
                // 국어 점수 입력                
                System.out.print("국어점수를 입력하세요 : ");
                kor = sc.nextInt();
                
                while (!(kor >= SCORE_MIN && kor <= SCORE_MAX)) {
                    System.out.println("잘못입력하셨습니다.");
                    System.out.print("국어점수를 다시 입력하세요 : ");
                    kor = sc.nextInt();
                }
                
                // 영어 점수 입력
                System.out.print("영어점수를 입력하세요 : ");
                eng = sc.nextInt();
                
                while (!(eng >= SCORE_MIN && eng <= SCORE_MAX)) {
                    System.out.println("잘못입력하셨습니다.");
                    System.out.print("영어점수를 다시 입력하세요 : ");
                    eng = sc.nextInt();
                }
                
                // 수학 점수 입력                
                System.out.print("수학점수를 입력하세요 : ");
                mat = sc.nextInt();
                
                while (!(mat >= SCORE_MIN && mat <= SCORE_MAX)) {
                    System.out.println("잘못입력하셨습니다.");
                    System.out.print("수학점수를 다시 입력하세요 : ");
                    mat = sc.nextInt();
                }
                                
            } else if (userChoice == 2) {
                // 성적을 출력하는 코드를 여기 구현
                
                // inputSwitch의 값이 false인 경우 : 아직 사용자가 입력을 한번도 안함
                // inputSwitch의 값이 true인 경우 : 사용자가 한번이라도 입력을 함
                
                int tot = kor + eng + mat;
                double avr = tot / (double)SUBJECT_SIZE;
                                
                if(inputSwitch) {
                    System.out.printf("번호 : %03d번 이름 : %s\n", id, name);
                    System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점\n", kor, eng, mat);
                    System.out.printf("총점 : %03d점 평균 : %06.2f점\n", tot, avr);
                } else {                    
                    System.out.println("아직 입력된 내용이 없습니다.");                    
                }
            } else if (userChoice == 3) {
                // 메시지 출력 후 break를 사용하여 무한 루프 종료
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
        
        sc.close();

    }

}
