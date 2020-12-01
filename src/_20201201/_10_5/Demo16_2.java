package _20201201._10_5;

public class Demo16_2 {
    public static void main(String[] args) {
        String str1 = "50";
        String str2 = "30.41";
        String str3 = "true";

        int num1 = Integer.parseInt(str1);
        double num2 = Double.parseDouble(str2);
        boolean b = Boolean.parseBoolean(str3);

        Integer num3 = Integer.valueOf(str1);
        Double num4 = Double.valueOf(str2);
        Boolean b1 = Boolean.valueOf(str3);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(b);
        System.out.println(b1);
    }
}
