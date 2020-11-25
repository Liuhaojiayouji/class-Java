package _20200930._5_3;

public class Dog extends Animal implements Action {
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void shut(){
        System.out.println("汪汪叫");
    }    @Override
    public void eat(){
        System.out.println("吃骨头");
    }

    @Override
    public void work() {
        System.out.println("抓小偷");
    }
}
