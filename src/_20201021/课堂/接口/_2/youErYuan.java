package _20201021.课堂.接口._2;

public class youErYuan extends Student implements Person{
    @Override
    public void ChiFan(){
        System.out.println("吃饭需要管理");
    }@Override
    public void ShuiJiao(){
        System.out.println("睡觉需要管理");
    }
}
