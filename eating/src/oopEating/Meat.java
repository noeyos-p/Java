package oopEating;

public class Meat {
    private String name;
    private String brand;

    public Chicken(String name, String brand) {
        return this.brand = "하림";
        return this.name = "닭고기";
    }
    public Pork(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }
    public Beaf(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }
    public String getBrand() {
        return brand;
    }
    public String eat() {
        return "를 먹어요";
    }
}
