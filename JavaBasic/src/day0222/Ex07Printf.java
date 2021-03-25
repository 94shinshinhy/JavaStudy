package day0222;
// printf()를 사용하는 방법
// printf()는 우리가 형식을 지정해주고
// 해당 형식에 맞는 값을 직접 넘겨줘서
// printf()가 출력할 수 있게 한다.
public class Ex07Printf {
    public static void main(String[] args) {
        // 1. 10진법 정수 ('d'ecimal)
        int number = 2800;
        System.out.println("----------Decimal----------");
        // A. 10진법 정수를 그대로 출력해라
        System.out.printf("A. [%d]\n", number);
        // B. 10진법 정수를 오른쪽 정렬 5자리로 출력해라
        System.out.printf("B. [%5d]\n", number);
        // C. 10진법 정수를 오른쪽 정수 3자리로 출력해라
        System.out.printf("C. [%3d]\n", number);
        // 만약 풀력해야할 내용이 지정된 자릿수보다 많으면
        // 자릿수 지정은 무시된다.
        // D. 10진법 정수를 왼쪽 정렬 5자리로 출력해라
        System.out.printf("D. [%-5d]\n", number);
        // E. 10진법 정수를 오른쪽 정렬 5자리로 맞추고 왼쪽 공백은 0으로 채워라
        System.out.printf("E. [%05d]\n", number);
        
        // 2. 16진법 정수(he'x'adecimal)
        number = 1787;
        System.out.println("----------Hexadecimal----------");
        // A. 16진법 정수를 자릿수는 그대로, 알파벳은 소문자로 춮력해라
        System.out.printf("A. [%x]\n", number);
        // B. 16진법 정수를 자릿수는 그대로, 알파벳은 대문자로 출력해라
        System.out.printf("B. [%X]\n", number);
        // C. 16진법 정수를 5자리 오른쪽 정렬하고, 알파벳은 대문자로 출력해라
        System.out.printf("C. [%5X]\n", number);
        // D. 16진법 정수를 5자리 왼쪽 정렬하고, 알파벳은 소문자로 출력해라
        System.out.printf("D. [%-5x]\n", (number));
        // E. 16진법 정수를 5자리 오른쪽 정렬, 알파벳은 대문자로, 왼쪽 빈자리는 0으로 채워서 출력해라
        System.out.printf("E. [%05X]\n", number);
        
        // 3. 실수('f'loat)
        //    비록 우리가 'float'의 'f'를 따와서
        //    %f로 사용하지만 실제로는 double 값을 넣어도 된다.
        double d = 123.45;
        System.out.println("----------float----------");
        // A. 실수를 그대로 출력해라
        System.out.printf("A. [%f]\n", d);
        // B. 실수를 15자리 오른쪽 정렬로 출력해라
        System.out.printf("B. [%15f]\n", d);
        // C. 실수를 소숫점 1번째자리까지 출력해라
        System.out.printf("C. [%.1f]\n", d);
        // D. 실수를 15자리 오른쪽 정렬하고, 소숫점은 첫번째자리까지 출력해라
        System.out.printf("D. [%15.1f]\n", d);
        // E. 실수를 15자리 왼쪽 정렬하고, 소숫점은 세번째자리까지 출력해라
        System.out.printf("E. [%-15.3f]\n", d);
        // F. 실수를 15자리 오른쪽 정렬, 왼쪽 빈자리는 0으로, 소숫점은 세번째자리까지 출력해라
        System.out.printf("F. [%015.3f]\n", d);
        
        // 4. String('S'tring)
        String str1 = new String("abcDEF");
        System.out.println("----------String----------");
        // A. String을 그대로 출력해라
        System.out.printf("A. [%s]\n", str1);
        // B. String을 모두 대문자로 바꿔서 출력해라
        System.out.printf("B. [%S]\n", str1);
        
        // printf를 사용할 때 주의할 점
        // 1. %문자와 넘겨받는 값의 종류가 다르면 에러가 발생한다.
        //System.out.printf("1. %d", 3.4);
        // 2. 존재하지 않는 %문자를 사용하면 에러가 발생한다.
        //System.out.printf("2. %z", 3);
        // 3. %문자의 갯수보다 넘어오는 값의 갯수가 많으면 문제 없다.
        //System.out.printf("%d %d", 1, 2, 3, 4);
        // 4. 하지만 %문자의 갯수가 넘어오는 값이 갯수보다 많으면 문제가 발생한다.
        //System.out.printf("%d %d %d", 1);
    }
}



















