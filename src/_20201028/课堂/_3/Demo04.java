package _20201028.课堂._3;

public class Demo04 {
    public static void main(String[] args) {
        Animal[] ans = {
                new Dog(), new Cat(), new Dog(), new Cat(), new Dog(), new Cat()
        };
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] instanceof Dog) {
                System.out.println("第" + (i + 1) +
                        "个动物是dog");
                ((Dog) ans[i]).say();
            } else {
                System.out.println("第" + (i + 1) +
                        "个动物是cay");
                ((Cat) ans[i]).say();
            }
        }
    }
}

abstract class Animal {
    public abstract void say();
}

class Dog extends Animal {
    @Override
    public void say() {
        System.out.println("www");
    }
}

class Cat extends Animal {
    @Override
    public void say() {
        System.out.println("mmm");
    }
}

