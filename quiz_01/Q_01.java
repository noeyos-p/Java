package quiz_01;
// 문제1. 1부터 10까지의 수를 출력하세요. (단, 숫자가 6일 때는 출력하지 마세요)
// for와 while 문 두 문법을 사용해서 만드세요.
public class Q_01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                continue;
            }
            System.out.println(i);
        }


        // ---------------------------------------


        int j = 0;
        while (j < 10) {
            j = j + 1;
            if (j == 6) {
                continue;
            }
            System.out.println(j);
        }

        }
    }
