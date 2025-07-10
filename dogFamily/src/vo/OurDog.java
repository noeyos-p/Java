package vo;

public class OurDog {
    private String name;
    private String kind;
    private String color;
    private int age;
    
    // getter
    public String getName() {return this.name;}
    public String getKind() {return this.kind;}
    public String getColor() {return this.color;}
    public int getAge() {return this.age;}

    public void setName(String name) { this.name = name; }
    public void setColor(String color) { this.color = color;}
    public void setAge(int age) { this.age = age; }

    // 견종을 고정해주는 명령어
    public OurDog(String kind) { this.kind = kind; }
    // 고정을 해준뒤 다른것들은 바꿀 수 있게 넣지 않음

    @Override
    public String toString() {
        return "OurDog{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
