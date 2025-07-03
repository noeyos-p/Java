package quiz_02;

public class Q_01 {
    public static void main(String[] args) {
        // 배열 만들고 초기화 하기
        int[] num = {3, 29, 38, 12, 57, 74, 40, 85, 61};
        // 최댓값과 인덱스를 담을 변수
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        // 최솟값과 인덱스를 담을 변수
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max){
                max = num[i];
                maxIndex = i;
            }
            if ( num[i] < min) {
                min = num[i];
                minIndex = i;
            }
        }
        // 출력하기
        System.out.println("최댓값 : " + max + ", 인덱스 : " + maxIndex);
        System.out.println("최솟값 : " + min + ", 인덱스 : " + minIndex);
    }
}
