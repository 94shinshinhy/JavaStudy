package kr.co.bitcamp.method;

/*
 *  반환값이 있고 받는 인자값이 있는 대문자 출력하는 메서드를 구현해보시오.
 *  메서드는 ("welcome to bitcamp") 입력시 대문자로 출력되도록 구현한다.
 *  
 *  입력한 소문자의 대문자 : WELCOME TO BITCAMP
 */

public class Method04 {

    public static void main(String[] args) {

        String str;
        str = capitalMethod("welcome to bitcamp");
        System.out.println(capitalMethod(str));

    }
    
    // capitalMethod()
    public static String capitalMethod(String str) {
        String res = str.toUpperCase();
        return res;
    }

}
