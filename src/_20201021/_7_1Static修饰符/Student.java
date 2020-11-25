package _20201021._7_1Static修饰符;

public class Student {
    String name;
    int age;
    static String schoolName;
    public static void showScoreInfo(){
        System.out.println(schoolName+"的所有的学生学完40学分才能毕业！");
    }
}
