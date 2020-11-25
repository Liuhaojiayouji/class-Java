package _20200916._1649;

public class _1649 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = num1;
        num2 = 20;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("_________________________________________________________________");
        Student student1 = new Student();
        student1.name = "zhangsan";
        Student student2 = student1;
        student2.name = "list";
        System.out.println(student1.name);
        System.out.println(student2.name);

    }
}
