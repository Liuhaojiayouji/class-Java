package _20201021.课堂.接口._1;

public class ChengNianRen implements Person {
    @Override
    public void ChiFan() {
        System.out.println("我是 ChiFan在子类中重写了   吃饭去了");

    }

    @Override
    public void ShuiJiao() {
        System.out.println("我是 ShuiJiao在子类中重写了  睡觉去了");
    }
}
