package ch02;

import java.util.Scanner;

public class UserMenu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("좋아하는 그룹 번호를 선택하세요.");
            System.out.println("1. ive / 2. 세븐틴 / 3. 에스파");
            String num = sc.next();
            switch (num) {
                case "1":
                    System.out.println("당신은 ive 광팬입니다.");
                    break;
                case "2":
                    System.out.println("당신은 세븐틴 광팬입니다.");
                    break;
                case "3":
                    System.out.println("당신은 에스파 광팬입니다.");
                    break;
                default:
                    System.out.println("잘 못 입력했습니다.");
            }
            System.out.println("종료하시겠습니까? (Y/N)");
            String yesOrNo;
            yesOrNo = sc.next();
            if (yesOrNo.equals("Y")) {
                System.out.println("종료되었습니다.");
                break;
            }
        }
    }
}
