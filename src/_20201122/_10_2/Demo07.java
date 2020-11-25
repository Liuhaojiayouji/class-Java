package _20201122._10_2;

public class Demo07 {
    public static void main(String[] args) {
        String str = "abcderADDDDFE";
        System.out.println(convert(str));
    }

    private static String convert(String str) {
        String start = str.substring(0, 1);
        String end = str.substring(1);
        String big = start.toUpperCase();
        String small = end.toLowerCase();
        return big + small;
    }
}
