package _20200930._4_6;

public class Student5 extends Persion5 {
    public Student5(String name, int age) {
        super(name, age);
    }

    public void printInfo() {
        System.out.println("name=" + getName() +
                ",age=" + getAge());
    }
}
