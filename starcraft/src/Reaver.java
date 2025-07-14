public class Reaver extends ProtosUnit{
    private String name = "리버";
    public String confirmName() {
        return this.name;
    }

    public void attack(Dragoon e) {
        System.out.println(this.name + "이" + e.confirmName() + "을 공격");
    }
    // attack basicAttack을 써야 부모타입을 썼을때 자식이 실행이 된다.
    // 앱스트렉트클래스? 하고 인터페이스
}
