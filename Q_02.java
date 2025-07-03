package quiz_02;

import java.text.DecimalFormat;

public class Q_02 {
    public static void main(String[] args) {
        int[] n = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int h = 0;
        int h1 = 0;
        int h2 = 0;
        int h3 = 0;
        int h4 = 0;
        int h5 = 0;
        int h6 = 0;
        int h7 = 0;
        int h8 = 0;
        int h9 = 0;
        int h10 = 0;
        int k = 0;
        int m = 0;
        for (int i = 0; i < 36000; i++) {
            int x = (int) (Math.random() * 6 + 1);
            int x2 = (int) (Math.random() * 6 + 1);
            k = x + x2;
            m = n[k - 2];
            // System.out.println(m);
            if (m == n[0]) h++;
            if (m == n[1]) h1++;
            if (m == n[2]) h2++;
            if (m == n[3]) h3++;
            if (m == n[4]) h4++;
            if (m == n[5]) h5++;
            if (m == n[6]) h6++;
            if (m == n[7]) h7++;
            if (m == n[8]) h8++;
            if (m == n[9]) h9++;
            if (m == n[10]) h10++;
        }
        double b = 0;
        b = (double) h / 36000;
        System.out.println("2 : " + h + " (" + String.format("%.6f", b) + ")");
        b = (double) h1 / 36000;
        System.out.println("3 : " + h1 + " (" + String.format("%.6f", b) + ")");
        b = (double) h2 / 36000;
        System.out.println("4 : " + h2 + " (" + String.format("%.6f", b) + ")");
        b = (double) h3 / 36000;
        System.out.println("5 : " + h3 + " (" + String.format("%.6f", b) + ")");
        b = (double) h4 / 36000;
        System.out.println("6 : " + h4 + " (" + String.format("%.6f", b) + ")");
        b = (double) h5 / 36000;
        System.out.println("7 : " + h5 + " (" + String.format("%.6f", b) + ")");
        b = (double) h6 / 36000;
        System.out.println("8 : " + h6 + " (" + String.format("%.6f", b) + ")");
        b = (double) h7 / 36000;
        System.out.println("9 : " + h7 + " (" + String.format("%.6f", b) + ")");
        b = (double) h8 / 36000;
        System.out.println("10 : " + h8 + " (" + String.format("%.6f", b) + ")");
        b = (double) h9 / 36000;
        System.out.println("11 : " + h9 + " (" + String.format("%.6f", b) + ")");
        b = (double) h10 / 36000;
        System.out.println("12 : " + h10 + " (" + String.format("%.6f", b) + ")");
    }
}
