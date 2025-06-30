package ch02;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        // ⓐ 좋아하는 그룹 번호를 선택하세요.
        // ⓑ 1. ive 2. 세븐틴 3. 에스파
        // -> 2
        // ⓒ 당신은 세븐틴 광팬입니다. -> ⓔ
        // 만약, 없는 번호를 선택하면..
        // ⓓ 잘 못 선택했습니다.
        // ⓔ 종료하시겠습니까? (Y/N)



        Scanner sc = new Scanner(System.in);
        String yesOrNo = "N";
        // yesOrNo = N으로 정해놓고
        while (yesOrNo.equals("N")) {
            // 반복을 계속 해야하기 때문에 while 문을 써서
            // N을 쓰면 반복할 수 있게 만듦
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
            yesOrNo = sc.next();
            // yesOrNo = N일때 다시 while로 돌아가 반복되기 때문에
            // 사용자가 작성한 값이 N이면 돌아가서 반복되고
            // 사용자가 작성한 값이 N이 아니면 종료됨
        }
//        while (yesOrNo.equals("N")) {
//            continue;
//        }
//        while (yesOrNo.equals("Y")) {
//            System.out.println("종료되었습니다.");
//            break;
//        }
        // 이 식은 틀림 if를 사용하거나 while 무한반복을 사용
        // ------------------------------------------------
    }
}
