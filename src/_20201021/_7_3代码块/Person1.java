package _20201021._7_3代码块;

public class Person1 {
    private String name;
    private  int age;
    static {
        System.out.println("静态代码快执行了");
    }

    public Person1() {
        System.out.println("Person的无参数的构造函数执行了");
    }

    public Person1(int age) {
        this.age = age;
        System.out.println("public Person1(int age)参数的构造函数执行了");
    }
}
