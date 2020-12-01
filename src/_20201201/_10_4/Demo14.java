package _20201201._10_4;

import java.util.Random;

public class Demo14 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int num1 = random.nextInt(100);
            System.out.print(num1 + ",");
        }
        System.out.println();
        Random random1 = new Random(13);
        for (int i = 0; i < 5; i++) {
            int num2 = random1.nextInt(100);
            System.out.print(num2 + ",");
        }
    }
}
