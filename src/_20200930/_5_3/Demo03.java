package _20200930._5_3;

public class Demo03 {
    public static void main(String[] args) {
        Dog dog=new Dog("小黑",2);
        dog.eat();
        dog.work();
        dog.shut();
        Cat cat=new Cat("小白",3);
        cat.shut();
        cat.work();
        cat.eat();
    }
}
