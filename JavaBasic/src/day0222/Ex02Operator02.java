package day0222;
// 연산자 02
// 할당 연산자

// 할당 연산자는 오른쪽에 있는 값을
// 왼쪽 공간에 넣는다.

// =, +=, +-, *=, /=, %=, ++, --
public class Ex02Operator02 {
    public static void main(String[] args) {
        
        int number;
        
        // 1. =
        //    오른쪽의 값을 왼족 공간에 할당해라
        number = 5;
        System.out.println("1. number의 현재 값 : "+number);
        
        // 2. +=
        //    왼쪽 공간에 현재 값에 오른족 값을 더한
        //    결과 값을 다시 인족 공간에 할당해라
        number += 7;
        // 위의 number += 7dml ruddn
        // number의 현재 값인 5에 7을 더한 결과 값인 12를
        // 다시 number에 할당하란 의미가 있다.
        System.out.println("2. number의 현재 값 : "+number);
        
        // 3. -=
        //    왼쪽 공간의 현재 값에 오른쪽 값을 뺀
        //    결과 값을 다시 왼쪽 공간에 할당해라
        number -= 3;
        System.out.println("3. number의 현재 값 : "+number);
        
        // 4. *=
        //    왼족 공간의 현재 값에 오른쪽 값을 곱한
        //    결과 값을 다시 왼쪽 공간에 할당해라
        number *= 7;
        System.out.println("4. number의 현재 값 : "+number);
        
        // 5. /=
        //    왼쪽 공간의 현재 값에 오른쪽 값을 나눈
        //    몫을 다시 왼쪽 공간에 할당해라
        number /= 8;
        System.out.println("5. number의 현재 값 : "+number);
        
        // 6. %=
        //    왼쪽 공간의 현재 값에 오른쪽 값을 나눈
        //    나머지를 다시 왼쪽 공간에 할당해라
        number %= 5;
        System.out.println("6. number의 현재 값 : "+number);
        
        // ++, --의 경우
        // 해당 공간의 값을 정확히 1씩 변화시킨다.
        // ++의 경우 해당 공간의 값을 1 증가시키고
        // --의 경우 해당 공간의 값을 1 감소시킨다.
        // 그래서 우리가 ++, --를 증감연산자라고도 부르는데
        // 이 증감연산자의 경우 변수의 앞에 붙냐 뒤에 붙냐에 따라서
        // 실행 순서가 바뀌게 된다.
        System.out.println("------------------------------");
        System.out.println("1. number의 현재 값 : "+number);
        
        // ++, --가 변수의 앞에 붙는 경우
        // 우리가 전위 증감연산자라고 부르며
        // 실행 순서는 가장 높아진다(=가장 먼저 실행이 된다.)
        System.out.println("++number : "+ ++number);
        // 위의 코드는 다음과 같은 순서를 가진다.
        // 1. ++number가 실행돼서 number의 현재 값이 2에서 3으로 증가한다.
        // 2. "++number : " + number가 실행돼서
        //    "++number : " 뒤에 number의 현재 값인 3이 이어져서
        //    "++number : 3"이 만들어진다.
        // 3. System.out.println("++number : 3")이 실행돼서
        //    화면에 "++number : 3"이 출력된다.
        
        // ++, --가 변수의 뒤에 붙는 경우
        // 우리가 후위 증감연산자라고 부르며
        // 실행순서는 가장 낮아진다(=가장 나중에 실행이 된다.)
        System.out.println("number++ : " + number++);
        // 위의 코드는 다음과 같은 순서를 가진다.
        // 1. "number++ : " + number가 실행돼서
        //    "number++ : " 뒤에 number의 현재 값인 3이 이어져서
        //    "number++ : 3"이 만들어진다.
        // 2. System.out.println("number++ : 3")이 실행돼서
        //    화면에 "number++ : 3"이 출력된다.
        // 3. number++이 실행돼서 number의 현재 값이 3에서 4로 증가된다.
        
        System.out.println("number의 현재 값 : "+ number);
    }
}



















