package _20201122._10_1;

public class Persion {
    public String id;
    public String name;

    public Persion(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Persion persion = (Persion) obj;
        return this.id == persion.id;
    }
}
