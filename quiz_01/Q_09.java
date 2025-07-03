package quiz_01;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("별을 출력할 줄 수를 입력해주세요.");
        int line = sc.nextInt();
        int j = 1;
        String star = "";
        for (int i = line; i > 0; i--) {
            star = star + "*";
            System.out.println(star.repeat(i));
        }
            // ----------------------------------------------------
            // for (int j = line; j >= 1; j--) {
                for (int k = 1; k <= j; k++) {
                    star = star + "*";
                }
                System.out.println(line);
                star = "";
        }
    }

