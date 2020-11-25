package _20201122._10_1;

public class Demo01_1 {
    public static void main(String[] args) {
        Persion persion1 = new Persion("2016001","张三");
        Persion persion2 = new Persion("2016001","小三");
        System.out.println(persion1.equals(persion2));
    }
}
