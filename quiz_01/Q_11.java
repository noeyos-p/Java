package quiz_01;
//문제 11. 조건문 문제 : 시험성적문제
//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B,
//70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는
//프로그램을 작성하시오.
//- 화면에서 점수를 입력받는다.
//점수는 score 변수로 받는다.
//시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//- 출력
//시험 성적을 출력한다.
//- 예제 입력
//100
//- 예제 출력
//A

import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시험 점수를 입력해주십시오.");
        int score = sc.nextInt();

        if ((score <= 100) && (score >= 90)) {
            System.out.println("A");
        } else if ((score <= 89) && (score >= 80)) {
            System.out.println("B");
        } else if ((score <= 79) && (score >= 70)) {
            System.out.println("C");
        } else if ((score <= 69) && (score >= 60)) {
            System.out.println("D");
        } else if ((0 > score) || (score > 100)) {
            System.out.println("잘못 입력하셨습니다.");
        } else {
            System.out.println("F");
        }
    }
}
