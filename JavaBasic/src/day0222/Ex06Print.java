package day0222;
// 콘솔화면에 출력을 하는 3가지 방법
// 자바에서 콘솔화면에 출력을 할 때에는
// System.out.에 있는 3가지 메소드를 사용하게 된다.

// 1. print()
//    print()는 ()안의 내용을 그대로 출력하고
//    그 다음에 출력할 내용이 있으면 출력된 내용의 오른쪽 칸부터 출력을 시작한다.

// 2. println()
//    print a line의 줄임말로써 ()안의 내용을 그대로 출력하고
//    그 다음에 출력할 내용이 있으면 출력된 내용의 다음 줄 첫번째 칸부터 출력을 시작한다.

// 3. printf()
//    print in format의 줄임말로써 ()안의 내용을 "형식에" 맞추어 출력하고
//    그 다음에 출력할 내용이 있으면 출력된 내용의 오른쪽 칸부터 출력을 시작한다.

// escape character
// 공백 문자
// 공백 문자는 \와 조합된 문자로써
// 비록 적기는 2글자지만 실제 취급은 한글자가 된다.
// 다음을 문자, 탭 공백문자, "문자등을 사용할 때
// \와 합쳐서 사용하게 된다.
// \n : 다음 줄 문자, 이후의 출력 내용을 다음 줄로 옮긴다.
// \t : 탭 공백문자, 탭 공백을 넣는다.
// \" : 스트링 값을 시작하거나 끝낼 때 쓰는 "가 아니라 문자로써의 "을 의미하게 됨.
public class Ex06Print {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("DEF");
        
        // print()의 경우
        System.out.print(str1);
        System.out.print(str2);
        
        // println()의 경우
        System.out.println(str1);
        System.out.println(str2);
        
        // printf()의 경우
        System.out.printf(str1);
        System.out.printf(str2);
        System.out.println();
        // 공백문자를 알아보자
        // 1. 다음줄문자
        System.out.print(str1+"\n");
        System.out.print(str2+"\n");
        // 2. 탭공백문자
        System.out.println(str1+"\t"+str2);
        // 3. \"
        System.out.println("\"");
    }
}



















