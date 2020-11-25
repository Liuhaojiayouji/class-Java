package _20200923.课堂;

public class _2 {
    public static void main(String[] args) {
        Myschool myschool = new Myschool();
        System.out.println("我的学校是" + myschool.name +
                "面积" + myschool.mianji + myschool.danwei
        );
    }
}

class Myschool {
    String name = "中侨大学";
    double mianji = 548.90;
    String danwei = "亩";
}