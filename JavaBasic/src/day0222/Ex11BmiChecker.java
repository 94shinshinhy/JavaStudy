package day0222;
// 사용자로부터 키와 몸무게를 입력받아서
// BMI 결과 값을 출력해주세요

import java.util.Scanner;

// BMI 공식은
// 몸무게 / 키 / 키인데
// 카는 m단위로 입력하도록 적어줍시다.
public class Ex11BmiChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("키를 입력하세요(m)");
        double height = scan.nextDouble();
        
        System.out.print("몸무게를 입력하세요(kg)");
        double weight = scan.nextDouble();
        
        // bmi 계산
        double bmi = (weight / height / height);
        
        System.out.printf("사용자의 키 : %.2fm\n사용자의 몸무게 : %.2fkg\n", height, weight);        
        System.out.printf("Bmi 결과 값은 : %.5f",  bmi);
        
        scan.close();
    }
}
