package ch03;

import java.util.Scanner;

public class ArrayEx04 {
    public static void main(String[] args) {
        // 스캐너로 주사위 값을 세번을 한번에 입력 받고 싶음
        // dice_1 = 3
        // dice_2 = 3
        // dice_3 = 6
        // 이렇게 받았었는데 3 3 6 이렇게 한번에 받고 싶음
        // int[] dice = new int[3];
        // 첫번째 입력 받은 거 -> [0]
        // 두번째 입력 받은 거 -> [1]
        // 세번쨰 입력 받은 거 -> [3]
        // 문자열로 입력을 받아야함
        // {"1", "2", "4"}
        // 문자의 타입을 숫자로 변환하는 것 이기 때문에 Casting이 될 순 없음
        Scanner sc = new Scanner(System.in);
        System.out.println("세 개의 주사위 값을 입력하세요");
        String numbers = sc.next();
        // numbers = "123"
        // 배열에다가 문자를 쪼개서 집어넣을 거임
        String[] strNumbers = numbers.split("");
        // regex = 표현식이라고 대충 생각해놓기
        // 동적 생성
        // .split는 쪼개는 것
        // 문자배열을 숫자배열로 바꿔준다
        // 정수로 바꿔서 담을 정수배열이 필요해요.
        int[] diceNumber = new int[strNumbers.length];
        // int 타입으로 배열을 만들어줌
        for (int i = 0; i < numbers.length(); i++) {
            // 만들때 배열의 크기가 정해지지 않았기 때문에 ()가 생김
            diceNumber[i] = Integer.parseInt(strNumbers[i]);
            System.out.println(diceNumber[i]);
            // parse는 바꿔준다는 뜻임
            // 문자로 입력받은 것들을 정수형으로 바꿔줌
            // 나중에 복붙해서 사용하세요~
        }

    }
}
