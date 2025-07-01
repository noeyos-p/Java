package quiz_01;
//ⓐ 같은 눈이 3개가 나오면
//    -- 상금 : 10,000원 + (같은 눈) × 1,000원
//ⓑ 같은 눈이 2개만 나오는 경우에는
//    -- 상금 : 1,000원 + (같은 눈) × 100원
//ⓒ 모두 다른 눈이 나오는 경우에는
//    -- 상금 : (그 중 가장 큰 눈) × 100원
//- 예제입력
//3 3 6
//2 2 2
//6 2 5
//- 예제출력
//1300
//12000
//600

import java.util.Scanner;

public class Q_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 주사위 숫자를 입력해주세요.");
        int a = sc.nextInt();
        if ((1 <= a) && (a <= 6)) {
            System.out.println("첫번째 주사위 숫자는 " + a + "입니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

        System.out.println("두번째 주사위 숫자를 입력해주세요.");
        int b = sc.nextInt();
        if ((1 <= b) && (b <= 6)) {
            System.out.println("두번째 주사위 숫자는 " + b + "입니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

        System.out.println("세번째 주사위 숫자를 입력해주세요.");
        int c = sc.nextInt();
            if ((1 <= c) && (c <= 6)) {
                System.out.println("세번째 주사위 숫자는 " + c + "입니다.");
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }

        if ((a == b) && (b == c) ) {
            System.out.println(10000 + a * 1000 + "원");
        } else if ((a == b) || (b == c) || (a == c)) {
            if (a == b) {
                System.out.println(1000 + a * 100 + "원");
            } else if (b == c) {
                System.out.println(1000 + b * 100 + "원");
            } else if (a == c) {
                System.out.println(1000 + c * 100 + "원");
            } else {
            }
        } else {
            if ((a > b) && (a > c)) {
                System.out.println(a * 100 + "원");
            } else if ((b > c) && (b > a)) {
                System.out.println(b * 100 + "원");
            } else if ((c > a) && (c > b)) {
                System.out.println(c * 100 + "원");
            } else {
            }

        }
    }
}
