package composition;

public class Car {
    private String name;
    private Engine engine;
    // 엔진 타입의 엔진 -> Composition

    // 생성 시에 name 을 받아서 생성
    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }
    // 완제품 엔진을 받아다가 넣어줌
    // 엔진이 몇 cc인지 출력이 가능함
    public String getName () {
        return this.name;
    }

    // 엔진의 Getter 만들기
    public Engine getEngine() {
        return this.engine;
    }
}
