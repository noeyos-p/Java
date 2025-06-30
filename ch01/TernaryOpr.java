package ch01;

// 3항 연산자 처리
public class TernaryOpr {
    public static void main(String[] args) {
        int n1 = 5;
        // 조건비교? 참일때:거짓일때;
        // n1과 10을 비교?
        // 10보다 큰 값인지, 작은 값인지 출려

        String result; // 두 수를 비교한 결과

        result = n1 > 10 ? "크다" : "작다";
        System.out.println(result);
        // : 콜론이 나오는 건 이거 밖에 없음

        // score 변수 생성 : 시험점수 70
        // 점수가 60 이상이면 Pass, Fall 을 출력 하도록 하세요.

        String score;
        int n2 = 70;
        score = n2 >= 60 ? "Pass" : "Fall";
        System.out.println(score);
        // -> score로 변수 생성하라고 했으니 String이 아니라 int에 score가 있어야함

        // int score = 70;
        // String r = score >= 60 ? "Pass" : "Fall";
        // System.out.println(r);

    }

}
