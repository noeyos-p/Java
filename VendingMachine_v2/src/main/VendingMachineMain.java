package main;

import view.AdminView;
import view.UserView;
import vo.VendingMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachineMain {
    public static List<VendingMachine> vendingMachineList = new ArrayList<>();
    public static void main(String[] args) {
        UserView userView = new UserView();
        AdminView adminView = new AdminView();

        VendingMachineMenu();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("자판기");
            System.out.println("1. 동전 투입  2. 잔돈 반환  3. 메뉴 선택  4. 관리자 메뉴  5. 종료 =>");
            System.out.println("번호를 선택하세요.");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("돈을 넣어주세요.");
                    int money = sc.nextInt();
                    System.out.println("투입금액 : " + money + "원");
                    userView.userScreen();
                    break;
                case 2:
                    break;
                case 3:
                    userView.viewMenu();
                    break;
                case 4:
                    System.out.println("관리자 비밀번호 입력 : ");
                    String password = sc.next();
                    if (password.equals("1004")) {
                        adminView.adminScreen();
                    }
                    adminView.adminScreen();
                    break;
                case 5:
                    return;
            }
        }
    }

    private static void VendingMachineMenu() {
        VendingMachine coke = new VendingMachine();
        coke.setProduct("코카콜라");
        coke.setPrice(1000);
        vendingMachineList.add(coke);

        VendingMachine cider = new VendingMachine();
        cider.setProduct("사이다");
        cider.setPrice(1000);
        vendingMachineList.add(cider);

        VendingMachine orange = new VendingMachine();
        orange.setProduct("오렌지 주스");
        orange.setPrice(1500);
        vendingMachineList.add(orange);
    }
}
