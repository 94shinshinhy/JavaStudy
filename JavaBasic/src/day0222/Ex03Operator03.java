package day0222;
// 연산자 03
// 비교연산자
// 비교연산자는
// 2개의 값을 비교하는데
// "왼쪽의 값이 오른쪽의 값보다 큽니까?" -> 예/아니오
// 즉, 위의 질문과 같이 예/아니로로 대답 가능한 질문을
// 컴퓨터에게 던지고, 컴퓨터는 "예"일 경우면 true를,
// "아니오"일 경우엔 false가 결과 값으로 나오게 된다.

// < <= > >= == !=
public class Ex03Operator03 {
    public static void main(String[] args) {
        int number = 5;
        // 1. <
        //    왼쪽의 값이 오른쪽 값보다 작습니까?
        System.out.println("---------- 1, < ----------");
        System.out.println("number < 10 : " + (number < 10));
        System.out.println("number < 0 : " + (number < 0));
        System.out.println("number < 5 : " + (number < 5));
        
        // 2. <=
        //    왼쪽의 값이 오른쪽 값보다 작거나 같습니까?
        System.out.println("---------- 2, < =----------");
        System.out.println("number <= 10 : " + (number <= 10));
        System.out.println("number <= 0 : " + (number <= 0));
        System.out.println("number <= 5 : " + (number <= 5));
        
        // 3. >
        //    왼쪽의 값이 오른쪽 값보다 큽니까?
        System.out.println("---------- 3, > ----------");
        System.out.println("number > 10 : " + (number > 10));
        System.out.println("number > 0 : " + (number > 0));
        System.out.println("number > 5 : " + (number > 5));
        
        // 4. >=
        //    왼쪽의 값이 오른쪽 값보다 큽니까?
        System.out.println("---------- 4, >= ----------");
        System.out.println("number >= 10 : " + (number >= 10));
        System.out.println("number >= 0 : " + (number >= 0));
        System.out.println("number >= 5 : " + (number >= 5));
        
        // 5. ==
        //    왼쪽의 값이 오른쪽 값과 같습니까?
        System.out.println("---------- 5, == ----------");
        System.out.println("number == 5 : " + (number ==5));
        System.out.println("number == 6 : " + (number ==6));
        
        // 6. !=
        //    왼쪽의 값이 오른쪽 값과 다릅니까?
        System.out.println("---------- 6, != ----------");
        System.out.println("number != 5 : " + (number !=5));
        System.out.println("number != 6 : " + (number !=6));
        
        // 비교연산자를 사용할 때 유의해야할 점
        // 1. 비교대상이 왼쪽에 있건 오른쪽에 있건 상관은 없지만
        //    값과 비교할 때는 왼쪽에 쓰는게 정상적인 방법이다.
        System.out.println("--------------------");
        System.out.println("----- 1 -----");
        System.out.println("number < 10 : " + (number < 10));
        System.out.println("10 > number : " + (10 > number));
        
        // 2. 범위를 비교할 때에는 우리가
        //    값 <= 변수 <= 값 이런식으로 쓸 수 없다.
        // System.out.println(0 < number < 10);
        // 위 코드에서 0 < number < 10은 에러가 발생한다.
        // 프로그래밍은 항상 왼쪽에서 오른쪽으로 실행이 되는데
        // 0 < number < 10은
        // 먼저 0 < number을 실행하고
        // 그리고 결과 값 < 10을 실행하겠다라는 의미가 된다.
        // 근데 0 < number는 결과 값이 true 혹은 false 값을 가지는
        // boolean타입이다.
        // 그렇다면 boolean 타입의 값을 10과 비교할 수 있을까
        // 예시 : "true는 10보다 작습니까?" or "false는 10보다 작습니까?"
        
        // 3. 참조형 변수에 대해서는 우리가 비교연산자를 통하여 비교를 할 시에는
        //    정확하지 않은 결과를 받을 수 있게 된다.
        
        // 비교를 위해 String변수 3개를 만들어보자
        
        System.out.println("--------------------");
        String str1 = new String("abc");
        String str2 = "abc";
        String str3 = str2;
        
        // 만든 3개의 String 변수를 출력해보자
        System.out.println("str1의 현재 값 : ["+str1+"]");
        System.out.println("str2의 현재 값 : ["+str2+"]");
        System.out.println("str3의 현재 값 : ["+str3+"]");
        
        // 비교연산자를 사용하여 str1, str2, sr3를 비교해보자
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1 == str3 : " + (str1 == str3));
        System.out.println("str2 == str3 : " + (str2 == str3));
        
        // 비교연산자를 사용하여 참조형 변수들을 비교할 경우에는
        // 우리가 원하는 실제 값 비교가 아닌 그 변수에 저장된 주소 값 비교가 실행된다.
        // 즉 str1, str2, str3의 경우 str1과 str2, str3의 주소 값이 다르기 때문에
        // 비교를 하게 되면 str2와 str3를 비교할 경우를 제외하고선 모두
        // false가 나오게 된다.
        
        // 하지만 우리가 참조형 변수의 값을 비교하겠다라는 것은
        // 힙 영역에 저장된 실제 값을 비교하겠다라는거지
        // 주소 값 비교를 하고 싶다라는 의미가 아니다.
        // 따라서 참조형 변수에 비교연산자를 사용하면 주소 값 비교가 실행돼서
        // 부정확한 값이 나오게 된다.
        
        // 참조형 변수 중 클래스형 변수, 즉 객체를 비교할 때에는
        // 해당 객체의 equals()라는 메소드를 사용하여 비교해야한다!!!
        
        // equals() 메소드 사용법
        // 객체.equals(비교대상)
        
        System.out.println("str1.equals(str2) : " + (str1.equals(str2)));
        System.out.println("str1.equals(str3) : " + (str1.equals(str3)));
        System.out.println("str1.equals(str3) : " + (str1.equals(str3)));
    }
}



















