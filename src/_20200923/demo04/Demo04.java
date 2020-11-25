package _20200923.demo04;

public class Demo04 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "zhangsan";
        stu.age = 20;
        modify(stu);
        System.out.println(stu.name + "," + stu.age);
    }

    public static void modify(Student stu) {
        stu.name = "list";
        stu.age = 30;
    }
}
