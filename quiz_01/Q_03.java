package quiz_01;
// 문제3. 1부터 20까지의 수를 출력하세요. (단, 2의 배수일 때만 출력하세요)
// for 문법 사용
public class Q_03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }
        for (int k = 2; k <= 20; k = k + 2) {
            System.out.println(k);
        }
    }
}
