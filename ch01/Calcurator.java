package ch01;

public class Calcurator {
    //  두 수 a = 20, b = 5
    // 두 수를 더하고, 빼고, 곱하고, 나눈 결과를
    // 각각 출력
    public static void main(String[] args) {
        int a = 20;
        int b = 3;

        System.out.println("더한 값 = " + (a + b));
        System.out.println("뺀 값 = " + (a - b));
        System.out.println("곱한 값 = " + (a * b));
        System.out.println("나눈 값 = " + (a / b));
        // 왜 마음대로 하셨어요

        // 변수를 선언해서 계산 해주세요

        // 1. 덧셈
        int sum = a + b;
        System.out.println("덧셈 결과 : " + sum);
        // 2. 뺄셈
        int minus = a - b;
        System.out.println("뺏셈 결과 : " + minus);
        // 3. 곱셉
        int multiply = a * b;
        System.out.println("곱셈 결과 : " + multiply);
        // 4. 나눗셈
        double divide = (double) a / b;
        System.out.println("나눗셈 결과 : " + divide);

        int ddo = a / b;
        System.out.println("나나눗눗셈셈 결결과과 : " + ddo);

        // 5. 나머지를 구하는 연산자(%)
        // 7을 3으로 나눈 나머지
        System.out.println(7 % 3);
        // 3을 7로 나눈 나머지
        System.out.println(3 % 7);

        // 문제. 7을 3으로 나눈 나머지와 몫을 구하시오.
        // 출력 형식은 다음과 같이
        // 몫 : 2, 나머지 : 1

        System.out.println("몫 : " + 7 /3 );
        System.out.println("나머지 : " + 7 % 3);
        System.out.println("몫 : " + 7 / 3 + ", 나머지 : " + 7 % 3);

        // 변수를 선언하세요

        // 1. 몫
        int result = 7 / 3;
        String r1 = "몫은 : " + result;
        System.out.println(r1);

        // 2. 나머지
        int namegi = 7 % 3;
        String r2 = "나머지는 : " + namegi;
        System.out.println(r2);

        // 3. 합해서 출력
        System.out.println(r1 + r2);
    }
}
