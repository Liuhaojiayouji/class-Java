package _20201118.课堂;

public class Lector {
    public String name;
    public int id;

    public Lector(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void work() {
        System.out.println("在大学授课");
    }

    public void display() {
        System.out.println(this.name +
                "公号是" + this.id);
    }

    public void display(String name, int id) {
        System.out.println(name +
                "公号是" + +id);
    }
}
