package ch01;

public class ExchangeMoney {
    // 2,680원을 1,000원, 500원, 100원, 50원, 10원
    // 각각 몇 개씩 최소로 필요한지 출력하세요
    // 금액 : 2,680원
    // 1,000원 : 2개
    // 500원 : 1개
    // 100원 : 1개
    // 50원 : 1개
    // 10원 : 3개
    public static void main(String[] args) {
        int cash = 2680;
        int a = 1000;
        int b = 500;
        int c = 100;
        int d = 50;
        int e = 10;

        // 변수가 만들어 질때마다 출력하세요
        System.out.println("금액 : " + cash + "원");
        System.out.println(a + "원 : " + cash / a + "개");
        int money = cash % a;
        System.out.println(b + "원 : " + money / b + "개");
        money = money % b;
        System.out.println(c + "원 : " + money / c + "개");
        money = money % c;
        System.out.println(d + "원 : " + money / d + "개");
        money = money % d;
        System.out.println(e + "원 : " + money / e + "개");
        // coin을 새로운 값을 넣어주면 된다
        System.out.println("-------------------------------------------");

        int a1 = cash / a;
        int a2 = cash % a;
        int b1 = a2 / b;
        int b2 = a2 % b;
        int c1 = b2 / c;
        int c2 = b2 % c;
        int d1 = c2 / d;
        int d2 = c2 % d;
        int e1 = d2 / e;

        System.out.println("금액 : " + cash + "원");
        System.out.println(a + "원" + " : " + a1 + "개");
        System.out.println(b + "원" + " : " + b1 + "개");
        System.out.println(c + "원" + " : " + c1 + "개");
        System.out.println(d + "원" + " : " + d1 + "개");
        System.out.println(e + "원" + " : " + e1 + "개");

        System.out.println("-----------------------------");

        String cash1 = "금액 : ";
        String x = "원";
        String y = " : ";
        String z = "개";
        System.out.println(cash1 + cash + x);
        String aa1 = a1 + z;
        System.out.println(a + x + y + aa1);
        String bb1 = b1 + z;
        System.out.println(b + x + y + bb1);
        String cc1 = c1 + z;
        System.out.println(c + x + y + cc1);
        String dd1 = d1 + z;
        System.out.println(d + x + y + dd1);
        String ee1 = e1 + z;
        System.out.println(e + x + y + ee1);

        // 변수는 필요에 따라 적당히 만드는게 좋다
        // 배열을 떠올려야 한다
        // -------------------------------------------------
        System.out.println("-----------------------------------------");

        int coin = 2680; // 초기 금액을 저장
        int restCoin = coin;

        System.out.println("바꿀 돈 : " + coin);

        // 1. 1000원의 갯수 : 몫
//        System.out.println("1000원 개수 : " + (restCoin / 1000));
        // 2. 1000원 갯수를 뺀 나머지를 구해야함.
//        restCoin = restCoin % 1000;
        restCoin = restCoinPrint(restCoin, 1000);
//        System.out.println("잔액  : " + restCoin);

        // 3. 500원의 갯수 : 몫
//        System.out.println("500원 개수 : " + (restCoin / 500));
        // 4. 500원 갯수를 뺀 나머지를 구해야함.
//        restCoin = restCoin % 500;
        restCoin = restCoinPrint(restCoin, 500);
//        System.out.println("잔액  : " + restCoin);

        // 5. 100원의 갯수 : 몫
//        System.out.println("100원 개수 : " + (restCoin / 100));
        // 6. 100원 갯수를 뺀 나머지를 구해야함.
//        restCoin = restCoin % 100;
        restCoin = restCoinPrint(restCoin, 100);
//        System.out.println("잔액  : " + restCoin);

        // 7. 50원의 갯수 : 몫
//        System.out.println("50원 개수 : " + (restCoin / 50));
        // 8. 50원 갯수를 뺀 나머지를 구해야함.
//        restCoin = restCoin % 50;
        restCoin = restCoinPrint(restCoin, 50);
//        System.out.println("잔액  : " + restCoin);

        // 9. 10원의 갯수 : 몫
//        System.out.println("10원 개수 : " + (restCoin / 10));
        // 10. 10원 갯수를 뺀 나머지를 구해야함.
//        restCoin = restCoin % 10;
//        System.out.println("잔액  : " + restCoin);
        // 잔액을 출력하는 함수를 호출
        restCoin = restCoinPrint(restCoin, 10);
    }

    static int restCoinPrint(int restCoin, int don) {
        System.out.println(don + "원 개수 : " + (restCoin / don));
        restCoin = restCoin % don;
        System.out.println("잔액  : " + restCoin);
        return restCoin;

        // static int restCoinPrint(int restCoin, int don) 에서
        // int don은 선언하지 않아도 위의 값들에서 그 자리에 있는 것을
        // int don으로 인식함

        // 자주 사용하는 것을 함수로 만들어줌
        // main 안에 만들어도 됨
        // 늘 함수는 호출한 곳 밑으로 옴
    }
}
