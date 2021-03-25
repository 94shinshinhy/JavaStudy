package kr.co.bitcamp.array;

/*
 *  배열과 인덱스
 *  배열 변수는 참조형 타입으로써 해당 메모리 공간을 가리키고 있다. --> 즉, 해당 메모리 공간의 주소값을 가진다. --> 이 주소값을 통해서 참조한다.
 *  공간이 100개가 만들어지면 동시에 자동적으로 해당 공간에 접근할 수 있는 인덱스 번호가 자동 부여된다. --> 인덱스 번호는 0부터 시작.
 *  마지막 인덱스는 "배열의 크기 -1"이 된다.
 *  
 *  인덱스를 사용 --> 배열명[인덱스번호]
 */

public class ArrayBasic02 {

    public static void main(String[] args) {
        
        // 배열의 선언 및 크기 지정
        int[] scores = new int[10];
        int size = scores.length;
        System.out.println(size);
        
        System.out.println(scores[0]);
        System.out.println(scores[size-1]);

    }

}



















