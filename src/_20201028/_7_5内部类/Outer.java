package _20201028._7_5内部类;

public class Outer {
    int x = 100;

    class Inter {
        void show() {
            System.out.println("x=" + x);
        }
    }

    public void tesk() {
        Inter inter = new Inter();
        inter.show();
    }
}
