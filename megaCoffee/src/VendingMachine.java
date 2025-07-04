public class VendingMachine {
    public static final int MENU_COUNT = 5;

    static String[] product = new String[MENU_COUNT];
    static int[] price = new int[MENU_COUNT];
    static int[] stock = new int[10000];
    public static void main(String[] args) {
        initialize();
        user();
        return;
    }

    private static void user() {
        System.out.println("===========================");
        System.out.println("자판기 입니다.");
        for (int i = 0; i < MENU_COUNT; i++) {
            if (product[i] != null) { // (! (products[i] == null))
                String strMenu = (i + 1) + ". " + product[i] + " : " + price[i] + "원 - " + stock[i] + "개";
                System.out.println(strMenu);
            }
        }
        System.out.println("===========================");
    }

    private static void initialize() {
        product[0] = "콜라";
        price[0] = 500;
        stock[0] = 3;
        product[1] = "사이다";
        price[1] = 700;
        stock[1] = 3;
        product[2] = "커피";
        price[2] = 1500;
        stock[2] = 3;
    }
}
