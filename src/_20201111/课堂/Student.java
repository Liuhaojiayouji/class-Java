package _20201111.课堂;

public class Student {
    String name;
    int id;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student() {
    }
    public void display(){
        System.out.println(name+"的工号是"+id+"!");
    }
}
