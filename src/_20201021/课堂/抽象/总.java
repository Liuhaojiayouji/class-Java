package _20201021.课堂.抽象;
//1.抽象类就是一个类用abstract修饰
//2.抽象类里面可以有抽象方法，也可以没有，但是有抽象方法的类一 定是抽象类
//3.抽象方法就是没有方法体的方法，用abstract修饰
//3.1方法体就是方法定义时一对圆括号后边的大括号
//3.2没有方法体就是把方法定义时的一对圆括号后面的大括号用一个分号来代替
//4.抽象类不能new对象，所有的抽象类里面的成员实现用子类来实现
//5.抽象类的子类有两种，普通类和抽象类
//5. 1抽象类的子类是普通类，必须实现父类所有的抽象方法，去掉abstract. 把分号改成大括号
//5.2抽象类的子类是抽象类。不必实现父类所有的抽象方法。
public class 总 {
    public static void main(String[] args) {
        ZhongQiaoXueSheng zhongQiaoXueSheng=new ZhongQiaoXueSheng();
        zhongQiaoXueSheng.sayMyself();
        zhongQiaoXueSheng.name();
    }
}
