package abstractTest;

public class Dog extends Animal{
    @Override
    public void speak() {
        System.out.println("멍멍");
    }
    // abstract class를 사용하려면, 무조건 speak 클래스를 구현해야한다.

}
