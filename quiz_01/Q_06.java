package quiz_01;
// 문제6. 두 정수 A와 B를 차례로 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 입력(intA, intB) (A > 0, B < 10)

import java.util.Scanner;

// 예제 입력
// 첫 번째 값을 입력하세요 :
// 7
// 두 번째 값을 입력하세요 :
// 9
// 출력
// 첫째 줄에 A+B를 출력한다.
// 7 + 9 = 16
public class Q_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 1;
        int B = 9;
        while (true) {
            System.out.println("첫 번째 값을 입력하세요 : ");
            A = sc.nextInt();
            if (A <= 0) {
                System.out.println("다시 입력하세요.");
                continue;
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("두 번째 값을 입력하세요 : ");
            B = sc.nextInt();
            if (B >= 10) {
                System.out.println("다시 입력하세요.");
                continue;
            } else {
                break;
            }
        }
        System.out.println(A + " + " + B + " = " + (A + B));
    }
}



