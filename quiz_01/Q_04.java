package quiz_01;

import java.util.Scanner;

// 문제4. 임의의 값 n이 주어지면
// 예를들어 n=5이면
// 1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)
// 의 결과를 출력하세요.
public class Q_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("임의의 값 n을 입력하세요.");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        int j = n;
        while (true) {

            if (j == 0) {
                break;
            } else {
                for (i = 1; i <= j; i++) {
                    sum += i;

                }
            }

            j = j - 1;
        }
        System.out.println(sum);

//--------------------------------------------------------------------------

        sum = 0;

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= a; b++) {
                sum += b; // sum = sum + b;
            }
        }
        System.out.println(sum);
    }
}
