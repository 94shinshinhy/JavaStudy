package kr.co.bitcamp.array;

/*
 *  배열의 용도와 배열을 선언하는 방법에 대해서 설명하시오.
 */

/*
 *  [1] 배열이란? --> 역할과 용도, 필요성
 *  자동차 판매 회사에서 영업사원의 판매 실적을 저장한다고 할 때 배열이 없다면 변수를 사용해야 저장할 것이다.
 *  영업사원이 10명정도라면 괜찮지만, 100명이 넘는다면 변수를 일일이 선언하고 저장하는 것이 상당히 번거롭다.
 *  
 *   그러나 배열을 이용하면 일일이 변수를 선언할 필요없이 한번에 선언이 되고, 초기화 값도 한번에 설정해준다.
 *   즉, 배열은 동일한 데이터타입의 값들을 하나의 배열명으로 저장시킬 수 있는 편리한 자료구조이다.
 *   
 *   [2] 배열의 선언
 *   데이터타입[] 배열명 = new 데이터타입[배열크기];
 *   데이터타입 배열명[] = new 데이터타입[배열크기];
 *   
 *   [3] 배열의 선언 --> 배열 크기 지정 --> 배열 공간의 값은 자동으로 초기화 됨(정수형 : 0, 실수형 : 0.0) 
 */

public class ArrayBasic01 {

    public static void main(String[] args) {
        
        // 첫번째 방식
        int[] salesTable = new int[100];
        
        // 두번째 방식
        double[] salesTable2;
        salesTable2 = new double[100];
        
        // 선언한 배열 사용하기
        System.out.println(salesTable[0]);
        System.out.println(salesTable[99]);
        System.out.println(salesTable2[0]);
        System.out.println(salesTable2[99]);
        
    }
    
}



















