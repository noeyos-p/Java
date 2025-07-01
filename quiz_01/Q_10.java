package quiz_01;
// 문제 10. 입력받은 구구단 출력하기
//화면에서 입력받은 수의 구구단 출력.
// 입력
// 구하고자 하는 구구단의 수를 입력받는다.
// N(2 ≤ N ≤ 9)이 주어진다.
// 출력
// 해당 구구단을 출력한다.

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 구구단의 수를 입력해주세요.");
        int N = sc.nextInt();
        if ((2 <= N) && (N <= 9)) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(N + " x " + i + " = " + N * i);
            }
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
