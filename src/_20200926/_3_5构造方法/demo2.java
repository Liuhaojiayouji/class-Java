package _20200926._3_5构造方法;

public class demo2 {
    public static void main(String[] args) {
        Student student=new Student("aasd",12);
        student.setAge(9999);
        System.out.println(student.getAge());
        student.speak();
    }
}
