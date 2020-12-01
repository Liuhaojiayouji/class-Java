package _20201201._10_4;

public class Demo13 {
    public static void main(String[] args) {
        double d1 = Math.ceil(3.3);
        double d2 = Math.ceil(-3.3);
        double d3 = Math.ceil(5.1);
        System.out.println(d1 + "," + d2 + "," + d3);

        double d4 = Math.floor(3.3);
        double d5 = Math.floor(-3.3);
        double d6 = Math.floor(5.1);
        System.out.println(d4 + "," + d5 + "," + d6);

        double d7 = Math.round(5.5);
        double d8 = Math.round(5.4);
        System.out.println(d7 + "," + d8);

        double d9 = Math.max(3.3, 5.5);
        double d10 = Math.max(-3.3, -5.5);
        System.out.println(d9 + "," + d10);

        double d11 = Math.min(3.3, 5.5);
        double d12 = Math.min(-3.3, -5.5);
        System.out.println(d11 + "," + d12);

        double d13 = Math.random();
        System.out.println(d13);

    }
}
