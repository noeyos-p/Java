package vo;

public class Coffee {
    private String name;
    private int price;

    // 생성자 만들기
    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }
    // 내가 생성자를 만들었더니
    // default 생성자가 문제가 생김
    // 빈껍데기 default 생성자를 만들어줘야
    // 오류가 해결됨

    // 기본생성자 만들기
    public Coffee() {
    }

    // => 오버로딩 이라고 함


    @Override

    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    // class를 instance로 만들때
    // instance의 내부에서 출력하려면
    // toString을 만들어줘야한다.

    // Getter 만들기
    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    // Setter 만들기
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
