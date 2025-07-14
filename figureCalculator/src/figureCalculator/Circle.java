package figureCalculator;
// 원
public class Circle extends Figure{
    private String name = "원";
    private int radius;
    private double pie = 3.14159265358979;
    public String getName() {
        return this.name;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println(this.name + "의 넓이는 " + radius*radius*pie);
    }
}
