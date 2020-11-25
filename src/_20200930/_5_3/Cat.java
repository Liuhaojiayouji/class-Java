package _20200930._5_3;

public class Cat extends Animal implements Action {
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void shut(){
        System.out.println("喵喵叫");
    }    @Override
    public void eat(){
        System.out.println("吃鱼");
    }

    @Override
    public void work() {
        System.out.println("抓老鼠");
    }
}
