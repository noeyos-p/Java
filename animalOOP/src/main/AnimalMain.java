package main;

import abstractClazz.MildAnimal;
import abstractClazz.WildAnimal;
import mildAnimal.Monkey;
import wildAnimal.Lion;

public class AnimalMain {
    public static void move(WildAnimal wildAnimal) {
        wildAnimal.up();
        wildAnimal.down();
    }

    public static void move(MildAnimal mildAnimal) {
        mildAnimal.left();
        mildAnimal.right();
    }

    // 함수를 move로 하나만 만듦
    // overloading 이라고 함
    public static void main(String[] args) {
        MildAnimal monkey = new Monkey();
        WildAnimal lion = new Lion();
        lion.attack();

        monkey.collect();
        monkey.hide();

        move(monkey);
        move(lion);
    }
}
