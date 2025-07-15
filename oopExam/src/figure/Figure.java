package figure;

public abstract class Figure implements FigureInterface {
    // abstract class 가 Interface 를 구현할 때
    // Interface 의 모든 메서드를 구현할 의무 X
    // 만약, abstract class 에서 구현하지 않은 메서드는
    // abstract class 를 상속받는 자식이 구현해야 한다.
    public abstract double area();

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void setWidth(int width) {

    }

    @Override
    public void setHeight(int height) {

    }
}
