package ch02;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        // 구구단 중 2단을 출력
//        System.out.println("2 * 1 = " + (2 * 1));
//        System.out.println("2 * 2 = " + (2 * 2));
//        System.out.println("2 * 3 = " + (2 * 3));
//        System.out.println("2 * 4 = " + (2 * 4));
//        System.out.println("2 * 5 = " + (2 * 5));
//        System.out.println("2 * 6 = " + (2 * 6));
//        System.out.println("2 * 7 = " + (2 * 7));
//        System.out.println("2 * 8 = " + (2 * 8));
//        System.out.println("2 * 9 = " + (2 * 9));

        // 출력할 구구단을 입력을 받아서
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 단 수를 입력하세요.");
        int dan = sc.nextInt();
        for (int j = 1; j <= 9; j++)
            System.out.println(dan + " * " + j + " =  " + (dan * j));

        // for ~ Loop로 구현
        int num = 0;
        for (int i = 1; i <= 9; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));

        }
    }
}
