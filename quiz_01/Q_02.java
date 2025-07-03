package quiz_01;

// 문제2. 10부터 1까지의 수를 출력하세요. (단, 숫자가 3일 때는 출력하지 마세요)
// for와 do~while 문 두 문법을 사용해서 만드세요.
public class Q_02 {
    public static void main(String[] args) {
        int i = 10;
        do {
            for (i = 10; i > 0; i--) {
                if (i == 3) {
                    continue;
                }
                System.out.println(i);
            }
        } while (i > 0);
        {
        }
        //--------------------------------------
        System.out.println("For");
        for (int j = 10; j >= 1; j--) {
            if (i == 3) continue;
            System.out.println(j);
        }
        System.out.println("While");
        int k = 10;
        while (k > 0) {
            k = k - 1; // k--;
            if (k == 3) continue;
            System.out.println(k);
        }
    }
}






