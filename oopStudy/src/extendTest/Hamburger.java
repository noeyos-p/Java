package extendTest;


// 부모 클래스
public class Hamburger{
// public class Hamburger extends Object{
    private String name = "기본 햄버거";
    private String mat_1 = "번";
    private String mat_2 = "양상추";
    // 같은 패키지 내부에 있어도 private로 선언을 하게 되면
    // 상속받을 클래스에 상속을 받게해도 상속받을 수 없음
    // 따라서 Getter Setter를 만들어줘야함

    /*public String toString() {
        return "자식이 만든 toString";}*/

    @Override
    // 재정의 = 다시 정의한다
    // 부모 것의 메서드를 다시 정의함
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", mat_1='" + mat_1 + '\'' +
                ", mat_2='" + mat_2 + '\'' +
                '}';
    }

    // Getter
    public String getName() {return this.name;}
    public String getMat_1() {return this.mat_1;}
    public String getMat_2() {return this.mat_2;}


    //Setter
    public void setName(String name) {this.name = name;}
    public void setMat_1(String mat_1) {this.mat_1 = mat_1;}
    public void setMat_2(String mat_2) {this.mat_2 = mat_2;}
}
