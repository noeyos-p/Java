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

        // ------------------------------------------------------------
        // 주사위 3개 값이 순서대로 들어옴
        // 중복은 허용
        // a == b && b == c
        // -> 참 : 3개의 값이 모두 같음
        // a == b || b == c || a == c
        // -> 참 : 2개의 값이 모두 같음

        // true의 수를 셈
        // a == b max =a; same = same + 1;
        // b == c max =b; same = same + 1;
        // a == c max =c; same = same + 1;
        // -> 3개의 값이 모두 같을 때 same = 3
        // -> 2개의 값이 모두 같을 때 same = 1
        // -> 모두 다를때 same = 0
        System.out.println("1");
        int aA = sc.nextInt();
        System.out.println("2");
        int bB = sc.nextInt();
        System.out.println("3");
        int cC = sc.nextInt();
        // 몇 개가 일치하는지 카운트 할 변수
        int sameCount = 0;
        // 상금에 사용할 주사위 눈 값
        int dice_number = 0;
        int max = Integer.MIN_VALUE;
        // 총 상금 넣을
        int s;
        // 순서대로 같은지 비교하면서 count
        if (aA == bB) {
            sameCount = sameCount + 1;
            dice_number = aA;
        }
        if (cC == bB) {
            sameCount = sameCount + 1;
            dice_number = bB;
        }
        if (aA == cC) {
            sameCount = sameCount + 1;
            dice_number = aA;
        }
        switch (sameCount) {
            case 3 :
                // 3개 다 일치
                s = 10000 + (dice_number) * 1000;
                break;
            case 2 :
                // 2개  일치
                s = 1000 + (dice_number) * 100;
                break;
            case 0 :
                // 0개 일치
                // 가장 큰 주사위를 찾아야 함
                if (aA > max) max = aA;
                if (bB > max) max = bB;
                if (cC > max) max = cC;
                s = max * 100;
                break;
        }
    }
}
