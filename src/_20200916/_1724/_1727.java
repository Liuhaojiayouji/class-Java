package _20200916._1724;

public class _1727 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "张三";
        stu.age = 20;
        modify(stu);

        System.out.println(stu.name + "," + stu.age);
    }

    public static void modify(Student stu) {
        stu.name = "list";
        stu.age = 30;
    }
}
