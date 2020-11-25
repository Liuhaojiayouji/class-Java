package _20201021._7_4;

public class Demo04 {
    public static void main(String[] args) {
        Person2 person=Tools.getPerson();
        Tools.method(person);
        Tools.method(new Person2());
    }
}
