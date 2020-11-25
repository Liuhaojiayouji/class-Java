package _20201028._8_2;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        Class clazz1 = p1.getClass();
        System.out.println(clazz1);
        Class clazz2 = Person.class;
        System.out.println(clazz2);
        Class clazz3 = Class.forName("T9.Person");
        System.out.println(clazz3);
    }
}
