package _20201021.课堂.接口._1;
//1·接口是特殊的抽象类；
//2·接口里的方法默认修饰符是   public abstract
//3·接口的成员变量必须赋值
//4·接口的子类不能new对象
//5·接口的子类有三种 普通类 抽象类 接口
   //5.1·普通类实现接口只需要实现接口的所有抽象方法
   //5.2.抽象类实现接口不用实现所有抽象方法
   //5/3`接口继承接口，不能实现被继承的抽象方法
public interface Person {
    String name="huahau";//接口的成员变量必须赋值
    public abstract void ChiFan();  //接口里可以没有方法
    public abstract void ShuiJiao();//接口里可以有抽象方法

}
