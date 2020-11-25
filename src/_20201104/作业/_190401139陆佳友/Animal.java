package _20201104.作业._190401139陆佳友;

public class Animal {
    private int age;
    private String name;

    //构造代码块

    //静态代码块
    static {
        System.out.println("animal 静态代码块执行");
    }

    //无参
    public Animal() {
        System.out.println("无参构造方法执行");
        cat cat = new cat();
        cat.say();
    }

    //有参
    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("有参构造方法执行");
    }

    //方法
    public void eat() {
        System.out.println("chi");
    }


    //内部类
    class cat {
        void say() {
            System.out.println("miao miao");
        }
    }
}
