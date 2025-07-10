package view;

import main.VendingMachineMain;
import vo.VendingMachine;

import java.util.Scanner;

public class UserView {
    private Scanner sc = new Scanner(System.in);
    public void userScreen() {
    }

    public void viewMenu() {
        System.out.println("메뉴");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < VendingMachineMain.vendingMachineList.size(); i++) {
            System.out.printf("index = " + i + " , ");
            System.out.println(VendingMachineMain.vendingMachineList.get(i));
        }
        System.out.println("------------------------------------------------");
        System.out.println("-1. 돌아가기");
    }
}
