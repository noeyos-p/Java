package extendTest;


import composition.Car;
import composition.Engine;

public class BurgerMain {
    public static void main(String[] args) {
        // 햄버거 푸드트럭 생성
        // 새로운 엔진을 생성
        Engine engine = new Engine();
        Car foodTruck = new Car("푸드 트럭", engine);
        System.out.println(foodTruck.getName());
        int truckPower = foodTruck.getEngine().getPower();
        System.out.println(truckPower);


        // 상속받은 클래스 생성 (치즈 버거)
        CheeseBurger cheese = new CheeseBurger();
        System.out.println(cheese.getName());
        // 만약 상속받을 클래스가 name 변수를 선언하지 않으면
        // 부모 클래스에 name 변수인 기본 햄버거가 출력됨
        // 상속 받은 클래스가 name 변수에 선언되었으면
        // -> 동적바인딩 이라고 한다.
        System.out.println(cheese.getMat_1());
        System.out.println(cheese.getMat_2());
        System.out.println(cheese.toString());
        // cheese 에 toString이 선언되지 않으면
        // Burger 에서 상속받은 것이 출력됨

        // 부모 클래스를 생성하기
        Hamburger hamburger = new Hamburger();
        System.out.println(hamburger.getName());
        System.out.println(hamburger.getMat_1());
        System.out.println(hamburger.getMat_2());
        // 부모 클래스는 상속을 해주는 것이므로
        // 자신 안에 있는 것들만 출력 가능함
        // 햄버거 클래스의 내용을 출력
        System.out.println(hamburger.toString());
        // to.String

        // 또 다른 상속받은 클래스 생성 (치킨 버거)
        ChickenBurger chickenBurger = new ChickenBurger();
        System.out.println(chickenBurger.getName());
        System.out.println(chickenBurger.getMat_1());

    }
}
