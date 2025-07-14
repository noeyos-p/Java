package polymorphismTest;

import java.util.ArrayList;
import java.util.List;

public class BecksMain {
    public static void main(String[] args) {
        ChainMan chainMan = new ChainMan();
        chainMan.getWork();
        // 자식의 getWork()
        // 부모꺼 내꺼
        System.out.println(chainMan.getWork());
        chainMan.condition();
        // 내꺼 내꺼
        System.out.println(chainMan.condition());
        System.out.println("------------------------------------------------");
        // 부모를 바라보게 하기
        // 사업가 타입인데 부모클래스를 바로봄
        Cooker beak = new ChainMan();
        beak.getWork();
        System.out.println(beak.getWork());
        System.out.println("-------------------------------------------------");
        // 요리사 타입의 유튜버를 생성
        Cooker youtuber = new Youtuber();
        // 자식꺼 getWork 가 실행
        System.out.println(youtuber.getWork());
        // -> Cooker를 바라보고 있으니 다른 시점 변환을 하려면 캐스팅을 해야함
        // 자식 유튜버꺼 getWorking 실행
        String childWork = ((Youtuber) youtuber).getWorking();
        // -> Youtuber을 바라보게끔 하는 방법
        // 타입을 바꾸는 것이므로 괄호로 묶어줌.
        System.out.println(childWork);

        List<Cooker> cookerList = new ArrayList<>();
        cookerList.add(beak);
        cookerList.add(youtuber);
        cookerList.add(chainMan);
        // -> 부모 타입으로 바뀌어서 들어감
        // Chainman 타입이 아닌 Cooker 타입이 됨
        // 묵시적 형변환이 일어남

        System.out.println("-----------------------------------");
        for (int i = 0; i < cookerList.size(); i++) {
            System.out.println(cookerList.get(i).getWork());
        }
    }
}
