package _20201014._5_4;

public class Student implements Lifing{
    @Override
    public void sleep(){
        System.out.println("他在睡觉");
    }
    @Override
    public void swim(){
        System.out.println();
    }
    @Override
    public void game(){
        System.out.println("他在打游戏");
    }
    @Override
    public void math(){
        System.out.println("他在学数学");
    }
    @Override
    public void chinese(){
        System.out.println("他在学语文");
    }
    @Override
    public void computer(){
        System.out.println("他在学习计算机");
    }
}
