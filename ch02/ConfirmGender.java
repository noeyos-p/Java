package ch02;

import java.util.Scanner;

public class ConfirmGender {
    // 주민번호 뒷자리 첫 숫자를 입력하세요.
    // 1 또는 3 : 남자
    // 2 또는 4 : 여자
    // 5 이면 : 외국인
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("주민번호 뒷자리 첫 숫자를 입력하세요.");
        int number = sc.nextInt();

        if (number == 1 || number == 3) {
            System.out.println("남자");
        } else if (number == 2 || number == 4) {
            System.out.println("여자");
        } else if (number == 5) {
            System.out.println("외국인");
        } else {
            System.out.println("확인할 수 없습니다.");
        }
        System.out.println("---------------------------------------");

        // 주민번호 뒷자리 첫 숫자를 입력받습니다.
        System.out.println("주민번호 뒷자리 첫 숫자를 입력하세요.");
        int num = sc.nextInt();
        String result;
        // 비교를 해야...
        if (num == 1 || num == 3) {
            result = "남";
        } else if (num == 2 || num == 4) {
            result = "여";
        } else if (num == 5) {
            result = "외국인";
        } else {
            result = "잘못 입력했습니다.";
        }
        System.out.println(result);
        System.out.println("-----------------------------------------");
    }
}
