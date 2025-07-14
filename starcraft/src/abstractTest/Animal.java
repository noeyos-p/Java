package abstractTest;

public abstract class Animal {
    // 팀원들이 구현할 곳
    // 자식 것이 실행 될 것이기 때문에, 바디가 없다
    // 실행되지 않는다.
    public abstract void speak();
    // 팀장으로서 팀원들과 공유할 메서드
    public void hello() {
        System.out.println("수고해요~");
    }
}
