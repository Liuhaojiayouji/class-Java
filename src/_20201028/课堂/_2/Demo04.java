package _20201028.课堂._2;

public class Demo04 {
    public static void main(String[] args) {
            Animal an1=new Cat();
            Animal an2=new Dog();
            if (an1 instanceof Dog){
                Dog d1=(Dog)an1;
                d1.say();
            }else {
                Cat c1=(Cat)an1;
                c1.say();
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

