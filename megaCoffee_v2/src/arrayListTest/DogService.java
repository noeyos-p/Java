package arrayListTest;

import java.util.Scanner;

public class DogService {
    Scanner sc = new Scanner(System.in);
    // CRUD 기능
    // Create
    public void addDog() {
        Dog dog = new Dog();
        System.out.println("강아지의 이름은 : ");
        String name = sc.next();
        System.out.println("강아지의 나이는 : ");
        int age = sc.nextInt();
        dog.setName(name);
        dog.setAge(age);
        System.out.println(dog);

        // List에 추가
        DogMain.doglist.add(dog);
    }


    // Read
    public void printDog() {
        for (int i = 0; i < DogMain.doglist.size(); i++) {
            System.out.printf("Index : " + i + " : ");
            System.out.println(DogMain.doglist.get(i));
        }
    }
    // Update
    public void updateDog() {
        // 리스트를 보여준다
        // 수정할 강아지의 이름을 입력받는다.
        // 해당 강아지의 인덱스를 찾는다.
        // 나이와 이름을 입력받아서 수정한다.
        printDog();
        System.out.println("수정할 강아지의 이름을 입력해주세요.");
        String updateName = sc.next();
        int updateIndex = -1;
        for (int i = 0; i < DogMain.doglist.size(); i++) {
            if (DogMain.doglist.get(i).getName().equals(updateName)) {
                updateIndex = i;
                break;
            }
        }
        if (updateIndex == -1) {
            System.out.println("수정할 수 있는 강아지가 없습니다.");
        } else {
            System.out.println("수정할 내용을 입력해주세요.");
            System.out.println("수정할 이름 : ");
            String newName = sc.next();
            System.out.println("수정할 나이 : ");
            int newAge = sc.nextInt();
            Dog updateDog = new Dog();
            updateDog.setName(newName);
            updateDog.setAge(newAge);
            DogMain.doglist.set(updateIndex, updateDog);
            System.out.println("수정되었습니다.");
            printDog();
        }
    }

    // Delete
    public void deleteDog() {
        printDog();
        System.out.println("삭제할 강아지의 이름을 입력해주세요.");
        String deleteName = sc.next();
        // 삭제할 이름의 강아지 인덱스를 찾습니다.
        int dogIndex = -1;
        for (int i = 0; i < DogMain.doglist.size(); i++) {
            if (DogMain.doglist.get(i).getName().equals(deleteName)) {
                // 리스트를 돌리면서 안에 내가 지울 이름과 같은 이름이 있는지 확인함
                dogIndex = i;
                break;
            }
        }
        if (dogIndex == -1) {
            System.out.println("삭제할 강아지가 없습니다.");
        } else {
            System.out.println("삭제되었습니다.");
            DogMain.doglist.remove(dogIndex);
            printDog();
        }
    }
}
