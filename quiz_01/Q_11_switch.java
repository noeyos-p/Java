package quiz_01;
// 점수를 10으로 나눈 몫
// 100 - 10
// 입력한 값이 91 -> 9(10으로 나눈 몫 9)
// 90-100
// 80-89
// 70-79
// 나눌 수 있는 기준만 있다면 숫자 범주도 스위치케이스로 할 수 있음
import java.util.Scanner;

public class Q_11_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("성적입력");
        int score = sc.nextInt();
        int bound = score / 10;
        String grade = "";
        switch (bound) {
            case 10:
                grade = "A";
            case 9:
                grade = "A";
            case 8:
                grade = "B";
            case 7:
                grade = "C";
            case 6:
                grade = "D";
            case 5:
                grade = "F";
        }
        }

}
