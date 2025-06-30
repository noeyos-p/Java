package ch01;

public class OperationTest {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;
        int sum = n1 + n2;
        System.out.println(sum);
        String s1 = "반가워요 나의 나이는 ";
        int age = 20;
//      반가워요 나의 나이는 20살 이에요.
        System.out.println(s1 + age + "살 이에요.");

        // 전체를 문자열 변수로 선언하여 출력함
        String result = s1 + age + "살 이에요.";
        // 연결 연산자를 사용하여 + 로 이어줌
        System.out.println(result);

        // 문자열 변수를 선언하여 출력함
        String s2 = "살 이에요.";
        System.out.println(s1 + age + s2);

        // n1을 0 으로 나눈 결과를 출력해 보세요.
        // System.out.println(n1 / 0);
        // -->
        // 0으로 나눠서 오류가 생김
        // 컴파일 개발하는 단계에서 발생하는 오류
        // 지금 이건 '컴파일 오류'
        // 런파일 실행할때 발생하는 오류
        // 도 있다


        // 비교연산자
        // >, <, >=, <=, ==, !=

        // 논리연산자
        // and - &&, or - ||, not - !

        // 비교판단 --- if

        // 비교연산과 논리연산의 결과는 항상 논리값이다.
        // -> true or false 라는 것, boolean 타입이 있어야함

        boolean trueOrFalse;
        trueOrFalse = (1 == 2);
        System.out.println(trueOrFalse);
        // 불리안 변수를 선언하고 값을 나오게 만듦

        trueOrFalse = (5 != 2);
        // 값을 초기화 하고 다시 값을 부여한 것이기 때문에 같은 변수를 써도 됨
        System.out.println(trueOrFalse);

        trueOrFalse = (5 >= 2);
        System.out.println(trueOrFalse);

        // x 라는 int 변수가 있어요.
        // x 가 1 ~ 10 사이의 값이면, true 그렇지 않으면 false
        // 1 <= x >= 10
        // x는 1보다 크거나 같고, x는 10보다 작거나 같다.
        int x = 20;

        trueOrFalse = (x >= 1 && x <= 10);
        System.out.println(trueOrFalse);

        trueOrFalse = (x >= 1 || x <= 10);
        System.out.println(trueOrFalse);

        System.out.println("===============");
        // 문자열 비교
        String grade = "VIP";
        String myGrade = "VIP";
        trueOrFalse = grade == myGrade;
        System.out.println(trueOrFalse);

        trueOrFalse = grade.equals(myGrade);
        // .equals() 괄호 안에 비교할 것을 적어야함
        System.out.println(trueOrFalse);
        // String 문자열의 비교는 무조건 .equals로 한다.
        // String은 대문자 이므로 class 이기 때문

    }
}
