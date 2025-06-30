package ch02;

import java.util.Scanner;

public class ThreeNumberTest {
    // 세 수를 차례로 입력 받아요.
    // 가장 큰 수와 가장 작은 수를 출력합니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 수를 입력하세요.");
        int first = sc.nextInt();
        System.out.println("두 번째 수를 입력하세요.");
        int second = sc.nextInt();
        System.out.println("세 번째 수를 입력하세요.");
        int third = sc.nextInt();

        System.out.println("입력하신 수들은 First : " + first + ", Second : " + second + ", Third : " + third);

        // 가장 큰수 : maxNum => 가장 작은 값 대입
        // 가장 작은 수 : minNum => 가장 큰값 대입

        // a, b, c
        // if (maxNum < a) {
        // maxNum = a
        // }

        // Integer, MAX_VALUE -> 상수 이거 찾아보기 class이쪽에 . 찍으면 보인다고 함
        // int min = Integer.MAX_VALUE

        int max = 0;
        int min = 0;

        if ((first > second) && (first > third)) {
            max = first;
        } else if ((first < second) && (first < third)) {
            min = first;
        } else {
        }
        if ((second > first) && (second > third)) {
            max = second;
        } else if ((second < first) && (second < third)) {
            min = second;
        } else {
        }
        if ((third > first) && (third > second)) {
            max = third;
        } else if ((third < first) && (third < second)) {
            min = third;
        }

        System.out.println("가장 큰 수 : " + max + ", 가장 작은 수 : " + min);

        System.out.println("----------------------------------------------------");
        // Scanner를 main 앞에 쓰려면 static을 사용하여 선언함
        // 위에 적은 스캐너를 공용으로 사용하기 위해서 main 위에 적음

        int a;
        int b;
        int c;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        System.out.println("세 수를 차례로 입력하세요.");
        // 처음 입력값을 a에 넣어준다.
        a = sc.nextInt();
        // 두번째 수를 b에 입력받는다.
        b = sc.nextInt();
        // 세번째 수를 b에 입력받는다.
        c = sc.nextInt();

        // a와 b를 비교해서 큰 수는 maxValue에
        // 작은 수는 minValue에 넣는다.
        if (a > b) {
            maxValue = a;
            minValue = b;
        } else {
            maxValue = b;
            minValue = a;
        }

        // c가 maxValue 보다 크면
        // c -> maxValue

        // c가 minValue 보다 작으면
        // c -> minValue
        if (c > maxValue) {
            maxValue = c;
        } else if (c < minValue) {
            minValue = c;
        } else {
        }
        System.out.println("Max : " + maxValue);
        System.out.println("Min : " + minValue);
        }
    }