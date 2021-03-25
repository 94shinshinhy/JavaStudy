package day0222;
// 번호, 이름, 국어, 수학, 총점, 평균을 각각 변수로 만들고
// 값을 할당해서 다음고 ㅏ같은 양식대로 출력되게 프로그램을 작성하시오

// 번호 : 003번 이름 : 김땡땡
// 국어 : 080점 영어 : 079점 수학 : 080점
// 총점 : 239점 평균 : 080.67점
public class Ex08GradeBook02 {
    public static void main(String[] args) {
        int id = 3;
        int kor = 80;
        int eng = 79;
        int mat = 80;
        int tot = kor + eng + mat;
        String name = new String("김땡땡");
        double avr = tot / 3.0;
        System.out.printf("번호 : %03d번 이름 : %s\n", id, name);
        System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점\n", kor, eng, mat);
        System.out.printf("총점 : %03d점 평균 : %06.2f점\n", tot, avr);
    }
}