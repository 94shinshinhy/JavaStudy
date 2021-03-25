package day0222;
// 학생의 번호, 이름, 국어, 영어, 수학, 총점, 평균을
// 각각 변수를 만들어서
// 값을 할당하고 출력하는 프로그램을 작성해보세요
public class Ex05GradeBook01 {
    public static void main(String[] args) {
        int num=1, k=80, e=90, m=100, total=k+e+m;
        String name = new String("이름");
        double avr = total / 3.0;
        System.out.printf("번호 : %d\n이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n총점 : %d\n평균 : %f", num, name, k, e, m, total, avr);
    }
}