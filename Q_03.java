package quiz_02;

import java.util.Arrays;
import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 숫자를 차례로 입력하세요.");
        String numbers = sc.next();
        String[] fNumbers = numbers.split("");
        int[] fiveNumber = new int[fNumbers.length];
        for (int i = 0; i < numbers.length(); i++) {
            fiveNumber[i] = Integer.parseInt(fNumbers[i]);
            System.out.println(fiveNumber[i]);
        }
        for (int i = 0; i < fiveNumber.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < fiveNumber.length; j++) {
                if (fiveNumber[min] > fiveNumber[j]) {
                    min = j;
                }
            }
            int temp = fiveNumber[min];
            fiveNumber[min] = fiveNumber[i];
            fiveNumber[i] = temp;
        }
        System.out.println("정렬 후");
        System.out.println(Arrays.toString(fiveNumber));
    }
}
