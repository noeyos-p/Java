package quiz_02;

public class Q_02_Teacher {
    // 상수 선언하기
    final static  int COUNT = 36000;
    public static void main(String[] args) {
        // 결과를 담을 배열 선언
        int[] dice = new int[11];
        // 36,000번 돌리기

        // final을 붙히면 이 값을 바꾸지 못함
        for (int i = 1; i < Q_02_Teacher.COUNT; i++) {
            // 주사위 두개 생성하기
            int dice01 = (int) (Math.random() * 6 + 1);
            int dice02 = (int) (Math.random() * 6 + 1);
            int sum = dice01 + dice02;
            dice[sum - 2] ++;
        }
        // 결과 출력
        System.out.println("Output : ");
        for (int i = 0; i < dice.length; i++) {
            double rate = (double) dice[i] / Q_02_Teacher.COUNT;
            String rr = String.format("%.6f", rate);
            System.out.println(i + 2 + " : " + dice[i] + "(" + rr + ")");
        }
    }
}

