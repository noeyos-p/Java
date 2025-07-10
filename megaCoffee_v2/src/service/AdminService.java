package service;

import main.CoffeeMain;
import view.UserView;
import vo.Coffee;

import java.util.Scanner;

public class AdminService {
    private UserView userView = new UserView();
    private Scanner sc = new Scanner(System.in);
    public void menuUpdate() {
        Coffee updateCoffee = new Coffee();
        System.out.println("메뉴 가격 수정 처리 서비스");
        userView.viewMenu();

        System.out.println("가격을 수정할 메뉴 번호 : ");
        int updateNum = sc.nextInt();
        System.out.println("수정 할 가격을 입력하세요.");
        int updatePrice = sc.nextInt();

        // 해당 인덱스의 객체 얻어오기
        Coffee coffee = CoffeeMain.coffeeList.get(updateNum);
        // 배열과 같은 느낌이니까 ()안에 숫자가 인덱스 숫자 즉 메뉴번호를 뜻해서 불러옴.
        coffee.setPrice(updatePrice);
        // 불러온 메뉴의 가격을 updatePrice로 입력받고 저장함
        CoffeeMain.coffeeList.set(updatePrice, coffee);
        // set을 쓰려면 메뉴의 인덱스와 수정할 가격을 같이 적어야하므로 ,로 넣기
        userView.viewMenu();

//        int updateIndex = -1;
//        for (int i = 0; i < CoffeeMain.coffeeList.size(); i++) {
//            if (CoffeeMain.coffeeList.get(i) != null) {
//                if (updateNumber == i) {
//                    updateIndex = i;
//
//                    updateCoffee.setPrice(updatePrice);
//
//                    CoffeeMain.coffeeList.set(updateIndex, updateCoffee);
//                    System.out.println("수정되었습니다.");
//                    userView.viewMenu();
//                    break;
//                }
//            } else if (CoffeeMain.coffeeList.get(i) == null) {
//                System.out.println("수정할 수 있는 메뉴가 아직 없습니다.");
//            }
//        }
//        if (updateIndex == -1) {
//            System.out.println("수정할 수 있는 메뉴가 없습니다.");
//        }

    }
    public void menuInsert() {
        System.out.println("메뉴 추가 처리 서비스");
        userView.viewMenu();

        // 새로운 메뉴 입력받기
        System.out.println("추가할 메뉴이름 : ");
        String newProduct = sc.next();
        System.out.println("가격은 : ");
        int newPrice = sc.nextInt();

        // 비어있는 커피 인스턴스 생성 후 넣어주기
        Coffee coffee = new Coffee();
        coffee.setProduct(newProduct);
        coffee.setPrice(newPrice);

        // 리스트에 추가하기
        CoffeeMain.coffeeList.add(coffee);
        System.out.println("--------------------------------------");
        userView.viewMenu();
    }
    public void adminResult() {
        System.out.println("정상처리 화면");
        userView.viewMenu();
        // 총 판매액 계산하고 출력하기
        int totalPrice = 0;
        for (int i = 0; i < CoffeeMain.coffeeList.size(); i++) {
            totalPrice = totalPrice + CoffeeMain.coffeeList.get(i).getSales();
        }
        System.out.println("----------------------------------------------");
        System.out.println("총 판매 금액 : " + totalPrice);
        System.out.println("----------------------------------------------");
    }
}
