package overloading;
// Overloading은 함수의 이름 하나에
// 전달되는인자에 따라 실행함수가 달라지는 것.
public class Running {
    public void run() {
        System.out.println("기본 달리기");
    }

    public void run(int k) {
        System.out.println(k + "km 달리기");
    } // 같은 함수의 이름이지만 다른 것을 출력하는 것을 overloading 이라고 함

    public void run(double x) {
        System.out.println("나는 " + x + "입니다.");
    }
    // 같은 타입의 같은 이름의 함수는 사용할 수 없음

    public void run(int hour, int k) {
        System.out.println(hour + "시간동안 " + k + "km 달리기");
    }
}
