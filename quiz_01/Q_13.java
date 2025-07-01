package quiz_01;
//- 입력
//첫째 입력 값은 현재 시간,(0 ≤ A ≤ 23)
//두번째 입력 값은 현재 분, (0 ≤ B ≤ 59)
//세번째 입력값은 요리하는 데 필요한 시간
//C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
// - 출력
//첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다.
//        (단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다.
//디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)

import java.util.Scanner;

public class Q_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 시간(시)을 입력해주십시오.");
        int A = sc.nextInt();
        if ((0 <= A) && (A <= 23)) {
            System.out.println("현재 시간은 " + A + "시 입니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }


        System.out.println("현재 시간(분)을 입력해주십시오.");
        int B = sc.nextInt();
        if ((0 <= B) && (B <= 59)) {
            System.out.println("현재 시간은 " + A + "시" + B + "분 입니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

        System.out.println("요리에 걸리는 시간을 입력해주십시오.");
        int C = sc.nextInt();
        if ((0 <= C) && (C <= 1000)) {
            System.out.println("요리에 걸리는 시간은 " + C + "분 입니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

        if (B + C > 59){
            A = A + ((B + C) / 60);
            if (A > 23) {
                A = 24 - A;
            }
            B = (B + C) % 60;
            System.out.println("요리완료 시간 " + A + "시 " + B + "분");
        } else {
            B = B + C;
            System.out.println("요리완료 시간 " + A + "시 " + B + "분");
        }
    }
}
