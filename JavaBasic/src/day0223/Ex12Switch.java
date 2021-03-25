package day0223;
// 조건문 04 = switch
// switch 조건문은 if 조건문과는 다르게
// 우리가 변수 하나를 선택을 해서 해당 변수의 값들에 대한
// 코드 구현을 하게 된다.
public class Ex12Switch {
    
    public static void main(String[] args) {
        
        int number = 2;
        
        // switch는 우리가 아는 정수형, char 혹은 String형의 인수만 넣어줄 수 있다.
        // 즉, double나 float와 같은 실수형 데이터타입은 switch의 제어변수로 넣어 줄 수 없다.
        
        // switch문에서
        // case에 해당 제어변수의 가능한 값들을 읽어주고
        // 그리고 해당값에서 실행할 코드들을 적어준다.
        // 만약 만족하는 case가 없을 시에는 해당 케이스부터
        // break가 나올때까지의 모든 코드를 실행하게된다.
        
        switch(number) {
        case 1:
            System.out.println("1입니다.");
            break;
        case 2:
            System.out.println("2입니다.");
            break;
        case 3:
            System.out.println("3입니다.");
            break;
        default: System.out.println("그 외입니다.");
            break;
                
        }
        
        
    }
    
}
