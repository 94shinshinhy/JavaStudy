package day0223;
// 사용자로부터 키와 몸무게를 입력 받아서
// BMI 수치와 체형을 출력해주는 프로그램
// 단 사용자가 잘못된 키 혹은 몸무게를 입력하면
// 올바른 키나 몸무게를 입력할 때 까지 다시 입력하도록 코드를 작성하시오

import java.util.Scanner;

// BMI 공식 : 몸무게 / 키 / 키
// 단, 키는 m 단위이고, 몸무게는 kg단위이다.

// BMI 수치에 따른 체형
// ~18.5미만 : 저체중
// ~23미만 : 정상
// ~25미만 : 과체중
// ~30미만 : 비만
// 30이상 : 고도비만

//단, 기네스북에 따르면 세상에서 가장 키가 컸던 사람의 키는 2.83m였습니다.
//단, 기네스북에 따르면 세상에서 가장 무거웠던 사람의 무게는 635kg였습니다.
public class Ex17BmiCheck3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("키를 입력하세요(m) : ");
        double height = sc.nextDouble();
        
        while(height <= 0 || height > 2.82) {
            System.out.println("잘못입력하셨습니다.");
            System.out.println("키를 입력하세요(m) : ");
            height = sc.nextDouble();
        }
        
        System.out.print("몸무게를 입력하세요(kg) : ");
        double weight = sc.nextDouble();
        
        while(weight <= 0 || weight > 635) {
            System.out.println("잘못입력하셨습니다.");
            System.out.println("몸무게를 입력하세요(kg) : ");
            weight = sc.nextDouble();
        }
        
        double bmi = weight / height / height;
        
        System.out.printf("bmi : %.2f\n", bmi);
        
        if(bmi < 18.5) {
            System.out.println("저체중입니다.");
        } else if (bmi < 23) {
            System.out.println("정상입니다.");
        } else if (bmi < 25) {
            System.out.println("과체중입니다.");
        } else if (bmi < 30) {
            System.out.println("비만입니다.");
        } else {
            System.out.println("고도비만입니다.");
        }
        
        sc.close();

    }

}



















