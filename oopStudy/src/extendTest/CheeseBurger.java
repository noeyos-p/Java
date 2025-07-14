package extendTest;

// 상속 받는 클래스
// 상속 받은 클래스 안에서 부모 클래스도 사용가능하고,
// 상속 받은 클래스 자기 자신의 내용도 모두 사용가능함.
public class CheeseBurger extends Hamburger{
    private String name = "치즈 버거";

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CheeseBurger{" +
                "name='" + this.name + '\'' +
                // this.을 하면 자기자신것을,
                // super.을 하면 부모의 것을 출력
                // \ = 개행 이라고 함
                ", mat_1 = " + getMat_1() + '\'' +
                // super는 부모를 뜻함 super.찍으면 getMat_1이 보임
                ", mat_2 = " + super.getMat_2() + '\'' +
                '}';
    }
}
