package day0223;

import java.util.Scanner;

// 사용자로부터 키와 몸무게를 입력 받아서
// BMI 수치를 출력하고
// 해당 수치에 관련 메시지를 출력하는 프로그램을 작성하시오

// BMI 공식 : 몸무게 / 키 / 키
//           단, 키는 m 단위이고, 몸무게는 kg단위이다.

// BMI 수치에 따른 체형
// ~18.5미만 : 저체중
// ~23미만 : 정상
// ~25미만 : 과체중
// ~30미만 : 비만
// 30이상 : 고도비만
public class Ex07BmiCheck {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("키(m) : ");
        double height = scan.nextDouble();
        
        System.out.print("몸무게(kg) : ");
        double weight = scan.nextDouble();
        
        double bmi = weight / height / height;
        
        System.out.printf("bmi : %.2f", bmi);
        
        if(bmi < 18.5) {
            
            System.out.println("저체중");
            
        } else if (bmi < 23) {
            
            System.out.println("정상");
            
        } else if (bmi < 25) {
            
            System.out.println("과체중");
            
        } else if (bmi < 30) {
            
            System.out.println("비만");
            
        } else if (bmi >= 30) {
            
            System.out.println("고도비만");
            
        } else {
            
            System.out.println("프로그램 종료");
            
        }
        
        scan.close();        
        
    }
    
}
