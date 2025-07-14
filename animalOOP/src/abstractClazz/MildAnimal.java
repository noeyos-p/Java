package abstractClazz;

import myInterface.MoveAble;

public abstract class MildAnimal implements MoveAble {
    public abstract void collect();
    // 여기서 left를 이미 선언했으므로
    // 자식 class에서 선언하지 않아도 되는 것
    @Override
    public void left() {
        System.out.println("왼쪽으로 이동");
    }

    @Override
    public void right() {
        System.out.println("오른쪽으로 이동");
    }
}
