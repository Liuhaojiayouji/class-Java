package _20201002._5_3;

public class Dog extends Animal implements Action {
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat(){
        System.out.println("guto");
    }

    @Override
    public void shut() {
        System.out.println("wangwang");
    }

    @Override
    public void work() {
        System.out.println("sha");
    }
}
