package _20200923.三demo02;

public class demo02 {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("zhangsan");
        student.setAge(999);
        student.setGender("女");
        System.out.println(student.getName()+","+ student.getAge()+","+ student.getGender());
    }
}
