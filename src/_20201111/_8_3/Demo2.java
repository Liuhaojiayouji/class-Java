package _20201111._8_3;

import java.lang.reflect.Constructor;


public class Demo2 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("_20201111._8_3.Student");
        Constructor con1 = clazz.getConstructor();
        Constructor con2 = clazz.getConstructor(String.class, int.class);
        Student student = (Student) con1.newInstance();
        student.id=20;
        student.name="zhangsan";
        Student student2 = (Student) con2.newInstance("list",21);
        System.out.println(student);
        System.out.println(student2);
    }
}
