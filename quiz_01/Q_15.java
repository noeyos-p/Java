package quiz_01;

import java.util.Scanner;

public class Q_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("======================");
        System.out.println("메뉴를 선택하세요");
        System.out.println("======================");
        System.out.println("1. 인사하기 2. 춤추기 3. 밥먹기  4. 종료하기");
        int num = sc.nextInt();
            if (num == 1) {
                System.out.println("안녕하세요");
                continue;
            } else if (num == 2) {
                System.out.println("삐끼삐끼 춤입니다.");
                continue;
            } else if (num == 3) {
                System.out.println("맛나게 먹었습니다.");
                continue;
            } else if (num == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }

        }
    }
}
