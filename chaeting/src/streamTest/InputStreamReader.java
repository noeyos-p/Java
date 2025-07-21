package streamTest;

import java.io.InputStream;

public class InputStreamReader {
    public static void main(String[] args) {
        InputStream in = System.in;
        java.io.InputStreamReader ir = new java.io.InputStreamReader(in);
        // 이거 쓸때 클래스 명과 같으면 클래스를 지정하는게 아니라
        // InputStreamReader 라는 인텔리제이 자체에 갖고있는 것을
        // 설정해야함
        try {
            char[] data = new char[100];
            ir.read(data); // 읽어온 바이트를 배열에 저
            System.out.println(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
