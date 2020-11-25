package _20200923.三demo01;

import _20200923.三demo01.Student;

public class demo01 {
    public static void main(String[] args) {
        Student stu =new Student();
        stu.name="张三";
        stu.age=200;
        stu.gender="雌";
        System.out.println(stu.name+","+ stu.age+","+stu.gender);
    }
}
