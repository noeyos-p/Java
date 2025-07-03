package quiz_01;

import java.util.Scanner;

// 문제7. 두 정수 A와 B를 차례로 입력받은 다음, 두 수 A와 B 사이의 모든 정수값을 더해
// 출력하는 프로그램을 작성하시오. for loop
//
// - 예제 입력 1
// 첫 번째 값을 입력하세요 :
// 2
// 두 번째 값을 입력하세요 :
// 7
//
// - 예제 입력
// 첫 번째 값을 입력하세요 :
// 7
//두 번째 값을 입력하세요 :
// 2
// - 출력
// 27
public class Q_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 값을 입력하세요 : ");
        int A = sc.nextInt();
        System.out.println("두 번째 값을 입력하세요 : ");
        int B = sc.nextInt();

        int C;
        if (A < B) {
            C = A;
            A = B;
            B = C;
        }
        int sum = 0;
            for(int i = A; i >= B; i--){
                sum += i;
            }
            System.out.println(sum);

            //--------------------------------
        System.out.println("첫 번째 값을 입력하세요 : ");
        int intA = sc.nextInt();
        System.out.println("두 번째 값을 입력하세요 : ");
        int intB = sc.nextInt();
        System.out.println("intA + intB" + "=" + (intA+intB));
        }
    }

