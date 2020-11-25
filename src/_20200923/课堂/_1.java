package _20200923.课堂;

public class _1 {//主类也叫测试类，因为有main方法
    static String name;
    public static void main(String[] args) {
        System.out.println("hallo world");
        System.out.println("hallo" +
                "," +
                "world" +
                "!");
        String a = "Hallo";//这几个变量都叫局部变量，因为都在方法里面,没有默认初始值
        char b = ',';
        String c = "world";
        String d = "!";
        System.out.println(a + b + c + d);
        System.out.println(name);

        Student stu = new Student();
       stu.sayMyself();
    }

}

class Student {//类名首字母大写
    int age = 20;
    String name = "安娜";

    public void sayMyself() {
        System.out.println(name + "今年" + age + "岁了");
    }
}
