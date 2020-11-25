package _20201031;

public class _8_2 {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        Class clazz1 = p1.getClass();
        System.out.println(clazz1);
        Class clazz2 = Person.class;
        System.out.println(clazz2);
        Class clazz3 = Class.forName("_20201031.Person");
        System.out.println(clazz3);

    }
}

class Person {
    String name;
    int id;

    public void display() {
        System.out.println("姓名为：" + name + ",id为" + id);
    }
}
