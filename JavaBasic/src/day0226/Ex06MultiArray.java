package day0226;

// 다차원 배열
// 우리가 지금까지 만들었던 배열들은
// 1차원 배열이다

// 배열은 똑같은 데이터타입이 어러개 모여있는 데이터타입이다.
// 그렇다면 여러개의 똑같은 배열을 모아서 다른 커다란 배열을 만들 수 있지 않을까?

// 2차원 배열을 선언하는 방법
// 데이터타입[][] 배열이름 = new 데이터타입[크기][];

// 3차원 배열을 선언하는 방법
// 데이터타입[][][] 배열이름 = new 데이터타입[크기][][];

// 즉 []의 갯수가 몇 차원인지를 설명하게 되는 것이다.

public class Ex06MultiArray {

    public static void main(String[] args) {
        
        // int의 2차원 배열을 선언해보자        
        int[][] int2DArr = new int[3][];
        
        // int2DArr의 내용을 출력해보자
        System.out.println(int2DArr[0]);
        System.out.println(int2DArr[1]);
        System.out.println(int2DArr[2]);
        
        // 우리가 int2DArr의 경우, 각각의 엘리먼트는 1차원 int 배열이어야한다.
        // 따라서 우리가 new int[크기]로 각각의 엘리먼트를 초기화해보자
        int2DArr[0] = new int[3];
        int2DArr[1] = new int[3];
        int2DArr[2] = new int[3];
        
        System.out.println(int2DArr[0]);
        System.out.println(int2DArr[1]);
        System.out.println(int2DArr[2]);
        
        // 만약 int2DArr의 0번째 배열에 0번 엘리먼트에 값을 초기화하려면?
        int2DArr[0][0] = 3;
        
        // 2차원 배열 예제
        // int 2차원 배열을 만들어서
        // 구구단 값을 넣어보자
        int[][] gugudan = new int[9][9];
        
        for(int i = 0; i < gugudan.length; i++) {
            for(int j = 0; j < gugudan[i].length; j++) {
                gugudan[i][j] = (i+1) * (j+1);
            }
        }
        
        for(int i = 0; i < gugudan.length; i++) {
            for(int j = 0; j < gugudan.length; j++)
            System.out.printf("%2d x %2d = %2d\n", i+1, j+1, gugudan[i][j]);
        }
        
    }

}



















