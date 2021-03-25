package day0222;
// 연산자 03
// 논리연산자
// 논리연산자는 boolean 값에 대한 연산을 하는데
// 1. AND 연산자
//    두개의 boolean 값이 모두 true일 때에만
//    결과값이 true가 된다.
//    &&(shift+7)

// 2. OR 연산자
      // 두개의 boolean 값 중 하나라도 true이면
      // 결과 값은 true가 된다.
//    ||(shift+\)

// 3. NOt연산자
//    boolean 갑을 반전시켜준다.
//    true는 false, false는 true로 바꿔준다.

public class Ex04Operator04 {
    public static void main(String[] args) {
        // 1. && 연산자
        System.out.println("--------------------");
        System.out.println("true && true : " + (true && true));
        System.out.println("true && false : " + (true && false));
        System.out.println("false && true : " + (false && true));
        System.out.println("false && false : " + (false && false));
        
        // 2. || 연산자
        System.out.println("--------------------");
        System.out.println("true || true : " + (true || true));
        System.out.println("true || false : " + (true || false));
        System.out.println("false || true : " + (false || true));
        System.out.println("false || false : " + (false || false));
        
        // 3. ! 연산자
        //    비록 값을 바꾸지만 실제 값을 바꾸는 게 아니라
        //    해당 연산자를 만나는 순간에만 그 결과 값이 바껴있는 상태가 되는 것이다.
        System.out.println("--------------------");
        boolean b = true;
        System.out.println("!b : " + !b);
        System.out.println("b : " + b);
        
        // 논리연산자는 우리가 실제 true/false 값 혹은 boolean 변수를 만들어서 쓰기보다는
        // true/false의 결과 값을 가지는 연산자 혹은 메소드의 결과에 대한 연산을 할 때
        // 주로 쓰인다.
        // 예시 : int number의 값이 0보다 크고 10보다 작습니까?
        // 수학으로 표현하면?
        // 0 < number < 10
        // 프로그래밍적으로 표현하면
        // number는 0보다 크다 + number는 10보다 작다
        // 이게 모두 true가 나와야 함
        
        // 즉 AND 연산자를 사용하여
        // number > 0 && number < 10
        // 2개가 모두 true가 나오는지 체크해야한다.
        
        System.out.println("--------------------");
        int number = 5;
        System.out.println("number의 현재 값 : " + number);
        System.out.println("number > 0 && number < 10 : " + ( number > 0 && number < 10));
        
        number = -3;
        System.out.println("number의 현재 값 : " + number);
        System.out.println("number > 0 && number < 10 : " + ( number > 0 && number < 10));
        
        number = 20;
        System.out.println("number의 현재 값 : " + number);
        System.out.println("number > 0 && number < 10 : " + ( number > 0 && number < 10));
    }
}




















