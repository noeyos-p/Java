package main;

import vo.OurDog;

public class DogMain {
    public static void main(String[] args) {
        OurDog maltese = new OurDog("말티즈");
        maltese.setName("코코");
        maltese.setColor("흰색");
        maltese.setAge(2);

        OurDog chihuahua = new OurDog("치와와");
        chihuahua.setName("치치");
        chihuahua.setColor("검정");
        chihuahua.setAge(1);

        OurDog retriever = new OurDog("리트리버");
        retriever.setName("덩치");
        retriever.setColor("골드");
        retriever.setAge(3);

        OurDog[] dogs = new OurDog[3];
        dogs[0] = maltese;
        dogs[1] = chihuahua;
        dogs[2] = retriever;

        for (OurDog dog : dogs) {
            System.out.println(dog);
        }

        System.out.println("-------------------------------------------------------");

        dogs[0].setAge(5);
        dogs[2].setName("망치");

        for (OurDog dog : dogs) {
            System.out.println(dog);
        }
    }
}
