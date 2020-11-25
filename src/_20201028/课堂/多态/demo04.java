package _20201028.课堂.多态;

//1`多态就是子类的对象变量是父类类型
//2·多态中的父类类型的子类变量能调用的子类方法，必须是重写的
//3`多态中，父类类型的子类变量可以强制转化成子类变量
//4`需要进行用instanceof判断
public class demo04 {
    public static void main(String[] args) {
        Jiekou jiekou2 = new putong2();
        Jiekou jiekou3 = new putong3();
        putong3 putong3 = new putong3();
        putong3.say();
        jiekou3.say();
        System.out.println(((putong3)jiekou2).name);
        if (jiekou2 instanceof putong3){
            System.out.println("shi");
        }else {
            System.out.println("buxing");
        }
    }
}
