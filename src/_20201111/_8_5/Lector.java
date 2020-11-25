package _20201111._8_5;

public class Lector {
    public String name;
    public int id;

    public Lector(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void work() {
        System.out.println("在大学工作");
    }

    public void displayInfo() {
        System.out.println(this.name + "是一个讲师" +
                "，标号是" + this.id);
    }
    public void displayInfo(String name,int id) {
        System.out.println(name + "是一个讲师" +
                "，标号是" + id);
    }
}
