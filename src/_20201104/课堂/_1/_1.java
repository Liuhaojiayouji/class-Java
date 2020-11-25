package _20201104.课堂._1;

//final 不能被子类重写
//接口中方法，方法名前面的默认修饰符是public abstrate
public class _1 {
    public static void main(String[] args) {
        // School.saySchool();
        School s1 = new School();
        //   s1.saySchool();
    }
}

class School {
    final String name = "中桥大学";

    static public void study() {
        System.out.println("我们在上课");
    }

//    static public void saySchool() {
//        System.out.println("我的大学是上海，我的学校是" + name + "！");
//        study();
//    }
}

class Mychool extends School {
    public void say() {
        System.out.println(name);
    }
}

