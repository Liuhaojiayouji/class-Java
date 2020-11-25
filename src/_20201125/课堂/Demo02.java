package _20201125.课堂;

import java.util.Objects;

public class Demo02 {
    public static void main(String[] args) {
        Person p1=new Person(100,"光头强");
        Person p2=new Person(100,"喜羊羊");
        System.out.println(p1.equals(p2));
    }
}
class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }

    @Override
    public boolean equals(Object o) {
        Person p1=(Person)o;
        return (p1.name==this.name);
    }


}
