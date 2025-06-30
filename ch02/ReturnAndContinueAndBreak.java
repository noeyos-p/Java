package ch02;

public class ReturnAndContinueAndBreak {
    // 1부터 20까지의 합을 출력하는 프로그램을 만드세요.
    public static void main(String[] args) {
        int number = 0;
        for (int i = 0; i <= 20; i++) {
            number = i + number;
        }
        System.out.println(number);
        // ---------------------------------
        // 누적한 값을 저장하는 변수 선언
        int sum = 0;
        for (int j = 1; j <= 20; j++) {
            sum = sum + j;
        }
        System.out.println(sum);

        // i 가 누적되어 150이 넘는 i 의 누적 값
        // 문제 1. 합계가 150을 넘는 최초의 i 값
        sum = 0;
        int goal = 0;
        for (int j = 1; j <= 17; j++) {
            sum = sum + j;
            if (sum > 30) {
                goal = j + 1;
                break;
            }
        }
        System.out.println("j = " + goal);

        // 문제 2. 1부터 10까지 더하는데 5를 제외하고 싶어요.
        sum = 0;
        for (int k = 1; k <= 10; k++) {
            if (k == 5) continue;
            sum = sum + k;
        }

        // 문제 3. 1부터 10까지 루프 중 i == 5 이면
        // 프로그램 종료하기
        sum = 0;
        for (int k = 1; k <= 10; k++) {
            if (k == 5) return;
            sum = sum + k;
        }
    }
}