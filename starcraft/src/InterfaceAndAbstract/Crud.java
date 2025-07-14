package InterfaceAndAbstract;
// abstract 생략 가능
public interface Crud {
    public void create(); // 생성
    // Interface abstract methods cannot have a body
    // => 구현해놓은 걸 상속할건데 구현해 놓을 필요가 없다 라는 오류
    public String read(); // 데이터 읽기
    public void update(int id);
    // id 줄테니까 업데이트를 해줘
    public boolean delete(int id);
    // id 줄테니까 삭제하고 true 인지 false 인지 말해줘
    }
