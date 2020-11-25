package _20200926._3_5构造方法;

public class Student {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            this.age = 18;
            return;
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;
    private String name;

//    Student(int a, String nm) {
//        age = a;
//        name = nm;
//    }

    Student() {

    }

    Student(int age){
        this.age=age;
    }

    Student(String nm) {
        this.name = nm;
    }
    Student(String a,int b){
        this(a);
//        this(b);
    }
    public void speak() {
        System.out.println("name=" +
                name + ",age=" +
                age);
    }
}
