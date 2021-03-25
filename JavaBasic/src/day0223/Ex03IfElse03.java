package day0223;

import java.util.Scanner;

// 상수로 관리자의 id와 비밀번호를 만들고
// 사용자로부터는 따로 id와 비밀번호를 입력받아서
// 만약 관리자의 id와 비밀번호와 일치하면
// "괸리자 로그인 성공!"
// 그 외에는 "로그인 실패"가 출력되는 프로그램을 작성하시오
public class Ex03IfElse03 {
    static final String ID = new String("admin");
    static final String PW = new String("1234");
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("아이디를 입력하세요 : ");
        String user_id = scan.nextLine();
        System.out.print("비밀번호를 입력하세요 : ");
        String user_pw = scan.nextLine();
        
        if (user_id.equals(ID) && user_pw.equals(PW)) {
            System.out.println("로그인 성공!");
        } else {
            System.out.println("로그인 실패");
        }
        
        scan.close();
        
    }
}
