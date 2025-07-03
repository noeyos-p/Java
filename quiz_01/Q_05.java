package quiz_01;
// 문제5. money 변수 3780원의 금액이 있습니다.
// 이를 다음과 같은 결과가 나오도록 출력합니다.

// 1000원 : 3개
// 남은금액 : 780원
// 500원 : 1개
// 남은금액 : 280원
// 100원 : 2개
// 남은금액 : 80원
// 10원 : 8개
// 남은금액 : 0원
public class Q_05 {
    public static void main(String[] args) {
        int money = 3780;
        System.out.println("금액 : " + money + "원");
        int a = 1000;
        int b = 500;
        int c = 100;
        int d = 10;
        int coin;
        coin = money / a;
        System.out.println(a + "원 : " + coin + "개");
        int cash = money % a;
        System.out.println("남은 금액 : " + cash + "원");
        coin = cash / b;
        cash = cash % b;
        System.out.println(b + "원 : " + coin + "개");
        System.out.println("남은 금액 : " + cash + "원");
        coin = cash / c;
        cash = cash % c;
        System.out.println(c + "원 : " + coin + "개");
        System.out.println("남은 금액 : " + cash + "원");
        coin = cash / d;
        cash = cash % d;
        System.out.println(d + "원 : " + coin + "개");
        System.out.println("남은 금액 : " + cash + "원");

        //===============================

        System.out.println("1000원 : " + (money/1000) + "개");
        coin = money % 1000;
        System.out.println("남은 금액 : " + cash + "원");

    }
}
