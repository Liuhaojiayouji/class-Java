package _20201029;

public class _190401139陆佳友 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Pig(),
                new Dog()
        };
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) {
                ((Cat) animals[i]).say();
            } else if (animals[i] instanceof Dog) {
                ((Dog) animals[i]).say();
            } else if (animals[i] instanceof Pig) {
                ((Pig) animals[i]).say();
            }else {
                System.out.println("程序错误");
            }
        }
    }
}
