package ch02;

public class ForEx01 {
    public static void main(String[] args) {
        // 1 부터 5까지 더해서 출력하는 프로그램
        int sum = 0; // 누적 할 변수
        for (int i = 0; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        // i는 지역변수 for문 안에서만 사용할 수 있음
    }
}
