package quiz_02;

public class Q_08 {
    public static void main(String[] args) {
        // 1 ~ 45 사이의 랜덤값 6개 생성
        // 모든 수는 서로 달라야 함
        // 로또 번호를 담을 배열 선언
        int[] lottoNumber = new int[6];
        // 로또 생성 수를 카운트
        int i = 0;
        while (i < 6) {
            // 로또 번호를 하나 생성
            int num = (int) (Math.random() * 10 + 1);
            // 같은 번호가 있는 지 확인
            for (int j = 0; j < i; j++) {
                if (num == lottoNumber[j]) {
                    continue;
                } else {
                    lottoNumber[i] = num;
                    System.out.println(lottoNumber[i]);
                    i++;
                }
            }
        }
    }
}
