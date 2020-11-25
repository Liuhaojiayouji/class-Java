package _20201122._10_1;

public class Demo01 {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = object1;
        System.out.println(object1.equals(object2));
        System.out.println(object1.equals(object1));

    }
}
