package quiz_01;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("별을 출력할 줄 수를 입력해주세요.");
        int star = sc.nextInt();
        int j = 1;
        String k = "*";
        for (int i = star; i > 0; i--) {
            System.out.println(k.repeat(i));
        }
    }
}
