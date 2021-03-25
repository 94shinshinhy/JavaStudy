package day0225;

// 배열

// 배열이란 하나의 데이터타입 종류로 보지만
// 실제 정체는 똑같은 데이터타입을 여러 개 모아서 하나의 데이터타입처럼 취급하는 것이다.

// 우리가 예를 들어서
// 반에 있는 학생들을 관리할 때
// 학생 하나하나 이름을 직접 불러서 관리할 수도 있지만
// 그냥 1번학생, 2번학생, 이렇게 번호로 관리하는 방법도있다.

// 우리가 학생 하나하나마다 변수로 만들어준다면 "이름으로 관리"가 되는 것이다.
// 하지만 배열을 만들어서 관리를 해준다면 "번호로 관리"가 되는 것이다.

// 배열의 선언방법
// 데이터타입[] 배열이름 = new 데이터타입[크기]

// 단, 배열의 경우 우리가 반드시 "몇개의" 변수를 모아두었는지를
// 배열의 초기화식에 반드시 넣어주어야한다!

public class Ex01Array01 {

    public static void main(String[] args) {
        
        // int[] intArray를 선언하고
        // 크기가 4로 초기화해보자
        
        // 우리가 int 변수를 4개를 만든 것이 아니라
        // 이 int[] intArray가 총 4개의 int 변수를 관리한다는 의미가 된다.
        // 그리고 우리가 배열 안의 변수는 변수라고 부르지 않고
        // "요소" 혹은 "element"라고 부른다.
        int[] intArray = new int[4];
        
        for (int i = 0; i < 4; i++) {
            System.out.printf("intArray[%d]의 현재 값 : %d\n", i, intArray[i]);
        }
        
        // 배열의 각 엘리먼트를 접근할 때에는
        // 우리가 위치번호(=인덱스)로 접근한다.
        // 인덱스는 0부터 시작해서
        // 배열의 크기 - 1까지가 인덱스의 범위가 된다.
        
        // 배열의 각 엘리먼트에 값 초기화하기
        // 배열이름[인덱스 값] = 값;
        intArray[0] = 10;
        intArray[1] = 17;
        intArray[2] = 24;
        intArray[3] = 31;
        
        // 인덱스 값 위치에는 우리가 변수를 넣어줄 수도 있다.
        // intArray에 지정된 엘리먼트의 값들을 쭉 출력할 때에는
        // 우리가 0, 1, 2, 3을 차례로 넣어서 출력해주면 된다.
        // 즉 for문을 이용하면 쉽게 출력을 해줄 수 있다.
        
        for (int i = 0; i < 4; i++) {
            System.out.printf("intArray[%d]의 현재 값 : %d\n", i, intArray[i]);
        }
        
        // 배열에 관한 팁 + 주의점
        
        // 1. 배열의 경우 우리가 초기화 할 때
        //    반드시 크기를 지정해주어야한다.
        // intArray = new int[];
        // 위의 코드는 초기화식에 크기가 지정되지 않았기 때문에 에러가 발생한다.
        
        // 2. 기본형 데이터타입의 배열은 각 엘리먼트가 0으로 초기화된다.
        //    참조형 데이터타입의 배열은 각 엘리먼트가 null로 초기화된다.
        
        // null이란?
        // 참조형 데이터타입에서만 발견되는 특수한 "상태"로써
        // 스택 메모리 영역에 주소값이 저장이 되었지만
        // 힙 영역에 해당 주소가 아직 준비가 안된 상태를 null이라고 한다.
        // null일 경우, 해당 참조형 변수의 메소드 혹은 실제 값을 접근하려고 하면
        // NullPointerException이라는 에러가 발생한다.
        
        // 참조형 데이터타입의 배열을 직접 만들어보자
        String[] stringArray = new String[5];
        
        // stringArray의 모든 엘리먼트를 출력해보자
        // 우리가 각 엘리먼트에 대한 초기화는 따로 안했으므로
        // null로 초기화가 되어있는 것을 알 수 있다.
        for(int i = 0; i < 5; i++) {
            System.out.println(stringArray[i]);
        }
        
        // 만약 null인 상태를 가진 무언가 안에 있는
        // 메소드를 실행할려고 한다면...?
        // System.out.println(stringArray[0].equals("abc"));
        // 위 코드에서는 null 상태인 stringArray[0] 엘리먼트의
        // equals() 메소드를 실행하려고 했기 때문에
        // NullPointerException이 발생하게 된다.
        
        // 3. 배열의 크기를 정할 때에는
        //    우리가 int형 변수를 넣어서
        //    크기를 정해줄 수도 있다.
        int size = 3;
        intArray = new int[size];
        
        // 4. 해당 배열의 크기를 알고 싶을 때에는
        //    해당 배열의 length 값을 요구하면 된다.
        System.out.println("intArray의 현재 크기 : " + intArray.length);
        
        // 5. 만약 잘못된 인덱스를 접근하게되면
        //    ArrayIndexOutOFBoundsException이 발생하게 된다.
        //    잘못된 인덱스는 주로 배열의 크기 "이상"의 값을 가진 인덱스나
        //    음의 값을 가진 인덱스를 말하게 된다.
        
        // 5-1. index가 -1 일 경우
        // System.out.println(intArray[-1]);
        
        // 5-2. index가 크기 - 1 이상일 경우
        //System.out.println(intArray[3]);
        
    }

}



















