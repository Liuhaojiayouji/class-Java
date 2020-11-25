package _20201021._7_3代码块;

public class Person {
    private String name;
    private int age;

    {
        System.out.println("构造代码块执行完了");
    }

    public Person() {
        System.out.println("无参构造函数执行完毕");
    }

    public Person(int age) {
        this.age = age;
        System.out.println(" public Person(int age)构造函数执行了");
    }
}
