package oopEating.main;

import oopEating.eater.MeatEater;
import oopEating.eater.Vegetarian;
import oopEating.fruit.Apple;
import oopEating.fruit.Fruit;
import oopEating.fruit.Mango;
import oopEating.fruit.Orange;
import oopEating.meat.Meat;
import oopEating.meat.Pork;

public class OOPEatingMain {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Vegetarian vegetarian = new Vegetarian(apple);
        vegetarian.vegetableEat();

        Vegetarian v2 = new Vegetarian(new Mango());
        // 윗 두줄을 한줄로 줄임
        v2.vegetableEat();

        MeatEater m1 = new MeatEater(new Pork());
        m1.meatEat();

        // Overloading Test
        System.out.println("----------------------------------------");
        Eater eater = new Eater();
        eater.whatEat(new Orange());
        eater.whatEat(new Pork());
        // 오버로딩을 해놓으면 훨씬 깔끔해짐
    }
}
