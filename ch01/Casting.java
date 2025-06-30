package ch01;

public class Casting {
    // 형 변환
    // 1. 다운 캐스팅(down-casting)
    // 2. 업 캐스팅(up-casting)

    // 왜 형 변환을 하냐면, 그릇이 다르면 결과 값이 다르기 때문
    // 묵시적 형 변환 : 작은 그릇 -> 큰 그릇 옮김 (생략가능)
    // 명시적 형 변환 : 큰 그릇 -> 작은 그릇 (생략 불가능, 값이 달라질 수 있으므로)
    public static void main(String[] args) {
        int n1 = 100; // 4byte(21억)
        System.out.println(n1);

        double d1 = n1; // 묵시적 캐스팅, 업 캐스팅 (정수->실수로 변환)
        System.out.println(d1);

        long longType = 100;
        int intType = (int) longType;
        // 명시적 캐스팅, 다운 캐스팅 (8byte -> 4byte로 변환)
        // 다른 변수를 선언해서 캐스팅을 함
        System.out.println(intType);


    }
}
