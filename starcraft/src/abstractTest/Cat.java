package abstractTest;

public class Cat extends Animal{
// Override를 구현하면, 부모것이 무시된다.
    @Override
    public void speak() {
        System.out.println("야옹");
    }
}
