import java.util.Scanner;

public class VendingMachineMain {
    // 전체적으로 자주 사용하는 변수와 배열을 선언
    static Scanner sc = new Scanner(System.in);
    // 전체 제품 수
    static final int COUNT = 5;
    // 배열을 선언
    // 제품명, 가격, 재고, 판매금액
    static String[] product = new String[COUNT]; // 제품명
    static int[] price = new int[COUNT]; // 단가
    static int[] stock = new int[COUNT]; // 재고 수량
    static int[] sales = new int[COUNT]; // 판매금액
    static int choice = 0;

    static void dataInitialize() {
        product[0] = "Coke";
        price[0] = 500;
        stock[0] = 3;

        product[1] = "Cyder";
        price[1] = 700;
        stock[1] = 3;

        product[2] = "Coffee";
        price[2] = 1500;
        stock[2] = 3;
    }

    public static void main(String[] args) {
        // 데이터 초기화 함수 호출하기
        dataInitialize();
        mainMenu();
    }

    private static void mainMenu() {
        while (true) {
            // 판매정보 얻어오기
            getInfo();
            System.out.println("-1:종료하기");
            System.out.println("돈을 넣어주세요:");
            choice = sc.nextInt();
            // 1004인 경우 관리자 메뉴로 갑니다.
            if (choice == 1004) {
                admin();
            } else if (choice == -1) {
                break;
            } else {
                userMenu();
            }

        }
    }

    private static void getInfo() {
        System.out.println("===================================");
        System.out.println("자판기입니다.(번호:상품(가격)-재고)");
        for (int i = 0; i < COUNT; i++) {
            if (product[i] != null) { // (! (products[i] == null))
                String strMenu = (i + 1) + ":" + product[i] + "(" + price[i] + "W)" + "-" + stock[i] + "개";
                System.out.println(strMenu);
            }
        }
        System.out.println("===================================");
    }

    private static void userMenu() {
        while (true) {
            System.out.println("사용자 페이지");
            System.out.println("메뉴 입력:");
            int menu = sc.nextInt();
            System.out.println(product[menu - 1] + "이(가) 나왔다!");
            choice = choice - price[menu - 1];
            System.out.println("잔액:" + choice);
            System.out.println(" 1:계속구매하기 2:금액추가하기 3:잔돈반환하기");
            System.out.println("번호를 입력하세요:");
            int num = sc.nextInt();
            switch (num) {
                case 1 :
                    for (int i = 0; i < COUNT; i++) {
                        if (choice < price[i]) {
                            System.out.println("잔액이 부족합니다!");
                            System.out.println("잔액:" + choice);
                        }
                        }

                    }
                    continue;
                case 2 :

                case 3 :

            }
        }
    }

    private static void admin() {
        while (true) {
            System.out.println("===================================");
            System.out.println("관리자 페이지입니다.");
            System.out.println("1:메뉴변경 2:가격변경 3:재고추가 4:메뉴추가 5:수익확인(종료는 -1)");
            System.out.println("번호를 입력하세요:");
            int choice = sc.nextInt();
            // 입력한 번호에 따라서 분기
            switch (choice) {
                case -1: // 종료
                    System.out.println("메인으로 돌아가요.");
                    return;
                case 1: // 메뉴 변경
                    updateMenu();
                    break;
                case 2: // 가격 변경
                    updatePrice();
                    break;
                case 3: // 재고 추가
                    updateStock();
                    break;
                case 4: // 메뉴 추가
                    addMenu();
                    break;
                case 5: // 수익 확인
                    salesConfirm();
                    break;
                default:
                    System.out.println("잘못 입력했어요.");
                    continue;
            }
        }
    }

    private static void salesConfirm() {
        // 매출 확인
        System.out.println("매출 확인 페이지");
        int total = 0;
        for (int i = 0; i < COUNT; i++) {
            if (product[i] != null) { // (! (products[i] == null))
                String strMenu = (i + 1) + ". " + product[i] + " : " + sales[i] + "원  ";
                System.out.println(strMenu);
                total += sales[i];
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("누적 총 판매금액 : " + total + "원");
    }

    private static void addMenu() {

        System.out.println("메뉴 추가 페이지");
        int ableCount = 0;
        for (int i = 0; i < COUNT; i++) {
            if (product[i] != null) {
                ableCount++;
            }
        }
        if ((COUNT - ableCount) == 0) {
            System.out.println("더 이상 메뉴를 추가할 수 없습니다.");
            return;
        }
        String yesOrNo = "";
        if (ableCount > 0) {
            System.out.println("메뉴를 추가할까요? (Y/N)");
            yesOrNo = sc.next();
            // 무조건 대문자로 바꿔준다.
            yesOrNo = yesOrNo.toUpperCase();
            switch (yesOrNo) {
                case "Y" :
                    String newMenu = "";
                    int newPrice = 0;
                    System.out.println("추가하실 메뉴의 가격을 입력하세요:");
                    newPrice = sc.nextInt();
                    System.out.println("추가하실 메뉴의 이름을 입력하세요:");
                    newMenu = sc.next();
                    for (int i = 0; i < COUNT; i++) {
                        if (product[i] == null) {
                            product[i] = newMenu;
                            price[i] = newPrice;
                            System.out.println(product[i] + "의 재고는 몇 개 입니까?:");
                            int newStock = sc.nextInt();
                            stock[i] = newStock;
                            getInfo();
                            return;
                        }
                    }
                    break;
                case "N" :
                    System.out.println("관리자 메뉴로 돌아갑니다.");
                    break;
                default:
                    System.out.println("잘못 입력했어요.");
                    System.out.println("관리자 메뉴로 돌아갑니다.");
                    return;
            }
        } else {
            System.out.println("관리자 메뉴로 돌아갑니다.");
            return;
        }
    }

    private static void updateStock() {
        // 재고 추가
        while (true) {
            System.out.println("재고 추가 페이지");
            getInfo();
            System.out.println("재고를 추가하실 메뉴의 번호를 입력하세요(1~5):");
            System.out.println("관리자 페이지로 가시려면 -1을 입력하세요.");
            int choice = sc.nextInt();
            if (choice >= 1 && choice <= COUNT) {
                if (product[choice - 1] != null) {
                    System.out.println(product[choice - 1] + "를(을) 몇 개 추가하시겠습니까?:");
                    int updatePrice = sc.nextInt();
                    price[choice - 1] = updatePrice;
                    System.out.println("재고 추가가 완료되었습니다!");
                    getInfo();
                    continue;
                } else {
                    System.out.println("등록되지 않은 메뉴입니다.");
                    System.out.println("메뉴를 추가하시려면 4:메뉴츄가로 가주세요.");
                    System.out.println("재고 추가 페이지로 돌아갑니다.");
                    continue;
                }
            } else if (choice == -1) {
                System.out.println("관리자 페이지로 돌아갑니다.");
                return;
            } else {
                System.out.println("등록되지 않은 메뉴입니다.");
                System.out.println("메뉴를 추가하시려면 4:메뉴츄가로 가주세요.");
                System.out.println("재고 추가 페이지로 돌아갑니다.");
                continue;
            }
        }
    }

    private static void updatePrice() {
        // 가격 변경
        while (true) {
            System.out.println("가격 변경 페이지");
            getInfo();
            System.out.println("변경하실 메뉴의 번호를 입력하세요(1~5):");
            System.out.println("관리자 페이지로 가시려면 -1을 입력하세요.");
            int choice = sc.nextInt();
            if (choice >= 1 && choice <= COUNT) {
                if (product[choice - 1] != null) {
                    System.out.println(product[choice - 1] + "를(을) 얼마로 바꾸시겠습니까?:");
                    int updatePrice = sc.nextInt();
                    price[choice - 1] = updatePrice;
                    System.out.println("가격 변경이 완료되었습니다!");
                    getInfo();
                    continue;
                } else {
                    System.out.println("등록되지 않은 메뉴입니다.");
                    System.out.println("메뉴를 추가하시려면 4:메뉴츄가로 가주세요.");
                    System.out.println("가격 변경 페이지로 돌아갑니다.");
                    continue;
                }
            } else if (choice == -1) {
                System.out.println("관리자 페이지로 돌아갑니다.");
                return;
            } else {
                System.out.println("등록되지 않은 메뉴입니다.");
                System.out.println("메뉴를 추가하시려면 4:메뉴츄가로 가주세요.");
                System.out.println("가격 변경 페이지로 돌아갑니다.");
                continue;
            }
        }
    }

    private static void updateMenu() {
        // 메뉴 변경
        while (true) {
            System.out.println("메뉴 변경 페이지");
            getInfo();
            System.out.println("변경하실 메뉴의 번호를 입력하세요(1~5):");
            System.out.println("관리자 페이지로 가시려면 -1을 입력하세요.");
            int choice = sc.nextInt();
            if (choice >= 1 && choice <= COUNT) {
                if (product[choice - 1] != null) {
                    System.out.println(product[choice - 1] + "를(을) 무엇으로 바꾸시겠습니까?:");
                    String updateMEnu = sc.next();
                    product[choice - 1] = updateMEnu;
                    System.out.println(product[choice - 1] + "의 가격은 얼마입니까?:");
                    int updateMENu = sc.nextInt();
                    price[choice - 1] = updateMENu;
                    System.out.println(product[choice - 1] + "의 재고를 몇 개 등록 하시겠습니까?:");
                    int updateMENU = sc.nextInt();
                    stock[choice - 1] = updateMENU;
                    System.out.println("메뉴 변경이 완료되었습니다!");
                    getInfo();
                    continue;
                } else {
                    System.out.println("등록되지 않은 메뉴입니다.");
                    System.out.println("메뉴를 추가하시려면 4:메뉴츄가로 가주세요.");
                    System.out.println("메뉴 변경 페이지로 돌아갑니다.");
                    continue;
                }
            } else if (choice == -1) {
                System.out.println("관리자 페이지로 돌아갑니다.");
                return;
            } else {
                System.out.println("등록되지 않은 메뉴입니다.");
                System.out.println("메뉴를 추가하시려면 4:메뉴츄가로 가주세요.");
                System.out.println("메뉴 변경 페이지로 돌아갑니다.");
                continue;
            }
        }
    }
}

