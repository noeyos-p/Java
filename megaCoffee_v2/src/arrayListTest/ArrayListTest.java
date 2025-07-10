package arrayListTest;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        // 문법이다 생각하고 알아두자
        colors.add("흰색");
        colors.add("빨강");
        colors.add("핑크");
        String color = colors.get(2);
        // System.out.println(color);

        // 읽기 (set)
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // 수정 (get)
        colors.set(0, "하양");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // 삭제 (remove)
        colors.remove(1);
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        // 배열과 유사하지만 불러오는 것과 수정하는 것이
        // Getter 와 Setter로 가능함
    }
}
