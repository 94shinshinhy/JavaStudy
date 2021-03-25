package day0224;

// 1부터 100까지의 소수를 구하는 프로그램

// 1. 소수란?
//    약수가 1과 자기 자신인 숫자
//    = 약수의 갯수가 2개인 숫자

// 2. 약수란?
//    A를 B로 나누어서 나눠떨어지면 B는 A의 약수이다.
//    = A를 B로 나누어서 나머지가 0과 같으면
//      B는 A의 약수이다.

// 3. 어떤 숫자의 가장 큰 약수는?
//    자기 자신

// 이 프로그램에서
// i는 소수인지 아닌지를 검사할 숫자가 된다.
// j는 i의 약수인지 아닌지를 검사할 숫자가 된다.

public class Ex07PrimeNumber {

    public static void main(String[] args) {
        
        // i는 소수인지 아닌지를 검사할 숫자가 된다.
        // 그렇다면
        // i의 start는? 1
        // i의 end는? 100
        
        int iStart = 1;
        int iEnd = 100;
        
        for(int i = iStart; i <= iEnd; i++) {
            
            // i의 약수의 갯수를 지정할 int 변수 count를 만든다.
            // count는 i가 증가할때마다 처음부터 다시 세야하므로
            // for문 안에 선언과 초기화를 해주어야한다.
            int count = 0;
            
            // j는 i의 약수인지 아닌지를 검사할 숫자가 된다.
            // 그렇다면
            // jStart? 1
            // jEnd? i
            
            int jStart = 1;
            int jEnd = i;
            
            for(int j = jStart; j <= jEnd; j++) {
                
                // j가 i의 약수인지 확인한다.
                // = i 나누기 j가 나눠 떨어지는지 확인한다.
                // = i 나누기 j의 나머지가 0과 같은지 확인한다.
                
                // 만약 약수라면
                // count를 1 증가시킨다.
                if(i % j == 0) {
                    count++;
                    
                }
                
            }
            
            // count가 2면
            // 약수가 2개이다 라는 의미이므로
            // i는 소수이다가 성립
            // 그러면 i+"는 소수입니다"를 출력
            if(count == 2) {
                System.out.println(i + "는 소수입니다.");
            }
            
        }

    }

}



















