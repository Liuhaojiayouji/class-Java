package _20201122._10_2;

public class Demo04 {
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "hello world";
        String str3 = new String("hello world");
        String str4 = new String("hello world");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
        System.out.println(str3.equals(str4));

    }
}
