package ch01;
// 두 수를 바꾸는 거.
public class BasicJava {
    public static void main(String[] args) {
        // 두 수 a, b를 바꾸려면
        // 빈 변수를(정수) 만든다. => temp
        // 0. 바꾸기 전 a와 b를 출력해 본다.
        // 1. a를 temp에 넣는다.
        // 2. b를 a로 보낸다.
        // 3. temp를 b로 보낸다.
        // 4. 바꾼 이후 a와 b를 출력해 본다.
        // ------------------------------------
        // a와 b 변수를 선언하고, 초기 값을 준다.

        int a = 10; // a 정수형 변수를 선언함
        int b = 20; // b 정수형 변수를 선언함
        int temp; // 초기값을 넣지 않고 선언만 함
        // 바꾸기 전 a, b를 출력
        System.out.println("A = " + a + ", B = " + b);
        // temp 자리에 a가 와야하기 때문에 초기값을 넣지 않고 선언만 함
        // 두 수 a, b를 바꾸는 작업을 합니다.
        temp = a;
        a = b;
        b = temp;
        // 두 수를 바꾼 후 출력
        System.out.println("A = " + a + ", B = " + b);



    }
}
