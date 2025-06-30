package ch02;

import java.util.Scanner;

public class BigNumberPrint {
    public static void main(String[] args) {
        // 두 수를 차례로 입력받습니다.
        // 1. 그 중 큰 수를 출력해 주세요.
        // First : 20, Second : 40
        // 큰 수 : 40

        // 2. 입력받은 두 수를 바꾸어서 출력합니다.
        // First : 20, Second : 40
        // 두 수를 바꾼 결과는 ?
        // First : 40, Second : 20
        Scanner sc = new Scanner(System.in);
        System.out.println("First : ");
        int first = sc.nextInt();
        System.out.println("Second : ");
        int second = sc.nextInt();

        if (first < second) {
            System.out.println("큰 수 : " + second);
        } else {
            System.out.println("큰 수 : " + first);
        }

        int change;
        change = first;
        first = second;
        second = change;

        System.out.println("두 수를 바꾼 결과는?");
        System.out.println("First : " + first + ", Second : " + second);

        // ------------------------------------------------------------

        System.out.println("첫 번째 수를 입력하세요.");
        int num1 = sc.nextInt();
        System.out.println("두 번째 수를 입력하세요.");
        int num2 = sc.nextInt();
        System.out.println("입력하신 두 수는 : ");
        System.out.println("First : " + num1 + ", Second : " + num2);

        if (num1 > num2) {
            System.out.println("큰 수 : " + num1);
        } else {
            System.out.println("큰 수 : " + num2);
        }
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("두 수를 바꾼 결과는?");
        System.out.println("First : " + num1 + ", Second : " + num2);

        System.out.println("성적을 입력하세요");
        int score = sc.nextInt();
        String grade = "";
        // 성적 처리
        if (score >= 90) {
            grade = "수";
        } else if (score >= 80) {
            grade = "우";
        } else if (score >= 70) {
            grade = "미";
        } else if (score >= 60) {
            grade = "양";
        } else {
            grade = "가";
        }
        System.out.println("당신의 성적은 : " + grade);

    }
}
