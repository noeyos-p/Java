package quiz_01;
//문제 12. 알람시계문제
//- 입력
//처음에 입력 받는 값은 시간 : H
//두번째 입력 받는 값은 분 : M
//두 값의 범위는 다음과 같다. : 0 ≤ H ≤ 23, 0 ≤ M ≤ 59
//그리고 이것은 현재 상근이가 설정한 알람 시간 H시 M분을 의미한다.
//입력 시간은 24시간 표현을 사용한다.
//24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다.
//시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
//- 출력
//첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다.
//(입력과 같은 형태로 출력하면 된다.)

import java.util.Scanner;

public class Q_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시간(시)을 입력해주십시오.");
        int H = sc.nextInt();
        if ((0 <= H) && (H <= 23)) {
            System.out.println("설정한 시간은 " + H + "시 입니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }


        System.out.println("시간(분)을 입력해주십시오.");
        int M = sc.nextInt();
        if ((0 <= M) && (M <= 59)) {
            System.out.println("설정한 시간은 " + H + "시" + M + "분 입니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

        if ((M - 45) < 0) {
            H = H - 1;
            M = 60 - (45 - M);
            if (H > 23) {
                H = H - 24;
            } else if (0 > H) {
                H = 24 + H;
            }
            if (M > 59)
                M = 60 - M;
            System.out.println(H + "시 " + M + "분");
        } else {
            System.out.println(H + "시 " + (M - 45) + "분");
        }
    }
}


