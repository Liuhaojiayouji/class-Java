package _20201104.作业._190401139陆佳友;

public class _190401139陆佳友 {
    public static void main(String[] args) {
        Animal animal1=new Animal();//无参方法执行，以及静态执行，和内部类执行
        System.out.println();//换行
        System.out.println();//换行
        System.out.println("匿名执行");
        new  Animal().eat();//     匿名执行
        System.out.println();//换行
        System.out.println();//换行
        Animal animal2=new Animal(12,"asd");//有参方法执行，以及静态执行

    }
}
