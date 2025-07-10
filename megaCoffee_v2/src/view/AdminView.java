package view;

import service.AdminService;

import java.util.Scanner;

public class AdminView {
    // AdminService 사용하기
    private AdminService adminService = new AdminService();
    private Scanner sc = new Scanner(System.in);
    public void adminScreen() {
        while (true) {
            System.out.println("======================");
            System.out.println("관리자 화면");
            System.out.println("1. 메뉴 가격 수정하기    2. 메뉴 추가하기     3. 정산하기    0. 돌아가기");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    adminService.menuUpdate();
                    break;
                case 2:
                    adminService.menuInsert();
                    break;
                case 3:
                    adminService.adminResult();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("잘못 입력했어요.");
            }
        }
    }
}
