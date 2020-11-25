package _20201122._10_1;

public class Persion1 {
    public String id;
    public String name;

    public Persion1(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persion1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
