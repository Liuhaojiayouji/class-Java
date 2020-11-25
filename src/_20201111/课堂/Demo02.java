package _20201111.课堂;

import java.lang.reflect.Constructor;

public class Demo02 {
    public static void main(String[] args) throws Exception {
//        Class class1 = Student.class;//得到Student的Class对象
//        Constructor con1 = class1.getConstructor();//得到class1的无参构造方法
//        Student s1 = (Student) con1.newInstance();//得到Student的对象变量
//        s1.name = "guangtouqiang";
//        s1.id = 10;
//        s1.display();
//        s1.toString();
//        System.out.println(s1);
        Class class1 = Class.forName("_20201111.课堂.Student");
        Constructor con2 = class1.getDeclaredConstructor(String.class, int.class);
        Student s2 = (Student) con2.newInstance("喜羊羊", 29);
        s2.display();
        System.out.println(s2);
    }
}
