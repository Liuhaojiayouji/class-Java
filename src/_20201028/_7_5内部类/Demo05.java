package _20201028._7_5内部类;

public class Demo05 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.tesk();
        Outer.Inter inter = new Outer().new Inter();
        inter.show();
    }
}
