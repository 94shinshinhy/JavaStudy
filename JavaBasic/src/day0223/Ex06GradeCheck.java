package day0223;

// 사용자로부터 정수를 입력받아서
// 90점 이상 : A
// 80점대 : B
// 70점대 : C
// 60점대 : D
// 그외 : F
// 가 출력되는 프로그램을 작성하시오
import java.util.Scanner;
public class Ex06GradeCheck {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("점수를 입력하세요 : ");
        int score = scan.nextInt();
        
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
        
        scan.close();
        
    }
}
