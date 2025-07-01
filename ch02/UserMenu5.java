package ch02;

import java.util.Scanner;

public class UserMenu5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("좋아하는 그룹 번호를 선택하세요.");
            System.out.println("1. ive 2. 세븐틴 3. 에스파");
            int num = sc.nextInt();

            switch (num) {
                case 1 :
                    System.out.println("당신은 아이브 광팬입니다.");
                    break;
                case 2 :
                    System.out.println("당신은 세븐틴 광팬입니다.");
                    break;
                case 3 :
                    System.out.println("당신은 에스파 광팬입니다.");
                    break;
                default:
                    System.out.println("잘못 선택했습니다.");
                    continue;
                    // 잘못 선택했을 때 다시 올라가야하는데
                    // 올라가지 않았음
                    // 따라서 continue를 통해 다시 올려보내줌
            }
            System.out.println("종료하시겠어요? (Y/N)");
            String yesOrNo = sc.next();
            // 입력한 값을 대문자로 바꾼다.
            yesOrNo = yesOrNo.toUpperCase();
            // 입력한 값을 대문자로 바꿔주는 "함수"를 쓴다.
            System.out.println(yesOrNo);
            if (yesOrNo.equals("Y")) {
                // 프로그램을 종료 시켜야 함.
                System.out.println("프로그램을 종료합니다.");
                return;
                // return은 main을 종료하는 것이기 때문에
                // 다른 static 같은 class가 있으면 그것이 실행됨
                // 따라서 지금은 main 밖에 없으므로
                // 프로그램을 종료시키기에 적절한 명령어임
            } else if (yesOrNo.equals("N")) {
                continue;
            } else {
                System.out.println("잘못 입력했어요.");
                continue;

                // 순서를 적으며 계획을 적고
                // 그 뒤 실행에 옮기세요
            }
        }
    }
}
